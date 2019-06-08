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


public class Maj_prof_eval_supprimer extends JFrame implements ActionListener 
{
    private JButton buttonretour;
    private JButton buttonsupprimer;
    private JTextField caseidevaluation1;
    private JPanel jPanel1;
    
    public Maj_prof_eval_supprimer()
    {
        super("Supprimer une évaluation___Maj_prof_supprimer.java___");
        
        this.jPanel1 = new javax.swing.JPanel();
        JLabel logoece = new javax.swing.JLabel();
        JLabel gtitre = new javax.swing.JLabel();
        JLabel ptitre = new javax.swing.JLabel();
        JLabel titre = new javax.swing.JLabel();
        JLabel idevaluation = new javax.swing.JLabel();
        this.buttonsupprimer = new javax.swing.JButton();
        this.buttonretour = new javax.swing.JButton();
        this.caseidevaluation1 = new javax.swing.JTextField();
        JLabel fond = new javax.swing.JLabel();

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
        logoece.setBounds(30, 20, 267, 67);

        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Mise à jour évaluation");
        jPanel1.add(gtitre);
        gtitre.setBounds(388, 10, 280, 36);

        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Enseignant");
        jPanel1.add(ptitre);
        ptitre.setBounds(452, 50, 150, 35);

        titre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Supprimer une évaluation :");
        jPanel1.add(titre);
        titre.setBounds(210, 170, 260, 33);

        idevaluation.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        idevaluation.setForeground(new java.awt.Color(255, 255, 255));
        idevaluation.setText("Rentrer ID Evaluation :");
        jPanel1.add(idevaluation);
        idevaluation.setBounds(60, 260, 150, 23);

        buttonsupprimer.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonsupprimer.setText("Supprimer");
        jPanel1.add(buttonsupprimer);
        buttonsupprimer.setBounds(500, 260, 130, 31);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(300, 400, 90, 31);
        jPanel1.add(caseidevaluation1);
        caseidevaluation1.setBounds(250, 260, 180, 20);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel5");
        jPanel1.add(fond);
        fond.setBounds(0, 0, 700, 500);

        // faire du bouton une action
        this.buttonsupprimer.addActionListener(this);
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
        if(event.getSource() == buttonsupprimer)
        {
            JOptionPane.showMessageDialog(jPanel1, " Indisponible! ");
        }
        
        if(event.getSource() == buttonretour)
        {
            this.dispose();
            new Maj_prof_evaluation();
        }
    }
}
