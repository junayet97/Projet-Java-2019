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

public class Maj_admin_eleve_ajouter extends JFrame implements ActionListener
{
    private JPanel jPanel1;
    
    private JButton buttonajouter;
    private javax.swing.JButton buttonretour;
    
    private JTextField case_IDclasse;
    private JTextField case_IDeleve;
    private JTextField case_nom;
    private JTextField case_prenom;
    
    
    public Maj_admin_eleve_ajouter()
    {
        this.jPanel1 = new javax.swing.JPanel();
        
        JLabel logoece = new JLabel();
        JLabel gtitre = new JLabel();
        JLabel ptitre = new JLabel();
        JLabel titre = new JLabel();
        JLabel nom = new JLabel();
        JLabel prenom = new JLabel();
        JLabel IDeleve = new JLabel();
        JLabel IDclasse = new JLabel();
        this.case_nom = new JTextField();
        this.case_prenom = new JTextField();
        this.case_IDeleve = new JTextField();
        this.case_IDclasse = new JTextField();
        this.buttonajouter = new JButton();
        this.buttonretour = new JButton();
        JLabel fond = new JLabel();

        //Parametrage de la page
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(null);

        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(30, 20, 270, 60);

        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Mise à jour élève");
        jPanel1.add(gtitre);
        gtitre.setBounds(410, 30, 220, 30);

        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Compte Administrateur");
        jPanel1.add(ptitre);
        ptitre.setBounds(370, 60, 300, 50);

        titre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Ajouter un élève :");
        jPanel1.add(titre);
        titre.setBounds(250, 150, 180, 33);

        nom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 255, 255));
        nom.setText("Nom :");
        jPanel1.add(nom);
        nom.setBounds(230, 200, 50, 23);

        prenom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        prenom.setForeground(new java.awt.Color(255, 255, 255));
        prenom.setText("Prénom :");
        jPanel1.add(prenom);
        prenom.setBounds(210, 230, 70, 23);

        IDeleve.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDeleve.setForeground(new java.awt.Color(255, 255, 255));
        IDeleve.setText("ID Elève :");
        jPanel1.add(IDeleve);
        IDeleve.setBounds(210, 260, 70, 23);

        IDclasse.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDclasse.setForeground(new java.awt.Color(255, 255, 255));
        IDclasse.setText("ID Classe : ");
        jPanel1.add(IDclasse);
        IDclasse.setBounds(210, 290, 70, 23);
        jPanel1.add(case_nom);
        case_nom.setBounds(280, 200, 130, 20);
        jPanel1.add(case_prenom);
        case_prenom.setBounds(280, 230, 130, 20);

        
        jPanel1.add(case_IDeleve);
        case_IDeleve.setBounds(280, 260, 130, 20);
        jPanel1.add(case_IDclasse);
        case_IDclasse.setBounds(280, 290, 130, 20);

        buttonajouter.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonajouter.setText("Ajouter");;
        jPanel1.add(buttonajouter);
        buttonajouter.setBounds(470, 240, 110, 31);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(310, 370, 100, 31);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel9");
        jPanel1.add(fond);
        fond.setBounds(-6, 0, 710, 510);

        // faire du bouton une action
        this.buttonajouter.addActionListener(this);
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
        if (event.getSource() == buttonajouter)
        {
            JOptionPane.showMessageDialog(jPanel1, "Disponible Prochainement!!!");
            //this.dispose();
            //new Maj_prof_eval_ajouter();
        }
        if (event.getSource() == buttonretour)
        {
            this.dispose();
            new Maj_admin_eleve();
        } 
    }
}
    

