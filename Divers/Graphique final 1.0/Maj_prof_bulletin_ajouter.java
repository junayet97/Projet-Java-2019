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


public class Maj_prof_bulletin_ajouter extends JFrame implements ActionListener
{
    private JButton buttoninfo;
    private JButton buttonretour;
    private JButton buttonvalider;
    
    private JTextField case_appreciation;
    private JTextField case_idbulletin;
    private JTextField case_idenseignement;
    private JTextField case_note;
    
    private JPanel jPanel1;
    
    
    public Maj_prof_bulletin_ajouter()
    {
        super("Mise à jour Bulletin____Maj_prof_ajouter.java__");
       
        this.jPanel1 = new JPanel();
     
        JLabel logoece = new javax.swing.JLabel();
        JLabel ptitre = new javax.swing.JLabel();
        
        this.case_idenseignement = new JTextField();
        JLabel idbulletin = new JLabel();
        
        JLabel idenseignement = new JLabel();
        this.case_appreciation = new JTextField();
        
        this.buttoninfo = new JButton();
        
        JLabel appreciation = new JLabel();
        this.case_idbulletin = new JTextField();
        JLabel note = new JLabel();
        this.case_note = new JTextField();
        this.buttonvalider = new JButton();
        this.buttonretour = new JButton();
        JLabel gtitre = new JLabel();
        JSeparator jSeparator1 = new JSeparator();
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
        logoece.setBounds(10, 10, 267, 67);

        ptitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Ajouter d' un champs du Bulltetin");
        jPanel1.add(ptitre);
        ptitre.setBounds(150, 110, 419, 44);

        
        jPanel1.add(case_idenseignement);
        case_idenseignement.setBounds(260, 220, 130, 20);

        idbulletin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        idbulletin.setForeground(new java.awt.Color(255, 255, 255));
        idbulletin.setText("ID Bulletin :");
        jPanel1.add(idbulletin);
        idbulletin.setBounds(170, 190, 90, 23);

        idenseignement.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        idenseignement.setForeground(new java.awt.Color(255, 255, 255));
        idenseignement.setText("ID Enseignement :");
        jPanel1.add(idenseignement);
        idenseignement.setBounds(130, 220, 120, 20);
        jPanel1.add(case_appreciation);
        case_appreciation.setBounds(260, 300, 130, 20);

        buttoninfo.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttoninfo.setText("Informations");
        jPanel1.add(buttoninfo);
        buttoninfo.setBounds(430, 200, 120, 30);

        appreciation.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        appreciation.setForeground(new java.awt.Color(255, 255, 255));
        appreciation.setText("Appréciation :");
        jPanel1.add(appreciation);
        appreciation.setBounds(160, 300, 100, 20);
        jPanel1.add(case_idbulletin);
        case_idbulletin.setBounds(260, 190, 130, 20);

        note.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        note.setForeground(new java.awt.Color(255, 255, 255));
        note.setText("Note : ");
        jPanel1.add(note);
        note.setBounds(200, 270, 50, 23);
        jPanel1.add(case_note);
        case_note.setBounds(260, 270, 130, 20);

        buttonvalider.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonvalider.setText("Valider");
        jPanel1.add(buttonvalider);
        buttonvalider.setBounds(430, 280, 130, 31);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(270, 380, 110, 31);

        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Mise à jour");
        jPanel1.add(gtitre);
        gtitre.setBounds(510, 20, 150, 50);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(120, 250, 450, 10);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel9");
        jPanel1.add(fond);
        fond.setBounds(0, 0, 710, 500);

        // faire du bouton une action
        this.buttoninfo.addActionListener(this);
        this.buttonretour.addActionListener(this);
        this.buttonvalider.addActionListener(this);
    
        this.case_appreciation.addActionListener(this);
        this.case_idbulletin.addActionListener(this);
        this.case_idenseignement.addActionListener(this);
        this.case_note.addActionListener(this);
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
        if(event.getSource()== buttoninfo )
        {
            JOptionPane.showMessageDialog(jPanel1, "Disponible Prochainement!!!");
        }
        if(event.getSource()== buttonvalider )
        {
            JOptionPane.showMessageDialog(jPanel1, "Disponible Prochainement!!!");
        }
        if(event.getSource()==buttonretour)
        {
            this.dispose();
            new Maj_prof_bulletin();
        }
    }
}
