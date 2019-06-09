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

public class Recherche_prof extends JFrame implements ActionListener
{
    private JPanel jPanel1;
    private JButton buttonretour;
    private JTable jTable1;
    private JScrollPane tabpane;
    private JTable tableau = new JTable();
    Object[][] tab;
    
    public Recherche_prof(Object[][] tab)
    {
        
        super("Informations Professeurs___Recherche_prof.java");
        this.tab=tab;
        //Initialisation
        this.jPanel1 = new JPanel();
        JLabel gtitre = new JLabel();
        JLabel Logoece = new JLabel();
        JLabel ptitre = new JLabel();
        this.buttonretour = new JButton();
        this.tabpane = new JScrollPane();
        this.tableau = new JTable();
        JLabel fond = new JLabel();

        //Parametre page
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1020, 700));
        setPreferredSize(new java.awt.Dimension(1020, 700));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true);
        
        jPanel1.setMinimumSize(new java.awt.Dimension(1020, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1020, 700));
        jPanel1.setLayout(null);

        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Recherche et Informations :");
        jPanel1.add(gtitre);
        gtitre.setBounds(630, 40, 340, 30);

        Logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        Logoece.setText("jLabel1");
        jPanel1.add(Logoece);
        Logoece.setBounds(60, 40, 270, 60);

        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Enseignants");
        jPanel1.add(ptitre);
        ptitre.setBounds(720, 80, 160, 50);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(430, 550, 90, 40);

        tableau.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        tableau.setModel(new javax.swing.table.DefaultTableModel(
            this.tab,
            new String [] {
                "ID Enseignant", "Nom", "Prénom", "ID Enseignement", "Nom Discipline", "Nom Classe"
            }
            
        ));
        
        tabpane.setViewportView(tableau);

        jPanel1.add(tabpane);
        tabpane.setBounds(40, 190, 940, 320);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel4");
        fond.setMaximumSize(new java.awt.Dimension(1020, 700));
        fond.setMinimumSize(new java.awt.Dimension(1020, 700));
        fond.setPreferredSize(new java.awt.Dimension(1020, 700));
        jPanel1.add(fond);
        fond.setBounds(0, 0, 1060, 670);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1060, 670);
        
        // faire du bouton une action
        this.buttonretour.addActionListener(this);;
        
        
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
            new Recherche();
        }
    }
     
}
