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

public class Maj_prof_bulletin_supprimer extends JFrame implements ActionListener
{
   
    private JPanel jPanel1;
    private JButton buttoninfo;
    private JButton buttonretour;
    private JButton buttonsupprimer;
    private JTextField case_idchamp_bulletin;
    
    public Maj_prof_bulletin_supprimer()
    {
        super("Mise à jour Bulletin____Maj_prof_supprimer.java__");
        
        
        this.jPanel1 = new JPanel();
        JLabel ptitre = new JLabel();
        JLabel ID_champ_bulletin = new JLabel();
        this.case_idchamp_bulletin = new JTextField();
        this.buttoninfo = new JButton();
        this.buttonsupprimer = new JButton();
        this.buttonretour = new JButton();
        JLabel logoece = new JLabel();
        JLabel gtitre = new JLabel();
        JLabel titre = new JLabel();
        JLabel fond = new JLabel();
        
        
        //Parametrage de la page
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true);
        
        jPanel1.setLayout(null);

        //titre
        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Supprimer un champs du Bulletin");
        jPanel1.add(ptitre);
        ptitre.setBounds(160, 160, 430, 50);

        //id champ bulltetin
        ID_champ_bulletin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        ID_champ_bulletin.setForeground(new java.awt.Color(255, 255, 255));
        ID_champ_bulletin.setText("ID Champs Bulletin :");
        jPanel1.add(ID_champ_bulletin);
        ID_champ_bulletin.setBounds(120, 260, 130, 20);
        jPanel1.add(case_idchamp_bulletin);
        case_idchamp_bulletin.setBounds(280, 260, 140, 20);

        buttoninfo.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttoninfo.setText("Informations");
        jPanel1.add(buttoninfo);
        buttoninfo.setBounds(480, 250, 130, 40);

        buttonsupprimer.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonsupprimer.setText("Supprimer");
        jPanel1.add(buttonsupprimer);
        buttonsupprimer.setBounds(290, 330, 120, 30);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(310, 400, 80, 30);

        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(40, 30, 270, 60);

        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Mise à jour");
        jPanel1.add(gtitre);
        gtitre.setBounds(520, 20, 160, 60);

        titre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Enseignant");
        jPanel1.add(titre);
        titre.setBounds(520, 70, 150, 40);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/imagefond.jpg"))); // NOI18N
        jPanel1.add(fond);
        fond.setBounds(0, 0, 760, 560);
        
        // faire du bouton une action
        this.case_idchamp_bulletin.addActionListener(this);
        this.buttonsupprimer.addActionListener(this);
        this.buttoninfo.addActionListener(this);
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
        if (event.getSource() == buttoninfo)
        {
            this.dispose();
            new Maj_prof_bulletin_ajouter();
        }
        if (event.getSource() == buttonsupprimer)
        {
            JOptionPane.showMessageDialog(jPanel1, "Disponible Prochainement!!!");
        }
        
        if (event.getSource() == buttonretour)
        {
            this.dispose();
            new Menu_Principal();
        }
    }
}
   
    
    
    
     

