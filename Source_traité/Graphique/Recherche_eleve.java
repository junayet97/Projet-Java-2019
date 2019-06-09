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
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import Modèle.*;
import Controleur.*;
import java.util.ArrayList;

 
/**
 * This program demonstrates how to use JPanel in Swing.
 * @author mathi
 */
public class Recherche_eleve extends JFrame implements ActionListener
{
    private JPanel jPanel1;
    private JTextField caseid;
    private JButton buttonvalider;
    private JButton buttonretour;
    private JButton buttontout;

    public Recherche_eleve() 
    {
        super("Recherches Informations___Recherche_eleve.java___");
        
        //Initialisation
        this.jPanel1 = new JPanel();
        
        JLabel logoece = new JLabel();
        JLabel fond = new JLabel();
        JLabel ptitre = new JLabel();
        JLabel gtitre = new JLabel();
        
        this.caseid = new JTextField();
        
        this.buttonvalider = new JButton();
        this.buttonretour = new JButton();
        this.buttontout=new JButton();
        
        
        //Parametre de la page
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true); 
        
        jPanel1.setLayout(null);
        
        //Le logo
        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        logoece.setText("jLabel1");
        jPanel1.add(logoece);
        logoece.setBounds(19, 11, 266, 67);
        
        //Le petit titre
        ptitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Rentrer un identifiant :");
        jPanel1.add(ptitre);
        ptitre.setBounds(170, 140, 310, 50);
        
        //Le grand titre
        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Recherche d'un élève");
        jPanel1.add(gtitre);
        gtitre.setBounds(330, 30, 330, 50);
               
        //La case pour rentrer id
        jPanel1.add(caseid);
        caseid.setBounds(270, 250, 200, 20);
        
        //Le bouton de la validation
        buttonvalider.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonvalider.setText("Valider");
        jPanel1.add(buttonvalider);
        buttonvalider.setBounds(410, 230, 100, 31);
        
        //Case id
        
        jPanel1.add(caseid);
        caseid.setBounds(160, 230, 200, 30);
        
        //Le bouton de retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(270, 360, 100, 31);
        
        //Le bouton de tout eleve
        buttontout.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttontout.setText("Tout eleves");
        jPanel1.add(buttontout);
        buttontout.setBounds(245, 300, 150, 30);
        
        //Le fond
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("Recher");
        fond.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(fond);
        fond.setBounds(0, 0, 700, 500);
         
        // faire du bouton une action
        buttonvalider.addActionListener(this);
        buttonretour.addActionListener(this);
        caseid.addActionListener(this);
        buttontout.addActionListener(this);
         
        // set border for the panel
        jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Informations Elèves"));
         
        // add the panel to this frame
        add(jPanel1);
         
        pack();
       
    }
    @Override
    public  void actionPerformed(ActionEvent event)
    {if(event.getSource()== buttonvalider )
                     {
        try{
            Connexion co= new Connexion("java2019","root","");
            String get=caseid.getText();
            int id=Integer.parseInt(get.trim());
            DAO<Eleve> e=new DAO_Eleve(co);
            int test=0;
            for(int i=0;i<e.getids().size();i++) // on cherche si l'éleve existe
                {
                        if( Integer.parseInt(e.getids().get(i).trim())== id) 
                           {
                               test=1;
                           } 
                }
    
             if (test==1) // si l'eleve existe
              {
                  
                        this.dispose();
                        ArrayList<String> inf=recherche_eleve(id);
                        String num=inf.get(0);
                        String nom=inf.get(1);
                        String prenom=inf.get(2);
                        
                        new Recherche_eleve_info(num,nom, prenom);
                     
        
              }
             else JOptionPane.showMessageDialog(jPanel1, "L'identifiant est inconnu");
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
       
    }
        
        if(event.getSource()==buttontout)
        {
            this.dispose();
            new Recherche_eleve_tout(affiche_eleve());
        }
        if(event.getSource()==buttonretour)
        {
            this.dispose();
            new Recherche();
        }
    }
     
    /**
  * recherche d'un eleve à partir des des parametres renseignés:
     * @param id_eleve classe de l'eleve
    
     * @return  1 si l'eleve est trouvé, 0 si l'eleve n'existe pas*/
    
    public static ArrayList<String> recherche_eleve(int id_eleve)
{   
	 Eleve eleve=new Eleve(id_eleve);
	 try
	  {
         Connexion co= new Connexion("java2019","root","");
         DAO<Eleve> e=new DAO_Eleve(co);
         ArrayList<String> test=e.find(id_eleve);
         if(test!=null & test.size()!=0) // si l'eleve est trouvé
         {
             ArrayList<String> infos = new  ArrayList<String>();
             infos.add(test.get(0).split(",")[0].trim()); // id de l'eleve
             infos.add(test.get(0).split(",")[1].trim()); // nom de l'eleve
             infos.add(test.get(0).split(",")[2].trim()); // prenom de l'eleve
             return infos;
         }
         else 
         {
             System.out.println("eleve non trouvé");
             return null;
         }
      }

    catch(Exception e)
     {
        e.printStackTrace();
        return null;
     } 
}
    
    /**Renvoi le tableau de l'ensemble des eleves enregistré dans la bdd**/
public static Object[][]  affiche_eleve(){
try
      {
         Connexion co= new Connexion("java2019","root","");
         
         
         ArrayList<String> el = co.remplirChampsRequete("SELECT personne.id_personne, nom_pers, prenom_pers, id_inscription,anneescolaire.id_anneescolaire, nom_classe FROM personne, inscription,classe, anneescolaire WHERE inscription.id_personne=personne.id_personne AND inscription.id_classe=classe.id_classe AND anneescolaire.id_anneescolaire=classe.id_anneescolaire ORDER BY anneescolaire.id_anneescolaire");
         int x=el.size();
         int y=el.get(0).split(",").length;
         Object tabel[][]= new Object[x][y];
         for (int i=0; i<x;i++){
            for(int j=0;j<y;j++){
                   tabel[i][j]=el.get(i).split(",")[j];
            }
         }
         return tabel;
       }

    catch(Exception e)
     {
        e.printStackTrace();
        return null;
     } 
 }
}
