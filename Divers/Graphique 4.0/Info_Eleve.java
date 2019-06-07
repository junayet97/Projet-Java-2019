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

public class Info_Eleve extends JFrame implements ActionListener 
{
    private JPanel jPanel1;
    
    private JLabel casenom;
    private JLabel caseprenom;
    
    private JComboBox<String> choixannee;
    private JComboBox<String> choixmatieres;
    
    private JScrollPane tableau;
    private JTable jTable1;
    
    private JButton buttonconsulter;
    private JButton buttonretour;
    
    
    
    
    public Info_Eleve ()
    {
        super("Informations Elèves ...Info_Eleve.java");
        
        //Intitialisation
        this.jPanel1 = new JPanel();
        
        JLabel gtitre = new JLabel();
        JLabel ptitre = new JLabel();
        JLabel logoece = new JLabel();
        JLabel nom = new JLabel();
        JLabel prenom = new JLabel();
        this.casenom = new JLabel();
        this.caseprenom = new JLabel();
        JLabel annees = new JLabel();
        this.choixannee = new JComboBox<>();
        this.tableau = new JScrollPane();
        this.jTable1 = new JTable();
        this.buttonretour = new JButton();
        JLabel matieres = new JLabel();
        JLabel titre = new JLabel();
        JLabel textcosult = new JLabel();
        this.choixmatieres = new JComboBox<>();
        this.buttonconsulter = new JButton();
        JLabel fond = new JLabel();
        
        //Parametrage de la page
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true);
        
        jPanel1.setLayout(null);
        
        //Le grand titre
        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Recherche et Informations :");
        jPanel1.add(gtitre);
        gtitre.setBounds(310, 20, 350, 30);
        
        //Le petit titre
       ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Elèves");
        jPanel1.add(ptitre);
        ptitre.setBounds(410, 50, 100, 40);

        //Le logo
        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(20, 20, 267, 67);

        //Le nom
        nom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 255, 255));
        nom.setText("Nom : ");
        jPanel1.add(nom);
        nom.setBounds(50, 120, 43, 23);

        //Le prenom
        prenom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        prenom.setForeground(new java.awt.Color(255, 255, 255));
        prenom.setText("Prénom :");
        jPanel1.add(prenom);
        prenom.setBounds(30, 140, 70, 23);

        //La case pour le nom
        casenom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        casenom.setForeground(new java.awt.Color(255, 255, 255));
        casenom.setText("Ici nom");
        jPanel1.add(casenom);
        casenom.setBounds(100, 120, 70, 20);

        //La case pour le prénom
        caseprenom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        caseprenom.setForeground(new java.awt.Color(255, 255, 255));
        caseprenom.setText("Ici prenom");
        jPanel1.add(caseprenom);
        caseprenom.setBounds(100, 140, 65, 23);

        //L'années
        annees.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        annees.setForeground(new java.awt.Color(255, 255, 255));
        annees.setText("Année : ");
        jPanel1.add(annees);
        annees.setBounds(40, 170, 51, 23);

        //Le choix de l'année
        choixannee.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        choixannee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012","2011","2010"}));
        jPanel1.add(choixannee);
        choixannee.setBounds(100, 170, 90, 20);

        //La tableau bulletin trimestriel
        jTable1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Matières", "Enseigant", "Moyenne", "Appréciations"
            }
        ));
        
        tableau.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Matières");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Enseigant");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Moyenne");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Appréciations");
        }
        jPanel1.add(tableau);
        tableau.setBounds(140, 210, 452, 90);

        //Bouton de retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(300, 411, 100, 30);
        
        //Les matieres
       matieres.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        matieres.setForeground(new java.awt.Color(255, 255, 255));
        matieres.setText("Matière:");
        jPanel1.add(matieres);
        matieres.setBounds(170, 350, 50, 20);

        //titre
        titre.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        titre.setForeground(new java.awt.Color(255, 255, 255));
        titre.setText("Bulletin Trimestriel");
        jPanel1.add(titre);
        titre.setBounds(270, 150, 180, 50);

        //Petit texte
        textcosult.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        textcosult.setForeground(new java.awt.Color(255, 255, 255));
        textcosult.setText("Consulterle bulletin détaillé pour chaque matière : ");
        jPanel1.add(textcosult);
        textcosult.setBounds(170, 310, 370, 26);

        //Choix de la matières
        choixmatieres.setFont(new java.awt.Font("Segoe Print", 0, 12)); 
        choixmatieres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "matière.1", "matière.2", "matière.3", "matière.4" }));
        jPanel1.add(choixmatieres);
        choixmatieres.setBounds(250, 350, 140, 29);

        //Bouton consultation du bulletin détaillé
        buttonconsulter.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonconsulter.setText("Consulter");
        jPanel1.add(buttonconsulter);
        buttonconsulter.setBounds(440, 350, 110, 30);

        //Le fond
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel12");
        jPanel1.add(fond);
        fond.setBounds(0, 0, 700, 480);

       
        // faire du bouton une action
        this.choixannee.addActionListener(this);
        this.choixmatieres.addActionListener(this);
        this.buttonconsulter.addActionListener(this);
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
        if(event.getSource()== buttonconsulter)
        {
            JOptionPane.showMessageDialog(jPanel1, " ERREUR : il faut refléchir à un tableau pour les bulletins détaillés ! ");
        }
        if(event.getSource() == buttonretour)
        {
            this.dispose();
            new Menu_Principal();
        }
    }
    
    
}
