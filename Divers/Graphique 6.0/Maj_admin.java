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
public class Maj_admin extends JFrame implements ActionListener
{
    private  JPanel jPanel1;
    
    private JButton buttoneleve;
    private JButton buttonprof;
    private JButton buttonautre;
    private JButton buttonretour;
    
    
    public Maj_admin()
    {
        
        super("Compte Administrateur___Maj_admin.java");
        
        
        //Initialisation
        this.jPanel1 = new JPanel();
        
        JLabel gtitre = new JLabel();
        JLabel logoece = new JLabel();
        JLabel titre = new JLabel();
        JLabel fond = new JLabel();
        
        
        this.buttoneleve = new JButton();
        this.buttonprof = new JButton();
        this.buttonautre = new JButton();
        this.buttonretour = new JButton();
        
        //Parametrage de la page
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true);
        
        jPanel1.setLayout(null);
        
        
        //Le Grand Titre
        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Compte Adminnistateur");
        jPanel1.add(gtitre);
        gtitre.setBounds(350, 30, 320, 50);
        
        //Le Logo
        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        logoece.setText("jLabel2");
        jPanel1.add(logoece);
        logoece.setBounds(30, 20, 270, 60);
        
        //Le titre
        titre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Que souhaitez-vous mettre à jour :");
        jPanel1.add(titre);
        titre.setBounds(110, 130, 450, 44);
        
        //Bouton eleve
        buttoneleve.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        buttoneleve.setText("Eleves");
        jPanel1.add(buttoneleve);
        buttoneleve.setBounds(290, 200, 100, 30);
        
        //Bouton prof
        buttonprof.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        buttonprof.setText("Professeurs");
        jPanel1.add(buttonprof);
        buttonprof.setBounds(290, 250, 100, 30);
        
        //Autre
        buttonautre.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonautre.setText("Autre");
        jPanel1.add(buttonautre);
        buttonautre.setBounds(290, 300, 100, 30);
        
        //Bouton de retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(300, 390, 80, 30);
               
        //Le fond
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel1");
        jPanel1.add(fond);
        fond.setBounds(0, 0, 700, 500);
        
        // faire du bouton une action
        this.buttoneleve.addActionListener(this);
        this.buttonprof.addActionListener(this);
        this.buttonautre.addActionListener(this);
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
        if (event.getSource() == buttoneleve)
        {
            JOptionPane.showMessageDialog(jPanel1, "Disponible Prochainement!!!");
        }
        
        if (event.getSource() == buttonprof)
        {
            JOptionPane.showMessageDialog(jPanel1, "Disponible Prochainement!!!");
        }
        if(event.getSource() == buttonautre)
        {
            this.dispose();
            new Maj_admin_autre();
        }
        if (event.getSource() == buttonretour)
        {
            this.dispose();
            new Menu_Principal();
        }
        
    }

    
    
    
}
