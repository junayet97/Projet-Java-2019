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

public class Maj_admin_eleve extends JFrame implements ActionListener
{
    private JPanel jPanel1;
    private JButton buttonmodifier;
    private JButton buttonsupprimer;
    private JButton buttonajouter;
    private JButton buttonretour;
    
    public Maj_admin_eleve()
    {
        super ("Mise à jour d'une élève___Maj_admin_eleve.java___");
        
        this.jPanel1 = new JPanel();
        JLabel logoece = new JLabel();
        JLabel gtitre = new JLabel();
        JLabel ptitre = new JLabel();
        JLabel titre = new JLabel ();
        this.buttonajouter = new JButton();
        this.buttonmodifier = new JButton();
        this.buttonsupprimer = new JButton();
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
        logoece.setBounds(30, 30, 270, 60);

        //Grand Titre
        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Mise à jour Elèves");
        jPanel1.add(gtitre);
        gtitre.setBounds(410, 30, 220, 40);

        //Le titre
        titre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Que souhaitez-vous effectuez :");
        jPanel1.add(titre);
        titre.setBounds(190, 120, 330, 40);

        //Le petit titre
        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Compte Administrateur");
        jPanel1.add(ptitre);
        ptitre.setBounds(360, 70, 300, 40);

        //Le bouton modifier
        buttonmodifier.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonmodifier.setText("Modifier");
        jPanel1.add(buttonmodifier);
        buttonmodifier.setBounds(280, 240, 120, 40);

        //Le bouton ajouter
        buttonajouter.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonajouter.setText("Ajouter");
        jPanel1.add(buttonajouter);
        buttonajouter.setBounds(280, 170, 120, 40);

        //Le Bouton retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(300, 380, 80, 30);

        //Le Bouton supprimer
        buttonsupprimer.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonsupprimer.setText("Supprimer");
        jPanel1.add(buttonsupprimer);
        buttonsupprimer.setBounds(280, 310, 120, 40);

        //Le fond
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("Compte Enseilgant");
        jPanel1.add(fond);
        fond.setBounds(-6, -6, 710, 510);

        // faire du bouton une action
        this.buttonsupprimer.addActionListener(this);
        this.buttonajouter.addActionListener(this);
        this.buttonmodifier.addActionListener(this);
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
        if (event.getSource() == buttonajouter)
        {
            this.dispose();
            new Maj_admin_eleve_ajouter();
        }
        if (event.getSource() == buttonmodifier)
        {
            this.dispose();
            new Maj_admin_eleve_modifier();
        }
        if (event.getSource() == buttonsupprimer)
        {
            this.dispose();
            new Maj_admin_eleve_supprimer();
        }
        if (event.getSource() == buttonretour)
        {
            this.dispose();
            new Menu_Principal();
        }
    }
}
