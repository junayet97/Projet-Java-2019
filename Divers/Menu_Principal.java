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
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;




public class Menu_Principal extends JFrame implements ActionListener 
{
    private JButton recherche;
    private JButton miseaj;
    private JButton reporting;
    private JButton quitter;
    Container fenetre;
    
   
    
    /*
    JPanel tete = new JPanel();
    JLabel titre = new JLabel("Bienvenue dans la page de gestion de l'école");
    
    JLabel tag = new JLabel("MENU PRINCIPAL");
    JPanel panel= new JPanel();
    
    JButton Bouton = new JButton("Recherches");
    JButton Bouton2 = new JButton("Mise à Jour");
    JButton Bouton3 = new JButton("Reporting");
    JButton Bouton4 = new JButton("Quitter");*/
    

    public Menu_Principal() 
    {
        //Initialisation
        JPanel page = new JPanel();
        JPanel cadre =new JPanel();
        
        JLabel fond = new JLabel();
        JLabel gtitre = new JLabel();
        JLabel titremenu = new JLabel();
        JLabel logo = new JLabel();

        this.recherche = new JButton();
        this.miseaj = new JButton();
        this.reporting = new JButton();
        this.quitter = new JButton();
        
        
        
        //Parametre de la page
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true);  
        
        
        
        //La page 
        page.setLayout(null);
        
        
        //Le grand titre
        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Bienvenue sur le site de Gestion de l'ECE !");
        page.add(gtitre);
        gtitre.setBounds(90, 120, 520, 30);
        
        //Titre du menu
        titremenu.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        titremenu.setForeground(new java.awt.Color(204, 204, 255));
        titremenu.setText("Menu");
        page.add(titremenu);
        titremenu.setBounds(300, 170, 80, 40);
        
        //Petit cadre
        cadre.setLayout(null);
        cadre.setBackground(new java.awt.Color(133, 117, 179));
        cadre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        page.add(cadre);
        cadre.setBounds(260, 220, 160, 210);
        
        javax.swing.GroupLayout cadreLayout = new javax.swing.GroupLayout(cadre);
        cadre.setLayout(cadreLayout);
        
        
        
        
        //LOGO ECE
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        logo.setText("jLabel4");
        logo.setMaximumSize(new java.awt.Dimension(500, 100));
        logo.setOpaque(true);
        logo.setPreferredSize(new java.awt.Dimension(500, 100));
        page.add(logo);
        logo.setBounds(40, 30, 270, 70);
        
        //Le fond
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setLabelFor(gtitre);
        fond.setText("jLabel3");
        fond.setOpaque(true);
        page.add(fond);
        fond.setBounds(0, 0, 700, 500);
        
        
        //Bouton quitter
        quitter.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        quitter.setText("Quitter");
        cadre.add(quitter);
       
        
        
        //Bouton recherche
        recherche.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        recherche.setText("Recherche");
        cadre.add(recherche);
        
        //bouton mise à jour
        miseaj.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        miseaj.setText("Mise à jour");
        cadre.add(miseaj);
        
        
        //bouton reporting
        reporting.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        reporting.setText("Reporting");
        cadre.add(reporting);
        
        
       
        
      

        
        
        
        
        
        
        
        
        /*
        
        //Fenetre
        this.fenetre=this.getContentPane();
        fenetre.setBackground(Color.GRAY);
        fenetre.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets = new Insets(10, 10, 10, 10);
        
        //Titre page
        constraints.anchor = GridBagConstraints.CENTER;
        tete.setBackground(Color.GRAY);
        titre.setFont(new Font("courier new", Font.BOLD, 40));
        titre.setForeground(Color.PINK);
        tete.add(titre);
        
        //Tag titre 
        constraints.anchor = GridBagConstraints.CENTER;
        tag.setFont(new Font("courier new", Font.BOLD, 25));
        tag.setForeground(Color.PINK);
       
        //cadre à bouton
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.setLayout(new GridLayout(6,10,50,50));
        panel.setBackground(Color.GRAY);

        
        //Bouton RECHERCHE
        constraints.anchor = GridBagConstraints.CENTER;
        Bouton.setFont(new Font("courier new", Font.BOLD, 25));
        Bouton.setForeground(Color.BLACK);
        Bouton.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));
        
        //Bouton MAJ
        Bouton2.setFont(new Font("courier new", Font.BOLD, 25));
        Bouton2.setForeground(Color.BLACK);
        Bouton2.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));
        
        //Boutonn REPORTING
        Bouton3.setFont(new Font("courier new", Font.BOLD, 25));
        Bouton3.setForeground(Color.BLACK);
        Bouton3.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));
        
        //Bouton QUITTER
        Bouton4.setFont(new Font("courier new", Font.BOLD, 25));
        Bouton4.setForeground(Color.BLACK);
        Bouton4.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));
        
        
        Bouton.addActionListener(this);
        Bouton2.addActionListener(this);
        Bouton3.addActionListener(this);
        Bouton4.addActionListener(this);
        
        
        
        panel.add(tag);
        panel.add(Bouton);
        panel.add(Bouton2);
        panel.add(Bouton3);
        panel.add(Bouton4);
        
        */
        
        
        fenetre.add(page);
        fenetre.add(cadre);
       
       
  
        setVisible(true);
        pack();
        
    }
    
    
    
   
    public  void actionPerformed(ActionEvent event)
    {
        if(event.getSource()== recherche)
        {
            this.dispose();
            new Recherche();
        }
        if(event.getSource()==miseaj)
        {
            this.dispose();
            new Maj();
        }
        if(event.getSource()== reporting)
        {
            JOptionPane.showMessageDialog(fenetre, "Disponible Prochainement!!!\n Essayez un autre mode...");
        }
        if(event.getSource()== quitter)
        {           
            System.exit(0);
        }
    }
}



