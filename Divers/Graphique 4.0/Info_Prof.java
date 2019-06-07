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

public class Info_Prof extends JFrame implements ActionListener
{
    private JPanel jPanel1;
    private JLabel Logoece;
    
    private JButton buttonretour;
    
    private JLabel casenom;
    private JLabel caseprenom;
    private JLabel fond;
    private JLabel gtitre;
    private JTable jTable1;
    private JLabel nom;
    private JLabel prenom;
    private JLabel ptitre;
    private JScrollPane tableau;
    
    public Info_Prof()
    {
        
        super("Informations Professeurs ...Info_Prof.java");
        
        //Initialisation
        this.jPanel1 = new JPanel();
        
        JLabel casenom = new JLabel();
        JLabel Logoece = new JLabel();
        JLabel prenom = new JLabel();
        JLabel gtitre = new JLabel();
        JLabel nom = new JLabel();
        JLabel ptitre = new JLabel();
        JLabel caseprenom = new JLabel();
        JLabel fond = new JLabel();
        
        this.buttonretour = new JButton();
        this.tableau = new JScrollPane();
        this.jTable1 = new JTable();
        
        //Parametrage de la page
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true); 
        
        jPanel1.setLayout(null);
        
        //Case ou le nom doit s'afficher depuis la bdd
        casenom.setBackground(new java.awt.Color(255, 255, 255));
        casenom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        casenom.setForeground(new java.awt.Color(255, 255, 255));
        casenom.setText(" le nom doit s'afficher ici");
        jPanel1.add(casenom);
        casenom.setBounds(120, 130, 170, 23);

        //Le prenom
        prenom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        prenom.setForeground(new java.awt.Color(255, 255, 255));
        prenom.setText("Prénom : ");
        jPanel1.add(prenom);
        prenom.setBounds(50, 160, 70, 23);

        //Le nom
        nom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 255, 255));
        nom.setText("Nom :");
        jPanel1.add(nom);
        nom.setBounds(70, 130, 40, 23);

        //Le grand titre
        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Recherche et Informations :");
        jPanel1.add(gtitre);
        gtitre.setBounds(310, 40, 340, 30);

        //Le logo
        Logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        Logoece.setText("jLabel1");
        jPanel1.add(Logoece);
        Logoece.setBounds(20, 20, 270, 60);

        //Le petit titre
        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Proffesseur");
        jPanel1.add(ptitre);
        ptitre.setBounds(390, 80, 140, 50);

        //La case pour le prenom
        caseprenom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        caseprenom.setForeground(new java.awt.Color(255, 255, 255));
        caseprenom.setText("le prénom doit s'afficher ici");
        jPanel1.add(caseprenom);
        caseprenom.setBounds(120, 160, 220, 20);

        
        //Le bouton retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(320, 380, 90, 40);

        //Le tableau 
        jTable1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Année", "Classes", "Niveau", "Matières"
            }
        ));
        tableau.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Année");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Classes");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Niveau");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Matières");
        }

        jPanel1.add(tableau);
        tableau.setBounds(150, 220, 400, 90);

        
        //Le fond
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel4");
        jPanel1.add(fond);
        fond.setBounds(0, 0, 710, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 710, 490);
        
        // faire du bouton une action
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
        if(event.getSource()== buttonretour)
        {
            this.dispose();
            new Menu_Principal();
        }
    }
     
}
