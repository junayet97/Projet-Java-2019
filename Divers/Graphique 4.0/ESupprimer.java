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


public class ESupprimer extends JFrame implements ActionListener 
{
    private javax.swing.JPanel jPanel1;
    
    private javax.swing.JButton buttonok;
    private javax.swing.JButton buttonretour;
    private javax.swing.JButton buttonselionner;
    private javax.swing.JButton buttonsupprimer;
    
    private javax.swing.JTextField caseid;
    private javax.swing.JTextField caseidevaluation;
    
    private javax.swing.JComboBox<String> choixbulletin;
    private javax.swing.JComboBox<String> choixclasse;
    private javax.swing.JComboBox<String> choixmatiere;
    
    private javax.swing.JRadioButton non;
    private javax.swing.JRadioButton oui;
    
    public ESupprimer()
    {
        super("Supprimer une évaluation...ESupprimer.java");
        
        this.jPanel1 = new JPanel();
        JLabel logoece = new JLabel();
        JLabel gtitre = new JLabel();
        JLabel ptitre = new JLabel();
        JLabel titre = new JLabel();
        
        JLabel classe = new JLabel();
        this.choixclasse = new JComboBox<>();
        
        JLabel textclasse = new JLabel();
        this.oui = new JRadioButton();
        this.non = new JRadioButton();
        
        JLabel idelève = new JLabel();
        this.caseid = new JTextField();
        
        this.buttonok = new JButton();
        JSeparator jSeparator1 = new JSeparator();
        
        JLabel matiere = new JLabel();
        choixmatiere = new JComboBox<>();
        
        JLabel bulletin = new JLabel();
        choixbulletin = new JComboBox<>();
        
        buttonselionner = new JButton();
        JSeparator jSeparator2 = new JSeparator();
        
        JLabel idevaluation = new JLabel();
        caseidevaluation = new JTextField();
        buttonsupprimer = new JButton();
        
        buttonretour = new JButton();
        JLabel fond = new JLabel();

        //Parametrage de la page
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true);

        jPanel1.setLayout(null);

        //Le logo
        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(10, 11, 267, 67);

        //Grand titre
        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Mise à jour évaluation");
        jPanel1.add(gtitre);
        gtitre.setBounds(388, 10, 280, 36);

        //Petit titre
        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Enseignant");
        jPanel1.add(ptitre);
        ptitre.setBounds(452, 50, 150, 35);

        //Titre
        titre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Supprimer une évaluation :");
        jPanel1.add(titre);
        titre.setBounds(190, 90, 260, 33);

        //La classe
        classe.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        classe.setForeground(new java.awt.Color(255, 255, 255));
        classe.setText("Sélectionner une classe :");
        jPanel1.add(classe);
        classe.setBounds(92, 151, 160, 23);

        //Choix d'une classe
        choixclasse.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        choixclasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classe.1", "Classe.2", "Classe.3", "Classe.4" }));
        jPanel1.add(choixclasse);
        choixclasse.setBounds(255, 148, 90, 29);

        //question choix de classe
        textclasse.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        textclasse.setForeground(new java.awt.Color(255, 255, 255));
        textclasse.setText("Souhaitez-vous sélectionner tous les élèves de la classe ?");
        jPanel1.add(textclasse);
        textclasse.setBounds(92, 183, 350, 23);

        //Réponse oui/non
        oui.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        oui.setText("Oui");
        jPanel1.add(oui);
        oui.setBounds(460, 170, 50, 31);
        non.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        non.setText("Non");
        jPanel1.add(non);
        non.setBounds(530, 170, 50, 31);

        //l'identifier de lélève
        idelève.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        idelève.setForeground(new java.awt.Color(255, 255, 255));
        idelève.setText("Rentrer l'identifant d'un élève :");
        jPanel1.add(idelève);
        idelève.setBounds(92, 216, 200, 23);
        jPanel1.add(caseid);
        caseid.setBounds(321, 218, 157, 20);

        //button ok
        buttonok.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonok.setText("OK");
        jPanel1.add(buttonok);
        buttonok.setBounds(516, 212, 60, 31);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(92, 261, 478, 13);

        //La matiere
        matiere.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        matiere.setForeground(new java.awt.Color(255, 255, 255));
        matiere.setText("Matière :");
        jPanel1.add(matiere);
        matiere.setBounds(90, 280, 60, 23);

        //choix de la matiere
        choixmatiere.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        choixmatiere.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matière.1", "Matière.2", "Matière.3", "Matière.4" }));
        jPanel1.add(choixmatiere);
        choixmatiere.setBounds(180, 280, 120, 29);

        //LE bulletin
        bulletin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setText("Bulletin :");
        jPanel1.add(bulletin);
        bulletin.setBounds(90, 320, 60, 23);

        //choix du bulletin
        choixbulletin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        choixbulletin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulletin.1", "Bulletin.2", "Bulletin.3", "Bulletin.4" }));
        jPanel1.add(choixbulletin);
        choixbulletin.setBounds(180, 320, 120, 29);

        //Bouton selectionner
        buttonselionner.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonselionner.setText("Selectionner ");
        jPanel1.add(buttonselionner);
        buttonselionner.setBounds(380, 290, 140, 31);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(88, 354, 490, 10);

        //L'indentifiant de l'évalatu
        idevaluation.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        idevaluation.setForeground(new java.awt.Color(255, 255, 255));
        idevaluation.setText("Evaluation N° :");
        jPanel1.add(idevaluation);
        idevaluation.setBounds(110, 370, 100, 23);
        jPanel1.add(caseidevaluation);
        caseidevaluation.setBounds(230, 370, 180, 20);

        //Button supprimer une évaluation
        buttonsupprimer.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonsupprimer.setText("Supprimer");
        jPanel1.add(buttonsupprimer);
        buttonsupprimer.setBounds(450, 370, 130, 31);

        //Button retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(300, 420, 90, 31);

        //Fond 
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel5");
        jPanel1.add(fond);
        fond.setBounds(0, 0, 700, 500);

        // faire du bouton une action
        this.buttonok.addActionListener(this);
        this.buttonselionner.addActionListener(this);
        this.buttonsupprimer.addActionListener(this);
        this.buttonretour.addActionListener(this);
        this.caseid.addActionListener(this);
        this.caseidevaluation.addActionListener(this);
        this.choixbulletin.addActionListener(this);
        this.choixclasse.addActionListener(this);
        this.choixmatiere.addActionListener(this);
        
        
        
        // set border for the panel
        jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Page de Recherche"));
      
        
        // add the panel to this frame
        add(jPanel1);
    }
    
    @Override
    public void actionPerformed(ActionEvent event) 
    {
        if(event.getSource()== buttonok)
        {
            JOptionPane.showMessageDialog(jPanel1, " ERREUR ! ");
        }
        if(event.getSource() == buttonsupprimer)
        {
            JOptionPane.showMessageDialog(jPanel1, " ERREUR ! ");
        }
        if(event.getSource() == buttonselionner)
        {
            JOptionPane.showMessageDialog(jPanel1, " ERREUR ! ");
        } 
        if(event.getSource() == buttonretour)
        {
            this.dispose();
            new Menu_Principal();
        }
    }
}
