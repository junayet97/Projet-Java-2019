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
public class Recherche_autre extends JFrame implements ActionListener 
{
   
    
    private JPanel jPanel1;
    private JButton buttonretour;
    private JScrollPane panelclasse;
    private JScrollPane panelenseignement;
    private JScrollPane paneltabannee;
    private JScrollPane paneltabdiscipline;
    private JTable tabannees;
    private JTable tabclasses;
    private JTable tabdiscipline;
    private JTable tabenseignement;
    
    public Recherche_autre ()
    {
        super("Recherche d'information___Recherche_autre.java___");
        
        this.jPanel1 = new JPanel();
        
        JLabel logoece = new JLabel();
        JLabel titre = new JLabel();
        
        JLabel annees = new JLabel();
        this.paneltabannee = new JScrollPane();
        this.tabannees = new JTable();
        
        JLabel disciplines = new JLabel();
        this.paneltabdiscipline = new JScrollPane();
        this.tabdiscipline = new JTable();
        
        JLabel classes = new JLabel();
        this.panelclasse = new JScrollPane();
        this.tabclasses = new JTable();
     
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
        
  
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 900));
        jPanel1.setLayout(null);

        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(60, 40, 270, 60);

        titre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Autre type de recherche");
        jPanel1.add(titre);
        titre.setBounds(580, 40, 330, 70);

        classes.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        classes.setForeground(new java.awt.Color(255, 255, 255));
        classes.setText("Classes");
        jPanel1.add(classes);
        classes.setBounds(290, 360, 50, 20);

        annees.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        annees.setForeground(new java.awt.Color(255, 255, 255));
        annees.setText("Années");
        jPanel1.add(annees);
        annees.setBounds(200, 170, 70, 30);

        disciplines.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        disciplines.setForeground(new java.awt.Color(255, 255, 255));
        disciplines.setText("Disciplines");
        jPanel1.add(disciplines);
        disciplines.setBounds(630, 360, 110, 20);

        tabannees.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        tabannees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] 
            {
                "ID Année Scolaire"
            }
        ));
        paneltabannee.setViewportView(tabannees);

        jPanel1.add(paneltabannee);
        paneltabannee.setBounds(170, 220, 130, 90);

        tabdiscipline.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] 
            {
                "ID Discipline", "Nom Discipline"
            }
        ));
        paneltabdiscipline.setViewportView(tabdiscipline);

        jPanel1.add(paneltabdiscipline);
        paneltabdiscipline.setBounds(540, 400, 300, 90);

        tabclasses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] 
            {
                "ID Classe", "Nom Classe"
            }
        ));
        panelclasse.setViewportView(tabclasses);

        jPanel1.add(panelclasse);
        panelclasse.setBounds(140, 400, 330, 90);

        enseignement.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setText("Enseignement");
        jPanel1.add(enseignement);
        enseignement.setBounds(660, 170, 100, 23);

        tabenseignement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] 
            {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] 
            {
                "ID Enseignement", "Nom Classe", "ID Enseignant", "Nom Discipline"
            }
        ));
        panelenseignement.setViewportView(tabenseignement);

        jPanel1.add(panelenseignement);
        panelenseignement.setBounds(420, 220, 510, 90);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(440, 600, 100, 30);

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
            new Recherche();
        }
    }
}
