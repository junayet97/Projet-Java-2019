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
import Modèle.*;
import Controleur.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Maj_admin_prof_supprimer extends JFrame implements ActionListener
{
    
    
    private JButton buttonretour;
    private JButton buttonsupprimer;
    private JTextField case_ID;
    private JPanel jPanel1;
    
    
    public Maj_admin_prof_supprimer()
    {
        super("Mise à jour enseignant___Maj_prof_supprimer.java__");
        
        this.jPanel1 = new JPanel();
        JLabel logoece = new JLabel();
        JLabel gtitre = new JLabel();
        JLabel ptitre = new JLabel();
        JLabel titre = new JLabel();
        JLabel ID = new JLabel();
        this.case_ID = new JTextField();
        this.buttonsupprimer = new JButton();
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

        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(30, 30, 270, 60);

        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Mise à jour Enseignant");
        jPanel1.add(gtitre);
        gtitre.setBounds(360, 30, 290, 44);

        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Compte Administrateur");
        jPanel1.add(ptitre);
        ptitre.setBounds(350, 80, 300, 40);

        titre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Supprimer un enseignant :");
        jPanel1.add(titre);
        titre.setBounds(210, 170, 243, 33);

        ID.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setText("Rentrer ID Enseignant :");
        jPanel1.add(ID);
        ID.setBounds(100, 240, 150, 23);

        case_ID.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jPanel1.add(case_ID);
        case_ID.setBounds(280, 240, 150, 20);

        buttonsupprimer.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonsupprimer.setText("Supprimer");
        jPanel1.add(buttonsupprimer);
        buttonsupprimer.setBounds(470, 230, 110, 31);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(300, 340, 100, 31);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        jPanel1.add(fond);
        fond.setBounds(0, -6, 700, 510);

         // faire du bouton une action
        this.buttonretour.addActionListener(this);
        this.buttonsupprimer.addActionListener(this);
        
        // set border for the panel
        
        jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Page de Connexion"));
      
        
        // add the panel to this frame
        add(jPanel1);
 

        pack();
    }
    
    @Override
    public  void actionPerformed(ActionEvent event)
    {
        
         if(event.getSource()== buttonsupprimer)
        {
           
        try{
            Connexion co= new Connexion("java2019","root","");
            
            String get=case_ID.getText().trim();
          
            
            if(get.equals(""))
            {
                JOptionPane.showMessageDialog(jPanel1, "Le champs est vide!");
            }
                else
            {
                   
                 int id=Integer.parseInt(get);  
                 supprim_enseignant(id);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
       
    }
        if(event.getSource()== buttonretour)
        {
            this.dispose();
            new Maj_admin_prof();
        }
    }
    
    /**
  * Suprime un enseignant (avec toutes les infos qui lui sont relatives) à partir de l'id de l'enseignant 
     * @param id_enseignant id de l'eleve
     
     * @return  1 si c bon, 2 si l'enseignant n'est pas trouvé*/
public  int supprim_enseignant(int id_enseignant)
{   
    Enseignant enseignant=new Enseignant(id_enseignant,"", "");
    
    
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Enseignant> e=new DAO_Enseignant(co);
    int test=0;
    for(int i=0;i<e.getids().size();i++) // on cherche si l'enseignant existe
    {
        if( Integer.parseInt(e.getids().get(i).trim())== id_enseignant) 
        {
            test=1;
        } 
    }
    if (test==1) // si l'enseignant existe
    {
        e.delete(enseignant);
        JOptionPane.showMessageDialog(jPanel1,"Enseignant suprimé avec succés");
        return 1;
    }
    else
    {
        JOptionPane.showMessageDialog(jPanel1,"Suppression echoué, l'enseignant que vous souhaiter supprimer n'existe pas!");
        return 2;
    }
    }
    catch(ClassNotFoundException | SQLException e){return 0;}
}  
    
    
}
