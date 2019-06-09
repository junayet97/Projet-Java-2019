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
import Controleur.*;
import Modèle.*;
import static Graphique.Recherche_eleve.recherche_eleve;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Maj_admin_eleve_ajouter extends JFrame implements ActionListener
{
    private JPanel jPanel1;
    
    private JButton buttonajouter;
    private javax.swing.JButton buttonretour;
    
    private JTextField case_IDclasse;
    private JTextField case_IDeleve;
    private JTextField case_nom;
    private JTextField case_prenom;
    
    
    public Maj_admin_eleve_ajouter()
    {
        this.jPanel1 = new javax.swing.JPanel();
        
        JLabel logoece = new JLabel();
        JLabel gtitre = new JLabel();
        JLabel ptitre = new JLabel();
        JLabel titre = new JLabel();
        JLabel nom = new JLabel();
        JLabel prenom = new JLabel();
        JLabel IDeleve = new JLabel();
        JLabel IDclasse = new JLabel();
        this.case_nom = new JTextField();
        this.case_prenom = new JTextField();
        this.case_IDeleve = new JTextField();
        this.case_IDclasse = new JTextField();
        this.buttonajouter = new JButton();
        this.buttonretour = new JButton();
        JLabel fond = new JLabel();

        //Parametrage de la page
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(null);

        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(30, 20, 270, 60);

        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Mise à jour élève");
        jPanel1.add(gtitre);
        gtitre.setBounds(410, 30, 220, 30);

        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Compte Administrateur");
        jPanel1.add(ptitre);
        ptitre.setBounds(370, 60, 300, 50);

        titre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Ajouter un élève :");
        jPanel1.add(titre);
        titre.setBounds(250, 150, 180, 33);

        nom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 255, 255));
        nom.setText("Nom :");
        jPanel1.add(nom);
        nom.setBounds(230, 200, 50, 23);

        prenom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        prenom.setForeground(new java.awt.Color(255, 255, 255));
        prenom.setText("Prénom :");
        jPanel1.add(prenom);
        prenom.setBounds(210, 230, 70, 23);

        IDeleve.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDeleve.setForeground(new java.awt.Color(255, 255, 255));
        IDeleve.setText("ID Elève :");
        jPanel1.add(IDeleve);
        IDeleve.setBounds(210, 260, 70, 23);

        IDclasse.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDclasse.setForeground(new java.awt.Color(255, 255, 255));
        IDclasse.setText("ID Classe : ");
        jPanel1.add(IDclasse);
        IDclasse.setBounds(210, 290, 70, 23);
        jPanel1.add(case_nom);
        case_nom.setBounds(280, 200, 130, 20);
        jPanel1.add(case_prenom);
        case_prenom.setBounds(280, 230, 130, 20);

        
        jPanel1.add(case_IDeleve);
        case_IDeleve.setBounds(280, 260, 130, 20);
        jPanel1.add(case_IDclasse);
        case_IDclasse.setBounds(280, 290, 130, 20);

        buttonajouter.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonajouter.setText("Ajouter");;
        jPanel1.add(buttonajouter);
        buttonajouter.setBounds(470, 240, 110, 31);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(310, 370, 100, 31);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel9");
        jPanel1.add(fond);
        fond.setBounds(-6, 0, 710, 510);

        // faire du bouton et champs une action
        this.buttonajouter.addActionListener(this);
        this.buttonretour.addActionListener(this);
        this.case_IDclasse.addActionListener(this);
        this.case_IDeleve.addActionListener(this);
        this.case_nom.addActionListener(this);
        this.case_prenom.addActionListener(this);
        
        // set border for the panel
        jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Page de Recherche"));
      
        
        // add the panel to this frame
        add(jPanel1);

        pack();
    }
    @Override
    public void actionPerformed(ActionEvent event) 
    {
        if(event.getSource()== buttonajouter )
         {
        try{
            Connexion co= new Connexion("java2019","root","");
            String get=case_IDclasse.getText().trim();
            String get2=case_IDeleve.getText().trim();
            String get3=case_nom.getText().trim();
            String get4=case_prenom.getText().trim();
            
            if((get.equals(""))||(get2.equals(""))||(get3.equals(""))||(get4.equals("")))
            {
                JOptionPane.showMessageDialog(jPanel1, "L'un des champs est vide!");
            }
                else
            {
                 int id1=Integer.parseInt(get);   
                 int id2=Integer.parseInt(get2);  
                 ajout_eleve(id1,id2, get3, get4);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
       
    }
        if (event.getSource() == buttonretour)
        {
            this.dispose();
            new Maj_admin_eleve();
        } 
    }
    
    
   /**
  * Ajout un eleve à partir des des parametres renseignés:
     * @param id_classe classe de l'eleve
     * @param id_eleve id de l'eleve
     * @param nom son nom
     * @param prenom son prenom
     * @return  1 si c bon, 2 si l'eleve existe deja*/
    
    public int ajout_eleve(int id_classe,int id_eleve, String nom, String prenom)
{   
	Eleve eleve=new Eleve(id_eleve,nom, prenom);
        
   	Inscription ins=new Inscription(id_classe,id_eleve);
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Eleve> e=new DAO_Eleve(co);
    DAO<Classe> c=new DAO_Classe(co);
    DAO<Inscription> in=new DAO_Inscription(co);
    int test=0;
    int test2=0;
    for(int i=0;i<e.getids().size();i++) // on cherche si l'éleve n'existe pas déja
    {
        if( Integer.parseInt(e.getids().get(i).trim())== id_eleve) 
        {
           
            test=1;
        } 
    }
    for(int i=0;i<c.getids().size();i++) // on cherche si la existe 
    {
        if( Integer.parseInt(c.getids().get(i).trim())== id_classe) 
        {
           
            test2=1;
        } 
    }
    
    if (test==0 & test2==1) // si l'eleve n'existe pas deja et que la classe existe
    {
        e.create(eleve); 
        in.create(ins);
        JOptionPane.showMessageDialog(jPanel1, "Ajout effectué avec succés");
        return 1;
    }
    
    else{
        if(test==1) JOptionPane.showMessageDialog(jPanel1, "Ajout echoué, l'éleve existe déja!");
        if(test2==0) JOptionPane.showMessageDialog(jPanel1, "Ajout echoué, la classe n'existe pas!");
    return 2;
    }
    
   
    }
 
    catch(Exception e){
        
        e.printStackTrace();
        return 0;}
}
   
    
}
    

