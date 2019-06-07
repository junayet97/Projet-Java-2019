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
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
 
/**
 * This program demonstrates how to use JPanel in Swing.
 * @author www.codejava.net
 */
public class CoEleve extends JFrame implements ActionListener
{
    private JPanel jPanel1;
    private JLabel id;
    private JTextField caseid;
    private JButton buttonvalider;
    private JButton buttonretour;
     
    public CoEleve() 
    {
        super("Recherches Informations ...CoEleve.java");
        
        //Initialisation
        this.jPanel1 = new JPanel();
        
        JLabel logoece = new JLabel();
        JLabel fond = new JLabel();
        JLabel ptitre = new JLabel();
        JLabel id = new JLabel();
        JLabel gtitre = new JLabel();
        
        this.caseid = new JTextField();
        
        this.buttonvalider = new JButton();
        this.buttonretour = new JButton();
        
        
        //Parametre de la page
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true); 
        
        jPanel1.setLayout(null);
        
        //Le logo
        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        logoece.setText("jLabel1");
        jPanel1.add(logoece);
        logoece.setBounds(19, 11, 266, 67);
        
        //Le petit titre
        ptitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Indentifiez-vous :");
        jPanel1.add(ptitre);
        ptitre.setBounds(230, 150, 210, 44);
        
        //Le grand titre
        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Recherche d'un Elève :");
        jPanel1.add(gtitre);
        gtitre.setBounds(330, 30, 330, 50);
        
        // l' ID
        id.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("Rentrer un identifiant :");
        jPanel1.add(id);
        id.setBounds(90, 250, 143, 23);
        
        //La case pour rentrer id
        jPanel1.add(caseid);
        caseid.setBounds(270, 250, 200, 20);
        
        //Le bouton de la validation
        buttonvalider.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonvalider.setText("Valider");
        jPanel1.add(buttonvalider);
        buttonvalider.setBounds(495, 240, 100, 31);
        
        //Le bouton de retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(300, 360, 100, 31);
        
        //Le fond
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("Recher");
        fond.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(fond);
        fond.setBounds(0, 0, 710, 500);
         
        // faire du bouton une action
        buttonvalider.addActionListener(this);
        buttonretour.addActionListener(this);
        caseid.addActionListener(this);
         
        // set border for the panel
        jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Informations Professeurs"));
         
        // add the panel to this frame
        add(jPanel1);
         
        pack();
    }
    
    
    @Override
    public  void actionPerformed(ActionEvent event)
    {
        if(event.getSource()== buttonvalider )
        {
            this.dispose();
            new Info_Eleve();
        }
        
        if(event.getSource()==buttonretour)
        {
            this.dispose();
            new Menu_Principal();
        }
    }
     
}