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

public class Maj_admin_prof_ajouter extends JFrame implements ActionListener
{
    
    private JPanel jPanel1;
     
    
    private JButton buttonajouter;
    private JButton buttonretour;
    
    private JTextField case_IDclasse;
    private JTextField case_IDdiscipline;
    private JTextField case_IDenseignant;
    private JTextField case_nom;
    private JTextField case_prenom;
    ;
    
    public Maj_admin_prof_ajouter()
    {
        this.jPanel1 = new javax.swing.JPanel();
        JLabel logoece = new javax.swing.JLabel();
        JLabel gtritre = new javax.swing.JLabel();
        JLabel ptitre = new javax.swing.JLabel();
        JLabel titre = new javax.swing.JLabel();
        JLabel nom = new javax.swing.JLabel();
        JLabel prenom = new javax.swing.JLabel();
        JLabel IDenseignant = new javax.swing.JLabel();
        JLabel IDclasse = new javax.swing.JLabel();
        JLabel IDdiscipline = new javax.swing.JLabel();
        this.case_nom = new javax.swing.JTextField();
        this.case_prenom = new javax.swing.JTextField();
        this.case_IDenseignant = new javax.swing.JTextField();
        this.case_IDclasse = new javax.swing.JTextField();
        this.case_IDdiscipline = new javax.swing.JTextField();
        this.buttonajouter = new javax.swing.JButton();
        this.buttonretour = new javax.swing.JButton();
        JLabel fond = new javax.swing.JLabel();

        //Parametrage de la page
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true);
        

        jPanel1.setLayout(null);

        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(20, 20, 270, 70);

        gtritre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtritre.setForeground(new java.awt.Color(204, 204, 255));
        gtritre.setText("Mise à jour Enseignant");
        jPanel1.add(gtritre);
        gtritre.setBounds(380, 30, 280, 40);

        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Compte Administrateur");
        jPanel1.add(ptitre);
        ptitre.setBounds(370, 70, 300, 40);

        titre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Ajouter un Enseignant :");
        jPanel1.add(titre);
        titre.setBounds(210, 140, 240, 50);

        nom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 255, 255));
        nom.setText("Nom :");
        jPanel1.add(nom);
        nom.setBounds(208, 200, 60, 23);

        prenom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        prenom.setForeground(new java.awt.Color(255, 255, 255));
        prenom.setText("Prénom :");
        jPanel1.add(prenom);
        prenom.setBounds(190, 230, 80, 23);

        IDenseignant.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDenseignant.setForeground(new java.awt.Color(255, 255, 255));
        IDenseignant.setText("ID Enseignant :");
        jPanel1.add(IDenseignant);
        IDenseignant.setBounds(154, 260, 120, 23);

        IDclasse.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDclasse.setForeground(new java.awt.Color(255, 255, 255));
        IDclasse.setText("ID Classe :");
        jPanel1.add(IDclasse);
        IDclasse.setBounds(182, 290, 90, 23);

        IDdiscipline.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDdiscipline.setForeground(new java.awt.Color(255, 255, 255));
        IDdiscipline.setText("ID Discipline : ");
        jPanel1.add(IDdiscipline);
        IDdiscipline.setBounds(158, 320, 110, 23);

        
        jPanel1.add(case_nom);
        case_nom.setBounds(270, 200, 120, 20);

        
        jPanel1.add(case_prenom);
        case_prenom.setBounds(270, 230, 120, 20);
        jPanel1.add(case_IDenseignant);
        case_IDenseignant.setBounds(270, 260, 120, 20);
        jPanel1.add(case_IDclasse);
        case_IDclasse.setBounds(270, 290, 120, 20);
        jPanel1.add(case_IDdiscipline);
        case_IDdiscipline.setBounds(270, 320, 120, 20);

        buttonajouter.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonajouter.setText("Ajouter");
        jPanel1.add(buttonajouter);
        buttonajouter.setBounds(470, 260, 90, 31);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(290, 400, 73, 31);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel10");
        jPanel1.add(fond);
        fond.setBounds(0, 4, 700, 500);

        // faire du bouton une action
        
        this.buttonajouter.addActionListener(this);
        this.buttonretour.addActionListener(this);
        
        
        // set border for the panel
        jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Page de Recherche"));
      
        
        // add the panel to this frame
        add(jPanel1);
        

        pack();
    }
    
     public void actionPerformed(ActionEvent event) 
    { 
        if (event.getSource() == buttonajouter)
        {
            JOptionPane.showMessageDialog(jPanel1, "Disponible Prochainement!!!");
            //this.dispose();
            //new Maj_admin_eleve_ajouter();
        }
       
        if (event.getSource() == buttonretour)
        {
            this.dispose();
            new Menu_Principal();
        }
    }
}
