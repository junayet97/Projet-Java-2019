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

public class Maj_prof_eval_modifier extends JFrame implements ActionListener
{
    private JPanel jPanel1;
    
    private JButton buttonretour;
    private JButton buttonvalider;
    
    private JTextField caseappreciation;
    private JTextField caseid;
    private JTextField casenote;
    private JComboBox<String> choixbulletin;
    private JComboBox<String> choixmatiere;
    
    public Maj_prof_eval_modifier()
    {
        super("Modifier une Evaluation___Maj_prof__modifier.java___");
        
        this.jPanel1 = new javax.swing.JPanel();
        
        JLabel logoece = new JLabel();
        JLabel ptitre = new JLabel();
        JLabel titre = new JLabel();
        JLabel matiere = new JLabel();
        JLabel id = new JLabel();
        JLabel note = new JLabel();
        JLabel appreciation = new JLabel();
        
        JSeparator jSeparator1 = new JSeparator();
        JSeparator jSeparator2 = new JSeparator();
        
        this.buttonretour = new JButton();
        this.casenote = new JTextField();
        this.caseid = new JTextField();
        this.choixmatiere = new JComboBox<>();
        
        JLabel bulletin = new JLabel();
        JLabel gtitre = new JLabel();
        
        this.choixbulletin = new JComboBox<>();
        this.caseappreciation = new JTextField();
        this.buttonvalider = new JButton();
        
        JLabel fond = new JLabel();

        //Parametrage de la page
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true);

        jPanel1.setLayout(null);

        //Le Logo
        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(30, 20, 267, 67);

        //Le petit titre
        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Compte Enseignant");
        jPanel1.add(ptitre);
        ptitre.setBounds(400, 60, 250, 40);

        //Le titre
        titre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Modifier une évaluation :");
        jPanel1.add(titre);
        titre.setBounds(190, 100, 310, 40);

        // La matiere
        matiere.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        matiere.setForeground(new java.awt.Color(255, 255, 255));
        matiere.setText("Selectionner la Matière :");
        jPanel1.add(matiere);
        matiere.setBounds(170, 180, 160, 20);

        //L'id
        id.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("Rentrer l'identifiant de l'élève :");
        jPanel1.add(id);
        id.setBounds(130, 150, 200, 20);

        //La note
        note.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        note.setForeground(new java.awt.Color(255, 255, 255));
        note.setText("Entrer la note :");
        jPanel1.add(note);
        note.setBounds(220, 270, 100, 23);

        //L'appréciation
        appreciation.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        appreciation.setForeground(new java.awt.Color(255, 255, 255));
        appreciation.setText("Entrer une Appréciation :");
        jPanel1.add(appreciation);
        appreciation.setBounds(160, 300, 160, 23);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(110, 250, 480, 20);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(110, 380, 480, 20);

        //Le bouton de retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(280, 420, 100, 31);
        jPanel1.add(casenote);
        casenote.setBounds(350, 270, 150, 20);
        jPanel1.add(caseid);
        caseid.setBounds(350, 150, 150, 20);

        //Le choix de la matiere
        choixmatiere.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        choixmatiere.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matière.1", "Matière.2", "Matière.3", "Matière.4" }));
        jPanel1.add(choixmatiere);
        choixmatiere.setBounds(350, 180, 150, 20);

        //Le bulletin
        bulletin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setText("Selectionner le Bulletin :");
        jPanel1.add(bulletin);
        bulletin.setBounds(170, 210, 150, 23);

        
        //Le Grand titre
        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Mise à Jour Evaluation");
        jPanel1.add(gtitre);
        gtitre.setBounds(380, 20, 290, 50);

        //Le choix du bulltein
        choixbulletin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        choixbulletin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulletin.1", "Bulletin.2", "Bulletin.3", "Bulletin.4" }));
        jPanel1.add(choixbulletin);
        choixbulletin.setBounds(350, 210, 150, 20);
        jPanel1.add(caseappreciation);
        caseappreciation.setBounds(350, 300, 150, 20);

        //Le bouton valider
        buttonvalider.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonvalider.setText("Valider");
        jPanel1.add(buttonvalider);
        buttonvalider.setBounds(290, 340, 80, 31);

        //Le fond
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        jPanel1.add(fond);
        fond.setBounds(0, -6, 700, 510);

        // faire du bouton une action
        this.buttonvalider.addActionListener(this);
        this.caseappreciation.addActionListener(this);
        this.caseid.addActionListener(this);
        this.choixmatiere.addActionListener(this);
        this.choixbulletin.addActionListener(this);
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
        if(event.getSource()== buttonvalider)
        {
            JOptionPane.showMessageDialog(jPanel1, " Test faux : L'ajout à bien était effectuer ! ");
                                  
        }
        if(event.getSource()== buttonretour)
        {
            this.dispose();
            new Maj_prof_evaluation();
        }
        
    }
}
    
