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


public class Maj_prof_eval_ajouter extends JFrame implements ActionListener
{
    
    private JPanel jPanel1;
    
    private JButton buttonretour;
    private JButton buttonvalider;
    private JButton buttoninformation;
    
    private JTextField caseappreciation;
    private JTextField caseid;
    private JTextField casenote;
    
    public Maj_prof_eval_ajouter()
    {
        super("Ajouter une Evaluation___Maj_prof_ajouter.java__");
        
        this.jPanel1 = new javax.swing.JPanel();
        
        JLabel logoece = new JLabel();
        JLabel gtitre = new JLabel();
        JLabel ptitre = new JLabel();
        JLabel titre = new JLabel();
        
        JLabel id = new JLabel();
        JLabel note = new JLabel();
        JLabel appreciation = new JLabel();
        
        JSeparator jSeparator1 = new JSeparator();
        JSeparator jSeparator2 = new JSeparator();
        
        
        this.caseappreciation = new JTextField();
        this.casenote = new JTextField();
        this.caseid = new JTextField();
        
        this.buttoninformation = new JButton();
        this.buttonvalider = new JButton();
        this.buttonretour = new JButton();
        
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
        titre.setText("Ajouter une évaluation :");
        jPanel1.add(titre);
        titre.setBounds(190, 110, 310, 40);
        

        //L'id
        id.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("Rentrer l'identifiant du bulletin :");
        jPanel1.add(id);
        id.setBounds(120, 160, 200, 20);

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
        
        //les séparateurs
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(110, 250, 480, 20);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(110, 380, 480, 20);
        
        
        //Bouton information
        buttoninformation.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttoninformation.setText("Informations");
        jPanel1.add(buttoninformation);
        buttoninformation.setBounds(260, 200, 130, 30);

        //Le bouton de retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(280, 420, 100, 31);
        
        //les cases
        jPanel1.add(casenote);
        casenote.setBounds(350, 270, 150, 20);
        jPanel1.add(caseid);
        caseid.setBounds(350, 160, 150, 20);
        jPanel1.add(caseappreciation);
        caseappreciation.setBounds(350, 300, 150, 20);
        

        

        
        //Le Grand titre
        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Mise à Jour Evaluation");
        jPanel1.add(gtitre);
        gtitre.setBounds(380, 20, 290, 50);
        

        //Le bouton valider
        buttonvalider.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonvalider.setText("Valider");
        jPanel1.add(buttonvalider);
        buttonvalider.setBounds(290, 340, 80, 31);

        //Le fond
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        jPanel1.add(fond);
        fond.setBounds(0, 0, 700, 510);

        // faire du bouton une action
        this.caseid.addActionListener(this);
        this.buttoninformation.addActionListener(this);
        this.casenote.addActionListener(this);
        this.caseappreciation.addActionListener(this);
        
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
        if(event.getSource()== buttoninformation)
        {
            JOptionPane.showMessageDialog(jPanel1, " Indisponible pour le moment ! ");
                                  
        }
        if(event.getSource()== buttonvalider)
        {
            JOptionPane.showMessageDialog(jPanel1, "Indisponible pour le moment !  ");
                                  
        }
        if(event.getSource()== buttonretour)
        {
            this.dispose();
            new Maj_prof_evaluation();
        }
    }
}
