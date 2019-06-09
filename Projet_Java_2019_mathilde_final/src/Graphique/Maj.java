/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphique;
/**
 *
 * @author Junayet
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;




public class Maj extends JFrame implements ActionListener 
{
    private JPanel jPanel1;
    
    private JButton buttonprof;
    private JButton buttonadmin;
    private JButton buttonretour;
   
    
    public Maj() {
        
        super("Mise à jour___Maj.java");
        
        
        //Inititalisation
        this.jPanel1 = new JPanel();
        
        JLabel logoece  = new JLabel();
        JLabel titre = new JLabel();
        JLabel gtitre = new JLabel();
        JLabel ptitre = new JLabel();
        
        this.buttonprof= new JButton();
        this.buttonadmin = new JButton();
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
        
        //Le logo
        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(30, 30, 270, 60);
        
        //Le titre
        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Mise à jour");
        jPanel1.add(gtitre);
        gtitre.setBounds(480, 40, 150, 50);
        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Vous connecter en tant que :");
        jPanel1.add(ptitre);
        ptitre.setBounds(170, 140, 370, 50);
        
        //Bouton Prof
        buttonprof.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonprof.setText("Enseignant");
        jPanel1.add(buttonprof);
        buttonprof.setBounds(170, 220, 140, 60);
        
        //Bouton Admin
        buttonadmin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonadmin.setText("Administrateur");
        jPanel1.add(buttonadmin);
        buttonadmin.setBounds(370, 220, 140, 60);
        
        //Bouton de Retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(300, 350, 90, 30);
        
        
        //Le fond
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/imagefond.jpg"))); // NOI18N
        jPanel1.add(fond);
        fond.setBounds(0, 0, 700, 510);
        
        
        // faire du bouton une action
        this.buttonadmin.addActionListener(this);
        this.buttonprof.addActionListener(this);
        this.buttonretour.addActionListener(this);
        
        
        // set border for the panel
        jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Page de Recherche"));
      
        
        // add the panel to this frame
        add(jPanel1);
 
        pack();
        
    }
   
    @Override
    public  void actionPerformed(ActionEvent event)
    {
      
        if(event.getSource()== buttonadmin)
        {
            this.dispose();
            new Maj_admin();
                                  
        }
        if(event.getSource()== buttonprof)
        {
            this.dispose();
            new Maj_prof();
        }
        if(event.getSource()== buttonretour)
        {
            this.dispose();
            new Menu_Principal();
        }
   }
}


