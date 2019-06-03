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
import Modèle.Connexion;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;



public class co extends JFrame implements ActionListener{ 

JTextField bdd = new JTextField(5);
JTextField login = new JTextField(5);
Container fenetre;
String get1,get2;


 public co() {
     
         this.fenetre=this.getContentPane();
	JLabel inf1 = new JLabel("BDD");
        JLabel inf2 = new JLabel("Login");
        
        JPanel panneauTaille = new JPanel();
	

	
	bdd.addActionListener(this);
        login.addActionListener(this);

	panneauTaille.setLayout(new GridLayout(3, 2));
         JPanel vide=new JPanel();
         vide.setBackground(Color.black);
         JPanel tete=new JPanel();
        tete.setBackground(Color.black);
        JLabel titre=new JLabel("Veuillez vous identifier:");
        titre.setFont(new Font("Serif", Font.BOLD, 15));
        titre.setForeground(Color.white);
        tete.add(titre);
        panneauTaille.add(tete);
        panneauTaille.add(vide);
	panneauTaille.add(inf1);
	panneauTaille.add(bdd);
        panneauTaille.add(inf2);
	panneauTaille.add(login);
	
	fenetre.add(panneauTaille);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	this.setSize(600,300);
	this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
 }
 
 public void actionPerformed(ActionEvent evt) {
 
 
 try {  get1 = bdd.getText();
        get2 = login.getText();
        if(get1.equals("java2019")&get2.equals("root"))
        {
        Connexion co= new Connexion("java2019","root","");
	dispose();
	new Menu_Principal();
        }
        else
        {
           JOptionPane.showMessageDialog(fenetre, "Login ou nom de la BDD érroné,veuillez réessayer... "); 
        }
	}
 catch(Exception exc) {
	JOptionPane.showMessageDialog(fenetre, "Erreur, BDD introuvable, veuillez réessayer!");
 }

 }
 
 public String getBdd()
 {
     return get1;
 }
 
 public String getLog()
 {
     return get2;
 }
 
}
