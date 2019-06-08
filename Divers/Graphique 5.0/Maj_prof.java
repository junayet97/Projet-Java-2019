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


 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Maj_prof extends JFrame implements ActionListener
{
    private JPanel jPanel1;
    private JButton buttonbulletins;
    private JButton buttonevaluation;
    private JButton buttonretour;

    public Maj_prof()
    {
        super("Compte Professeur___Maj_prof.java___");
       
       //Initialisation
        this.jPanel1 = new JPanel();
       
        JLabel logoece = new JLabel();
        JLabel gtitre = new JLabel();
        JLabel ptitre = new JLabel();
        
        this.buttonbulletins = new JButton();
        this.buttonevaluation = new JButton();
        this.buttonretour = new JButton();
        JLabel fond = new JLabel();
        
        //Parametrage de la page
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true);
        
        jPanel1.setLayout(null);
        
        //Le Logo
        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        logoece.setText("jLabel1");
        jPanel1.add(logoece);
        logoece.setBounds(20, 30, 270, 60);

        //Le grand titre
        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Compte Enseignant");
        jPanel1.add(gtitre);
        gtitre.setBounds(390, 30, 260, 40);

        //Le petit Titre
        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Que souhaitez-vous mettre à jour :");
        jPanel1.add(ptitre);
        ptitre.setBounds(120, 140, 440, 44);

        //Bouton pour les bulletins
        buttonbulletins.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonbulletins.setText(" Champs Bulletins");
        jPanel1.add(buttonbulletins);
        buttonbulletins.setBounds(160, 220, 140, 50);

        //Bouton pour les evaluations
        buttonevaluation.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonevaluation.setText("Evaluations");
        jPanel1.add(buttonevaluation);
        buttonevaluation.setBounds(400, 220, 130, 50);

        //Bouton de retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(300, 370, 80, 30);

        //Le fonds
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel4");
        jPanel1.add(fond);
        fond.setBounds(0, 0, 710, 500);
        
        // faire du bouton une action
        this.buttonbulletins.addActionListener(this);
        this.buttonevaluation.addActionListener(this);
        this.buttonretour.addActionListener(this);
        
        
        // set border for the panel
        jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Page de Recherche"));
      
        
        // add the panel to this frame
        add(jPanel1);

        

        pack();
    }
    

    @Override
    public void actionPerformed(ActionEvent event) 
    {
        if (event.getSource() == buttonbulletins)
        {
            this.dispose();
            new Maj_prof_bulletin();
        }
        if (event.getSource() == buttonevaluation)
        {
            this.dispose();
            new Maj_prof_evaluation();
        }
        if (event.getSource() == buttonretour)
        {
            this.dispose();
            new Menu_Principal();
        }
    }
    
}
