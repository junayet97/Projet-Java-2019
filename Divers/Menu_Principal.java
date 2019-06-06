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
    
    private JPanel page;
    private JButton recherche;
    private JButton miseaj;
    private JButton reporting;
    private JButton quitter;
  

    public Menu_Principal() 
    {
        //Initialisation
        this.page = new JPanel();
        
        
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
        page.add(quitter);
        quitter.setBounds(550, 430, 90, 31);
       
        
        
        //Bouton recherche
        recherche.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        recherche.setText("Recherche");
        page.add(recherche);
        recherche.setBounds(290, 220, 110, 40);
        
        //bouton mise à jour
        miseaj.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        miseaj.setText("Mise à jour");
        page.add(miseaj);
        miseaj.setBounds(290, 280, 110, 40);
        
        //bouton reporting
        reporting.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        reporting.setText("Reporting");
        page.add(reporting);
        reporting.setBounds(290, 340, 110, 40);
        
        //actions des boutons
        quitter.addActionListener(this);
        recherche.addActionListener(this);
        miseaj.addActionListener(this);
        reporting.addActionListener(this);
        
        setVisible(true);
        add(page);
        
        pack();
        
    }
    
    
    
   
    @Override
    public  void actionPerformed(ActionEvent event)
    {
        if(event.getSource()== recherche)
        {
            this.dispose();
            new Recherche();
        }
        if(event.getSource()== miseaj)
        {
            this.dispose();
            new Maj();
        }
        if(event.getSource()== reporting)
        {
            JOptionPane.showMessageDialog(page, "Disponible Prochainement!!!\n Essayez un autre mode...");
        }
        if(event.getSource()== quitter)
        {           
            System.exit(0);
        }
    }
}



