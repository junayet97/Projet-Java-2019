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

 
/**
 * This program demonstrates how to use JPanel in Swing.
 * @author www.codejava.net
 */
public class Recherche_eleve_info extends JFrame implements ActionListener
{
    private JPanel jPanel1;
    
    private JButton buttonconsulter;
    private JButton buttonretour;
   
    private JComboBox<String> choixannee;
    private JComboBox<String> choixtrimestre;
    
     
    public Recherche_eleve_info() 
    {
        super("Recherches Informations______Recherche_eleve.java____");
        
        //Initialisation
        this.jPanel1 = new JPanel();
        
        JLabel gtitre = new JLabel();
        JLabel ptitre = new JLabel();
        JLabel logoece = new JLabel();
        JLabel Nom = new JLabel();
        JLabel casenom = new JLabel();
        JLabel prenom = new JLabel();
        JLabel caseprenom = new JLabel();
        JLabel annee = new JLabel();
        JLabel caseanne = new JLabel();
        JLabel classe = new JLabel();
        JLabel caseclase = new JLabel();
        JLabel bulletin = new JLabel();
        JLabel fond = new JLabel();
        
        this.choixtrimestre = new JComboBox<>();
        this.choixannee = new JComboBox<>();
        
        this.buttonconsulter = new JButton();
        this.buttonretour = new JButton();
        
        //Parametrage de la page
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true); 
        
        
        jPanel1.setLayout(null);
        
        //le grans titre
        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Recherche et Informations :");
        jPanel1.add(gtitre);
        gtitre.setBounds(320, 30, 350, 30);

        //le petit titre
        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("ELèves");
        jPanel1.add(ptitre);
        ptitre.setBounds(450, 60, 100, 40);

        //le logo
        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(20, 20, 267, 67);

        //le nom
        Nom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        Nom.setForeground(new java.awt.Color(255, 255, 255));
        Nom.setText("Nom : ");
        jPanel1.add(Nom);
        Nom.setBounds(260, 130, 50, 20);

        //la case pour le nom
        casenom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        casenom.setForeground(new java.awt.Color(255, 255, 255));
        casenom.setText("ici le Nom");
        jPanel1.add(casenom);
        casenom.setBounds(330, 130, 70, 20);

        //le prenom
        prenom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        prenom.setForeground(new java.awt.Color(255, 255, 255));
        prenom.setText("Prénom : ");
        jPanel1.add(prenom);
        prenom.setBounds(250, 160, 70, 30);

        //la case pour le prenom
        caseprenom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        caseprenom.setForeground(new java.awt.Color(255, 255, 255));
        caseprenom.setText("ici le prénom");
        jPanel1.add(caseprenom);
        caseprenom.setBounds(330, 160, 90, 30);

        //l'annee
        annee.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        annee.setForeground(new java.awt.Color(255, 255, 255));
        annee.setText("Année actuelle :");
        jPanel1.add(annee);
        annee.setBounds(210, 200, 110, 20);

        //la case pour l'annee
        caseanne.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        caseanne.setForeground(new java.awt.Color(255, 255, 255));
        caseanne.setText("ici l'année actuelle");
        jPanel1.add(caseanne);
        caseanne.setBounds(330, 200, 110, 23);

        //la classe
        classe.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        classe.setForeground(new java.awt.Color(255, 255, 255));
        classe.setText("Classe actuelle : ");
        jPanel1.add(classe);
        classe.setBounds(210, 240, 110, 23);

        //la case pour la classe
        caseclase.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        caseclase.setForeground(new java.awt.Color(255, 255, 255));
        caseclase.setText("ici l'année actuelle");
        jPanel1.add(caseclase);
        caseclase.setBounds(330, 240, 130, 20);

        //le bulletin
        bulletin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setText("Bulletin :");
        jPanel1.add(bulletin);
        bulletin.setBounds(220, 280, 60, 20);

        //le choix du trimestre
        choixtrimestre.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        choixtrimestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trimestre.1", "Trimestre.2", "Trimestre.3", "Trimestre.4" }));
        jPanel1.add(choixtrimestre);
        choixtrimestre.setBounds(330, 280, 140, 29);

        //le choix de l'année
        choixannee.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        choixannee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2018", "2017", "2016" }));
        jPanel1.add(choixannee);
        choixannee.setBounds(330, 330, 140, 30);

        //bouton consulter
        buttonconsulter.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonconsulter.setText("Consulter");
        jPanel1.add(buttonconsulter);
        buttonconsulter.setBounds(180, 330, 120, 30);

        //le bouton retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(290, 410, 90, 31);

        //le fond
        fond.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        fond.setForeground(new java.awt.Color(255, 255, 255));
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel12");
        jPanel1.add(fond);
        fond.setBounds(0, 0, 700, 510);
        
        // faire du bouton une action
        this.buttonconsulter.addActionListener(this);
        this.buttonretour.addActionListener(this);;
        
        
        // set border for the panel
        jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Page de Recherche"));
      
        
        // add the panel to this frame
        add(jPanel1);

        

        pack();
    }
    
    
   @Override
    public  void actionPerformed(ActionEvent event)
    {
        if(event.getSource()== buttonconsulter )
        {
            JOptionPane.showMessageDialog(jPanel1, "Disponible Prochainement!!!");
        }
        
        if(event.getSource()==buttonretour)
        {
            this.dispose();
            new Menu_Principal();
        }
    }
     
}