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


 
/**
 * This program demonstrates how to use JPanel in Swing.
 * @author mathi
 */
public class Recherche_eleve extends JFrame implements ActionListener
{
    private JPanel jPanel1;
    private JTextField caseid;
    private JButton buttonvalider;
    private JButton buttonretour;

    public Recherche_eleve() 
    {
        super("Recherches Informations___Recherche_eleve.java___");
        
        //Initialisation
        this.jPanel1 = new JPanel();
        
        JLabel logoece = new JLabel();
        JLabel fond = new JLabel();
        JLabel ptitre = new JLabel();
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
        ptitre.setText("Rentrer un identifiant :");
        jPanel1.add(ptitre);
        ptitre.setBounds(170, 140, 310, 50);
        
        //Le grand titre
        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Recherche d'un élève");
        jPanel1.add(gtitre);
        gtitre.setBounds(330, 30, 330, 50);
               
        //La case pour rentrer id
        jPanel1.add(caseid);
        caseid.setBounds(270, 250, 200, 20);
        
        //Le bouton de la validation
        buttonvalider.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonvalider.setText("Valider");
        jPanel1.add(buttonvalider);
        buttonvalider.setBounds(410, 230, 100, 31);
        
        //Case id
        
        jPanel1.add(caseid);
        caseid.setBounds(160, 230, 200, 30);
        
        //Le bouton de retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(270, 360, 100, 31);
        
        //Le fond
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("Recher");
        fond.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(fond);
        fond.setBounds(0, 0, 700, 500);
         
        // faire du bouton une action
        buttonvalider.addActionListener(this);
        buttonretour.addActionListener(this);
        caseid.addActionListener(this);
         
        // set border for the panel
        jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Informations Elèves"));
         
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
            new Recherche_eleve_info();
        }
        
        if(event.getSource()==buttonretour)
        {
            this.dispose();
            new Recherche();
        }
    }
     
}
