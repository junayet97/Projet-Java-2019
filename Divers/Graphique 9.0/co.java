/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Auteur Junayet Bhuiyan, Mathilde Giraudon, Victor Troussard)
 */
package Graphique;

/**
 *
 * @author Junayet et Mathilde
 */
import Modèle.Connexion;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class co extends JFrame implements ActionListener
{ 
    private JPanel jPanel1;
    private JTextField casebdd;
    private JPasswordField casemdp;
    private JButton buttonLogin;       
    
    String get1,get2;

    public co() 
    {
        super("Connexion");
        //Initialisation
        this.jPanel1 = new JPanel(); // le panel cadre de la fenetre
 
        JLabel gtitre = new JLabel("Projet Java 2019");
        JLabel ptitre = new JLabel("Connectez-vous :");
        JLabel nombdd = new JLabel("Nom de la Bdd :");
        JLabel mdp = new JLabel("Mot de passe :");
        
        this.casebdd = new JTextField(20);
        this.casemdp = new JPasswordField(20);
        
        this.buttonLogin = new JButton("Connexion");
        
        JLabel auteur = new JLabel("Auteurs :");
        JLabel auteur1 = new JLabel("Mathilde GIRAUDON");
        JLabel auteur2 = new JLabel("Junayet BHUIYAN");
        JLabel auteur3 = new JLabel("Victor TROUSSARD");
        
        JLabel fondimage = new JLabel();
        
        //Parametrage de la page
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true); 
        
        
        jPanel1.setLayout(null);
        
        //Le Grand Titre
        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(gtitre);
        gtitre.setBounds(139, 11, 456, 86);
        
        //Le Petit Titre
        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(ptitre);
        ptitre.setBounds(239, 108, 206, 35);
        
        //Le nom de la bdd
        nombdd.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        nombdd.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(nombdd);
        nombdd.setBounds(204, 182, 151, 33);
        
        //Le mdp
        mdp.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        mdp.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(mdp);
        mdp.setBounds(234, 225, 130, 33);
        
        //La case pour entre la bdd
        jPanel1.add(casebdd);
        casebdd.setFont(new java.awt.Font("Segoe Print", 0, 12));
        casebdd.setBounds(373, 191, 110, 20);
        
        //La case pour rentre le mdp
        jPanel1.add(casemdp);
        casemdp.setFont(new java.awt.Font("Segoe Print", 0, 12));
        casemdp.setBounds(373, 230, 110, 20); 
        
        
        //Le bouton de connexion
        buttonLogin.setBackground(new java.awt.Color(204, 204, 255));
        buttonLogin.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jPanel1.add(buttonLogin);
        buttonLogin.setBounds(290, 280, 160, 41);
        
        //les autres
        auteur.setFont(new java.awt.Font("Segoe Print", 2, 12)); // NOI18N
        auteur.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(auteur);
        auteur.setBounds(330, 330, 58, 30);

        //auteur1
        auteur1.setFont(new java.awt.Font("Segoe Print", 2, 12)); // NOI18N
        auteur1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(auteur1);
        auteur1.setBounds(290, 390, 135, 23);
        
        //auteur2
        auteur2.setFont(new java.awt.Font("Segoe Print", 2, 12)); // NOI18N
        auteur2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(auteur2);
        auteur2.setBounds(300, 360, 127, 23);

        //auteur3
        auteur3.setFont(new java.awt.Font("Segoe Print", 2, 12)); // NOI18N
        auteur3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(auteur3);
        auteur3.setBounds(290, 420, 146, 23);

        //image de fond
        fondimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/FondEspace.jpg"))); // NOI18N
        jPanel1.add(fondimage);
        fondimage.setBounds(0, 4, 700, 500);
        
      
         // faire du bouton une action
        this.buttonLogin.addActionListener(this);
        this.casebdd.addActionListener(this);
        this.casemdp.addActionListener(this);
        
        // set border for the panel
        
        jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Page de Connexion"));
      
        
        // add the panel to this frame
        add(jPanel1);
 
        pack();
    
        
    }
 
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent event) 
    {
        try 
        {  
            get1 = casebdd.getText();
            get2 = casemdp.getText();
            if(get1.equals("java2019") & get2.equals("root"))
            {  
                Connexion co = new Connexion("java2019","root","");
                if(event.getSource()== buttonLogin )
                {
                    this.dispose();
                    new Menu_Principal();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(jPanel1, "Erreur : Nom de la BDD ou Mote de passe érroné"); 
            }
        }
        catch(Exception exc) 
        {
            JOptionPane.showMessageDialog(jPanel1, "Erreur: BDD introuvable");
        }
    }
    public String getBdd()
    {
        return get1;
    }
 
    public String getLog()
    {
        return get2;
    }
}
