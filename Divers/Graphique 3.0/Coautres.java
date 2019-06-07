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
   
    private javax.swing.JButton buttonretour;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable tabannees;
    private javax.swing.JTable tabdiscipline;
    private javax.swing.JTable tabniveaux;
    
    public Coautres ()
    {
        this.jPanel1 = new JPanel();
        JLabel logoece = new JLabel();
        JLabel titre = new JLabel();
        JLabel niveaux = new JLabel();
        JLabel annees = new JLabel();
        JLabel disciplines = new JLabel();
        this.buttonretour = new JButton();
        JScrollPane paneltabniveau = new JScrollPane();
        this.tabniveaux = new JTable();
        JScrollPane paneltabannee = new JScrollPane();
        this.tabannees = new JTable();
        JScrollPane paneltabdiscipline = new JScrollPane();
        this.tabdiscipline = new JTable();
        JLabel fond = new JLabel();

        //Parametrage de la page
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true);

        jPanel1.setLayout(null);

        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(20, 20, 270, 60);

        titre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Autre type de recherche");
        jPanel1.add(titre);
        titre.setBounds(330, 30, 330, 70);

        niveaux.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        niveaux.setForeground(new java.awt.Color(255, 255, 255));
        niveaux.setText("Niveaux");
        jPanel1.add(niveaux);
        niveaux.setBounds(300, 160, 70, 20);

        annees.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        annees.setForeground(new java.awt.Color(255, 255, 255));
        annees.setText("Années");
        jPanel1.add(annees);
        annees.setBounds(90, 160, 70, 30);

        disciplines.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        disciplines.setForeground(new java.awt.Color(255, 255, 255));
        disciplines.setText("Disciplines");
        jPanel1.add(disciplines);
        disciplines.setBounds(530, 170, 110, 20);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(280, 380, 100, 30);

        tabniveaux.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] 
            {
                "ID niveau", "Nom niveau"
            }
        ));
        paneltabniveau.setViewportView(tabniveaux);

        jPanel1.add(paneltabniveau);
        paneltabniveau.setBounds(240, 200, 190, 90);

        tabannees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] 
            {
                "Id Année Scolaire"
            }
        ));
        paneltabannee.setViewportView(tabannees);

        jPanel1.add(paneltabannee);
        paneltabannee.setBounds(50, 200, 150, 90);

        tabdiscipline.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] 
            {
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
        paneltabdiscipline.setBounds(460, 200, 210, 90);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel6");
        jPanel1.add(fond);
        fond.setBounds(-10, -6, 710, 510);

        // faire du bouton une action
    
        //this.tabannees.add(this);
        //this.tabdiscipline.add(this);
        //this.tabniveaux.add(this);
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
