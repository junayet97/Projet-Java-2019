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
public class MajAdmin extends JFrame implements ActionListener
{
    private  JPanel jPanel1;
    
    private JButton buttoneleve;
    private JButton buttonprof;
    private JComboBox<String> autrechoix;
    private JButton buttonvalider;
    
    private JButton buttonretour;
    
    
    public MajAdmin()
    {
        
        super("Compte Administrateur...MajAdmin.java");
        
        
        //Initialisation
        this.jPanel1 = new JPanel();
        
        JLabel gtitre = new JLabel();
        JLabel logoece = new JLabel();
        JLabel titre = new JLabel();
        JLabel fond = new JLabel();
        
        JLabel autre = new JLabel();
        this.autrechoix = new JComboBox<>();
        
        this.buttoneleve = new JButton();
        this.buttonprof = new JButton();
        this.buttonvalider = new JButton();
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
        buttoneleve.setBounds(280, 200, 100, 30);
        
        //Bouton prof
        buttonprof.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        buttonprof.setText("Professeurs");
        jPanel1.add(buttonprof);
        buttonprof.setBounds(280, 250, 100, 30);
        
        //Autre
        autre.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        autre.setForeground(new java.awt.Color(255, 255, 255));
        autre.setText("Autre : ");
        jPanel1.add(autre);
        autre.setBounds(180, 310, 70, 30);
        
        //Chois d'une autre possibilité
        autrechoix.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        autrechoix.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trimestre", "Discipline", "Classes", "Niveau","Année", "Enseignement","Bulletin"}));        
        jPanel1.add(autrechoix);
        autrechoix.setBounds(250, 310, 140, 30);
        
        
        //Bouton de retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(290, 400, 80, 30);
        
        //Bouton Valider
        buttonvalider.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonvalider.setText("Valider");
        jPanel1.add(buttonvalider);
        buttonvalider.setBounds(430, 310, 90, 30);
        
        //Le fond
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel1");
        jPanel1.add(fond);
        fond.setBounds(0,0,700, 500);
        
        // faire du bouton une action
        this.buttoneleve.addActionListener(this);
        this.autrechoix.addActionListener(this);
        this.buttonprof.addActionListener(this);
        this.buttonvalider.addActionListener(this);
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
        if (event.getSource() == autrechoix)
        {
            JOptionPane.showMessageDialog(jPanel1, "Disponible Prochainement!!!");
        }
        if (event.getSource() == buttonprof)
        {
            JOptionPane.showMessageDialog(jPanel1, "Disponible Prochainement!!!");
        }
        if(event.getSource() == buttonvalider)
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
