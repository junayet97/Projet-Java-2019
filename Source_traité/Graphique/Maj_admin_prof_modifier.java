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
import Modèle.*;
import Controleur.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Maj_admin_prof_modifier extends JFrame implements ActionListener
{
   
   
    private JButton buttonmodifier;
    private JButton buttonretour;
    private JTextField case_IDenseignant;
    private JTextField case_nom;
    private JTextField case_prenom;
    
    
    private javax.swing.JPanel jPanel1;
    
    public Maj_admin_prof_modifier ()
    {
        super("Mise à jour enseignant___Maj_prof_modifier.java__");
        
        this.jPanel1 = new JPanel();
        JLabel logoece = new JLabel();
        JLabel gtitre = new JLabel();
        JLabel ptitre = new JLabel();
        JLabel titre = new JLabel();
        JLabel nom = new JLabel();
        JLabel prenom = new JLabel();
        JLabel IDenseignement = new JLabel();
        this.case_nom = new JTextField();
        this.case_prenom = new JTextField();
        this.case_IDenseignant = new JTextField();
        this.buttonmodifier = new JButton();
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
        logoece.setBounds(20, 30, 270, 60);

        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Mise à jour Enseignant");
        jPanel1.add(gtitre);
        gtitre.setBounds(380, 20, 290, 44);

        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Compte Administrateur");
        jPanel1.add(ptitre);
        ptitre.setBounds(370, 60, 300, 40);

        titre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Modifier un enseignant :");
        jPanel1.add(titre);
        titre.setBounds(210, 150, 250, 33);

        nom.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 255, 255));
        nom.setText("Nom :");
        jPanel1.add(nom);
        nom.setBounds(220, 210, 60, 20);

        prenom.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        prenom.setForeground(new java.awt.Color(255, 255, 255));
        prenom.setText("Prénom :");
        jPanel1.add(prenom);
        prenom.setBounds(200, 250, 80, 20);

        IDenseignement.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        IDenseignement.setForeground(new java.awt.Color(255, 255, 255));
        IDenseignement.setText("ID Enseignant :");
        jPanel1.add(IDenseignement);
        IDenseignement.setBounds(173, 290, 100, 20);

        case_nom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jPanel1.add(case_nom);
        case_nom.setBounds(280, 210, 140, 20);

        case_prenom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jPanel1.add(case_prenom);
        case_prenom.setBounds(280, 250, 140, 20);

        case_IDenseignant.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jPanel1.add(case_IDenseignant);
        case_IDenseignant.setBounds(280, 290, 140, 20);

        buttonmodifier.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonmodifier.setText("Modifier");
        jPanel1.add(buttonmodifier);
        buttonmodifier.setBounds(470, 250, 90, 31);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(290, 380, 90, 31);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel8");
        fond.setMaximumSize(new java.awt.Dimension(700, 500));
        fond.setMinimumSize(new java.awt.Dimension(700, 500));
        fond.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.add(fond);
        fond.setBounds(0, 0, 700, 500);

        // faire du bouton une action
        this.buttonretour.addActionListener(this);
        this.buttonmodifier.addActionListener(this);
        this.case_nom.addActionListener(this);
        this.case_prenom.addActionListener(this);
        this.case_IDenseignant.addActionListener(this);
        
        // set border for the panel
        
        jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Page de Connexion"));
      
        
        // add the panel to this frame
        add(jPanel1);
 
        pack();
    }

    @Override
    public  void actionPerformed(ActionEvent event)
    {
        
         if(event.getSource()== buttonmodifier )
         {
        try{
            Connexion co= new Connexion("java2019","root","");
            
            String get2=case_IDenseignant.getText().trim();
            String get3=case_nom.getText().trim();
            String get4=case_prenom.getText().trim();
      
            
            if((get2.equals(""))||(get3.equals(""))||(get4.equals("")))
            {
                JOptionPane.showMessageDialog(jPanel1, "L'un des champs est vide!");
            }
                else
            {
                   
                 int id2=Integer.parseInt(get2); 
              
                modif_enseignant(id2,get3,get4);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
       
    }
        if(event.getSource()== buttonretour)
        {
            this.dispose();
            new Maj_admin_prof();
        }
    }
    /**
  * Modifie les info sur un enseignant à partir de l'id de l'enseignant
     * @param id_enseignant id de l'enseignant
     * @param nom nouveau nom
     * @param prenom nouveau prenom
     * @return  1 si c bon, 2 si l'enseignant n'est pas trouvé*/
    
public  int modif_enseignant(int id_enseignant,String nom, String prenom)
{   
    Enseignant enseignant=new Enseignant(id_enseignant,nom, prenom);
        
    
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Enseignant> e=new DAO_Enseignant(co);
    int test=0;
    for(int i=0;i<e.getids().size();i++) // on cherche si l'enseignant existe
    {
        if( Integer.parseInt(e.getids().get(i).trim())== id_enseignant) 
        {
            test=1;
        } 
    }
    
    if (test==1) // si l'eleve existe
    {
        boolean b= e.update(enseignant);
       JOptionPane.showMessageDialog(jPanel1,"Modif effectué avec succés");
       
        return 1;
    }
    
    else{
       JOptionPane.showMessageDialog(jPanel1,"Modif echoué, l'enseignant n'existe pas!");
    return 2;
    }
    
   
    }
 
    catch(ClassNotFoundException | NumberFormatException | SQLException e){
        
        return 0;}
    
     
}


    


}
