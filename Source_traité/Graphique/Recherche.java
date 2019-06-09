/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphique;

/**
 *
 * @author mathi
 */ 
import Modèle.Connexion;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import Modèle.*;
import Controleur.*;
import java.util.*;
 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Recherche extends JFrame implements ActionListener 
{
    
    private JPanel jPanel1;
    private JButton buttonprof;
    private JButton buttoneleve;
    private JButton buttonautres;
    private JButton buttonretour;

    
    
    public Recherche()
    {
        
        super("Recherche___Recherche.java");
        //Inititalisation
        
        this.jPanel1 = new JPanel();
        
        JLabel logoece  = new JLabel();
        JLabel titre = new JLabel();
        JLabel titrepers = new JLabel();
        JLabel titredonnes = new JLabel();
        JSeparator jSeparator1 = new JSeparator();
        
        this.buttonprof= new JButton();
        this.buttoneleve = new JButton();
        this.buttonretour = new JButton();
        this.buttonautres = new JButton();
        JLabel fonds = new JLabel();
        
        //Parametrage de la page
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true); 
        
        jPanel1.setLayout(null);

        //logo
        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        logoece.setText("jLabel1");
        jPanel1.add(logoece);
        logoece.setBounds(10, 10, 270, 60);

        //Titre
        titre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Recherches d'informations");
        jPanel1.add(titre);
        titre.setBounds(330, 40, 330, 30);

        //bouton prof
        buttonprof.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonprof.setText("Professeurs");
        jPanel1.add(buttonprof);
        buttonprof.setBounds(180, 170, 120, 50);

        //Bouton eleve
        buttoneleve.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttoneleve.setText("Elèves");
        jPanel1.add(buttoneleve);
        buttoneleve.setBounds(360, 170, 120, 50);

        //button retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(310, 410, 80, 30);

        //bouton autre
        buttonautres.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonautres.setText("Autre");
        jPanel1.add(buttonautres);
        buttonautres.setBounds(360, 290, 120, 50);

        //titre 
        titrepers.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titrepers.setForeground(new java.awt.Color(255, 255, 255));
        titrepers.setText("Rechercher des informations sur une personnes :");
        jPanel1.add(titrepers);
        titrepers.setBounds(90, 120, 460, 40);

        //titre
        titredonnes.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titredonnes.setForeground(new java.awt.Color(255, 255, 255));
        titredonnes.setText("Autres types de recherche :");
        jPanel1.add(titredonnes);
        titredonnes.setBounds(90, 300, 300, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(90, 260, 450, 10);

        //le fond
        fonds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fonds.setText("jLabel3");
        jPanel1.add(fonds);
        fonds.setBounds(-10, 0, 710, 500);

        
        // faire du bouton une action
        this.buttonautres.addActionListener(this);
        this.buttoneleve.addActionListener(this);
        this.buttonprof.addActionListener(this);
        this.buttonretour.addActionListener(this);
        
        
        // set border for the panel
        jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Page de Recherche"));
      
        
        // add the panel to this frame
        add(jPanel1);
 
        pack();
      
    }
   
    @Override
    public  void actionPerformed(ActionEvent event)
    {
        if(event.getSource()== buttonprof)
        {
            this.dispose();
            new Recherche_prof(affiche_prof());
        } 
        if (event.getSource() ==buttonautres)
        {
            this.dispose();
            new Recherche_autre(affiche_annee(),affiche_enseignement(),affiche_classe(),affiche_discipline());
            
        }
        if(event.getSource()== buttoneleve)
        {
            this.dispose();
            new Recherche_eleve();
        }
        if(event.getSource()== buttonretour)
        {
            this.dispose();
            new Menu_Principal();
        }
    }
    
/**
 * Renvoi le tableau de l'ensemble des enseignant enregistré dans la bdd
     * @return tableau de l'ensemble des enseignant enregistré
 **/  
  public static Object[][]  affiche_prof(){
try
      {
         Connexion co= new Connexion("java2019","root","");
         
         
         ArrayList<String> prof= co.remplirChampsRequete("SELECT personne.id_personne, nom_pers, prenom_pers, id_ens, nom_discipline, nom_classe FROM personne, enseignement,discipline, classe WHERE enseignement.id_personne=personne.id_personne AND enseignement.id_classe=classe.id_classe AND enseignement.id_discipline=discipline.id_discipline");
         int x=prof.size();
         int y=prof.get(0).split(",").length;
         Object tabprof[][]= new Object[x][y];
         for (int i=0; i<x;i++){
            for(int j=0;j<y;j++){
                   tabprof[i][j]=prof.get(i).split(",")[j];
            }
         }
         return tabprof;
       }

    catch(Exception e)
     {
        e.printStackTrace();
        return null;
     } 
 }  
   
  /**
Renvoi le tableau de l'ensemble des annee enregistré dans la bdd**/
public static Object[][]  affiche_annee(){
try
      {
         Connexion co= new Connexion("java2019","root","");
         
         
         ArrayList<String> annee = co.remplirChampsRequete("SELECT * FROM anneescolaire WHERE 1");
         int x=annee.size();
         int y=annee.get(0).split(",").length;
         Object tabann[][]= new Object[x][y];
         for (int i=0; i<x;i++){
            for(int j=0;j<y;j++){
                   tabann[i][j]=annee.get(i).split(",")[j];
            }
         }
         return tabann;
       }

    catch(Exception e)
     {
        e.printStackTrace();
        return null;
     } 
 }
  /**
Renvoi le tableau de l'ensemble des enseignements enregistré dans la bdd**/
public static Object[][]  affiche_enseignement(){
try
      {
         Connexion co= new Connexion("java2019","root","");
         
         
         ArrayList<String> ens = co.remplirChampsRequete("SELECT id_ens, nom_classe, enseignement.id_personne, nom_discipline  FROM enseignement, classe, discipline WHERE classe.id_classe=enseignement.id_classe AND enseignement.id_discipline=discipline.id_discipline ");
         int x=ens.size();
         int y=ens.get(0).split(",").length;
         Object tabens[][]= new Object[x][y];
         for (int i=0; i<x;i++){
            for(int j=0;j<y;j++){
                   tabens[i][j]=ens.get(i).split(",")[j];
            }
         }
         return tabens;
       }

    catch(Exception e)
     {
        e.printStackTrace();
        return null;
     } 
 }

public static Object[][]  affiche_classe(){
try
      {
         Connexion co= new Connexion("java2019","root","");
         
         
         ArrayList<String> classe = co.remplirChampsRequete("SELECT id_classe, classe.id_anneescolaire, nom_classe FROM classe, anneescolaire WHERE anneescolaire.id_anneescolaire=classe.id_anneescolaire");
         int x=classe.size();
         int y=classe.get(0).split(",").length;
         Object tabcla[][]= new Object[x][y];
         for (int i=0; i<x;i++){
            for(int j=0;j<y;j++){
                   tabcla[i][j]=classe.get(i).split(",")[j];
            }
         }
         return tabcla;
       }

    catch(Exception e)
     {
        e.printStackTrace();
        return null;
     } 
 }

public static Object[][]  affiche_discipline(){
try
      {
         Connexion co= new Connexion("java2019","root","");
         
         
         ArrayList<String> dis = co.remplirChampsRequete("SELECT * FROM discipline WHERE 1");
         int x=dis.size();
         int y=dis.get(0).split(",").length;
         Object dp[][]= new Object[x][y];
         for (int i=0; i<x;i++){
            for(int j=0;j<y;j++){
                   dp[i][j]=dis.get(i).split(",")[j];
            }
         }
         return dp;
       }

    catch(Exception e)
     {
        e.printStackTrace();
        return null;
     } 
 }
}




