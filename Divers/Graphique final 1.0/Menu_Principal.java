/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
\n (Auteur Junayet Bhuiyan, Mathilde Giraudon, Victor Troussard)"
 */
package Graphique;
/**
 *
 * @author Junayet
 */

import Modèle.Connexion;
import javax.swing.*;import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class Menu_Principal extends JFrame implements ActionListener 
{
    
   
    private JButton buttonmaj;
    private JButton buttonquitter;
    private JButton buttonrecherche;
    private JButton buttonreporting;
    private JPanel jPanel1;
  

    public Menu_Principal() 
    {
        super("Bienvenue___Menu_Principal.java___");
        
        //Initialisation
        this.jPanel1 = new JPanel();
        JLabel Logoece = new JLabel();
        JLabel gtitre = new JLabel();
        JLabel ptitre = new JLabel();
        this.buttonrecherche = new JButton();
        this.buttonmaj = new JButton();
        this.buttonreporting = new JButton();
        this.buttonquitter = new JButton();
        JLabel fond = new JLabel();
        
        
        
        //Parametre de la page
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true);  
        
        jPanel1.setLayout(null);

        Logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/logoECE.jpg"))); // NOI18N
        jPanel1.add(Logoece);
        Logoece.setBounds(20, 20, 270, 60);

        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Bienvenue sur le site de gestion de l'ECE !");
        jPanel1.add(gtitre);
        gtitre.setBounds(100, 100, 530, 40);

        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Menu");
        jPanel1.add(ptitre);
        ptitre.setBounds(320, 150, 80, 50);

        buttonrecherche.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        buttonrecherche.setText("Recherche");
        jPanel1.add(buttonrecherche);
        buttonrecherche.setBounds(290, 210, 130, 50);

        buttonmaj.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        buttonmaj.setText("Mise à jour");
        jPanel1.add(buttonmaj);
        buttonmaj.setBounds(290, 270, 130, 50);

        buttonreporting.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        buttonreporting.setText("Reporting");
        jPanel1.add(buttonreporting);
        buttonreporting.setBounds(290, 330, 130, 50);

        buttonquitter.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        buttonquitter.setText("Quitter");
        jPanel1.add(buttonquitter);
        buttonquitter.setBounds(290, 390, 130, 50);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/imagefond.jpg"))); // NOI18N
        jPanel1.add(fond);
        fond.setBounds(0, -6, 700, 510);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 510);

        pack();
        
        //actions des boutons
        this.buttonquitter.addActionListener(this);
        this.buttonrecherche.addActionListener(this);
        this.buttonmaj.addActionListener(this);
        this.buttonreporting.addActionListener(this);
        
        // set border for the panel
        jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Page de Recherche"));
        add(jPanel1);
        
        pack();
        
    }
    
    
    
   
    @Override
    public  void actionPerformed(ActionEvent event)
    {
        if(event.getSource()== buttonrecherche)
        {
            this.dispose();
            new Recherche();
        }
        if(event.getSource()== buttonmaj)
        {
            this.dispose();
            new Maj();
        }
        if(event.getSource()== buttonreporting)
        {
            this.dispose();
            new Reporting();
        }
        if(event.getSource()== buttonquitter)
        {           
            System.exit(0);
        }
    }
}



