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

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;

public class Reporting extends JFrame implements ActionListener 
{
    private JPanel page;
    private JButton buttonretour;
    
    public Reporting()
    {
        super ("Reporting_____Reporting.java");
        
        //Initialisation
        
        this.page = new JPanel();
        
        JLabel logoece = new JLabel();
        JLabel titre = new JLabel();
        JLabel cadre = new JLabel();
        
        this.buttonretour = new JButton();
        
        JLabel fond = new JLabel();
        
         //Parametre de la page
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//termine le processus lorsque l'on clique sur la croix
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);
        setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        setVisible(true);
        
        page.setLayout(null);
        
        //Le Logo
        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        page.add(logoece);
        logoece.setBounds(46, 44, 267, 67);

        //Le titre
        titre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Le Reporting");
        page.add(titre);
        titre.setBounds(380, 50, 190, 60);

        //Le cadre pour mettre les graphique
        cadre.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        cadre.setForeground(new java.awt.Color(204, 204, 255));
        cadre.setText("Mettre les graphiques ou histogrammes ici");
        cadre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        page.add(cadre);
        cadre.setBounds(180, 160, 310, 200);

        //Bouton de retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        page.add(buttonretour);
        buttonretour.setBounds(300, 400, 90, 30);

        //Le fond
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel4");
        page.add(fond);
        fond.setBounds(0, -6, 700, 510);
        
        //actions des boutons
        buttonretour.addActionListener(this);
        
        
        //ajouter la page 
        add(page);
        
        pack();       
    }
    
    @Override
    public  void actionPerformed(ActionEvent event)
    {
        if(event.getSource()== buttonretour)
        {
            this.dispose();
            new Menu_Principal();
        }
        
    }
}

    

