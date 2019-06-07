/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphique;

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
 *
 * @author mathi
 */
public class Coautres extends JFrame implements ActionListener 
{
   
    
    private javax.swing.JPanel jPanel1;
    
   
    private javax.swing.JScrollPane panelclasse;
    private javax.swing.JScrollPane panelenseignement;
    private javax.swing.JScrollPane panelinscription;
    private javax.swing.JScrollPane paneltabannee;
    private javax.swing.JScrollPane paneltabdiscipline;
    private javax.swing.JScrollPane paneltabniveau;
    
    private javax.swing.JTable tabannees;
    private javax.swing.JTable tabclasses;
    private javax.swing.JTable tabdiscipline;
    private javax.swing.JTable tabenseignement;
    private javax.swing.JTable tabinscription;
    private javax.swing.JTable tabniveaux;
    
    private javax.swing.JButton buttonretour;
    
    public Coautres ()
    {
        super("Recherche d'information ... Coautre.java");
        this.jPanel1 = new JPanel();
        
        JLabel logoece = new JLabel();
        JLabel titre = new JLabel();
        
        JLabel niveaux = new JLabel();
        this.paneltabniveau = new JScrollPane();
        this.tabniveaux = new JTable();
        
        JLabel annees = new JLabel();
        this.paneltabannee = new JScrollPane();
        this.tabannees = new JTable();
        
        JLabel disciplines = new JLabel();
        this.paneltabdiscipline = new JScrollPane();
        this.tabdiscipline = new JTable();
        
        JLabel classes = new JLabel();
        this.panelclasse = new JScrollPane();
        this.tabclasses = new JTable();
        
        JLabel inscription = new JLabel();
        panelinscription = new javax.swing.JScrollPane();
        tabinscription = new javax.swing.JTable();
        
        JLabel enseignement = new JLabel();
        panelenseignement = new javax.swing.JScrollPane();
        tabenseignement = new javax.swing.JTable();
        
        this.buttonretour = new JButton();
        JLabel fond = new JLabel();


         //Parametrage de la page
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true); 
        
  
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel1.setLayout(null);

        //Le Logo
        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(60, 40, 270, 60);

        //Le titre
        titre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Autre type de recherche");
        jPanel1.add(titre);
        titre.setBounds(580, 40, 330, 70);

        //Niveaux
        niveaux.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        niveaux.setForeground(new java.awt.Color(255, 255, 255));
        niveaux.setText("Niveaux");
        jPanel1.add(niveaux);
        niveaux.setBounds(120, 370, 70, 20);

        //Classe
        classes.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        classes.setForeground(new java.awt.Color(255, 255, 255));
        classes.setText("Classes");
        jPanel1.add(classes);
        classes.setBounds(350, 180, 50, 20);

        //Annees
        annees.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        annees.setForeground(new java.awt.Color(255, 255, 255));
        annees.setText("Années");
        jPanel1.add(annees);
        annees.setBounds(70, 170, 70, 30);

        //Discipline
        disciplines.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        disciplines.setForeground(new java.awt.Color(255, 255, 255));
        disciplines.setText("Disciplines");
        jPanel1.add(disciplines);
        disciplines.setBounds(750, 370, 110, 20);

        //Le tableau niveaux
        tabniveaux.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Niveau", "Nom Niveau"
            }
        ));
        paneltabniveau.setViewportView(tabniveaux);
        jPanel1.add(paneltabniveau);
        paneltabniveau.setBounds(40, 400, 240, 90);

        
        //Le table annees
        tabannees.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        tabannees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "ID Année Scolaire"
            }
        ));
        paneltabannee.setViewportView(tabannees);
        jPanel1.add(paneltabannee);
        paneltabannee.setBounds(40, 210, 130, 90);

        //le Tableau Discipline
        tabdiscipline.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Discipline", "Nom Discipline"
            }
        ));
        paneltabdiscipline.setViewportView(tabdiscipline);
        jPanel1.add(paneltabdiscipline);
        paneltabdiscipline.setBounds(660, 400, 300, 90);

        //Le tableau Classes
        tabclasses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Classe", "Nom Classe", "ID Niveau"
            }
        ));
        panelclasse.setViewportView(tabclasses);
        jPanel1.add(panelclasse);
        panelclasse.setBounds(230, 210, 330, 90);

        //inscription
        inscription.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        inscription.setForeground(new java.awt.Color(255, 255, 255));
        inscription.setText("Inscription");
        jPanel1.add(inscription);
        inscription.setBounds(730, 180, 90, 30);

        //Le tableau inscription
        tabinscription.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Inscription", "ID Personne", "ID Classe"
            }
        ));
        panelinscription.setViewportView(tabinscription);
        jPanel1.add(panelinscription);
        panelinscription.setBounds(610, 210, 350, 90);

        //Enseignement
        enseignement.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setText("Enseignement");
        jPanel1.add(enseignement);
        enseignement.setBounds(420, 370, 100, 23);

        
        //le Tableau enseignement
        tabenseignement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Enseignement", "ID Discipline"
            }
        ));
        panelenseignement.setViewportView(tabenseignement);
        jPanel1.add(panelenseignement);
        panelenseignement.setBounds(370, 400, 220, 90);

        
        //Le bouton retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(440, 600, 100, 30);

        
        //Le fond
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel6");
        fond.setPreferredSize(new java.awt.Dimension(1600, 1000));
        jPanel1.add(fond);
        fond.setBounds(0, 0, 1000, 700);

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
        if(event.getSource() == buttonretour)
        {
            this.dispose();
            new Menu_Principal();
        }
    }
}
