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




public class Menu_Principal extends JFrame implements ActionListener {
    JButton Bouton;
    JButton Bouton2;
    JButton Bouton3;
    JButton Bouton4;
    Container fenetre;
    
    
    
    public Menu_Principal() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //termine le processus lorsque l'on clique sur la croix
        this.setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        //this.setResizable(false);//fixe la taille de la fenetre
        setTitle("Menu Principal");
        
        this.fenetre=this.getContentPane();
        fenetre.setBackground(Color.LIGHT_GRAY);
        fenetre.setLayout(new FlowLayout(FlowLayout.CENTER));
       
        JPanel panel= new JPanel();
        panel.setLayout(new GridLayout(6,1,50,50));
        panel.setBackground(Color.DARK_GRAY);
        
        this.Bouton=new JButton("Recherche D'information");
        Bouton.setFont(new Font("Serif", Font.BOLD, 25));
        Bouton.setForeground(Color.BLACK);
        Bouton.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));
        this.Bouton2=new JButton("Mise à Jour des Données");
        Bouton2.setFont(new Font("Serif", Font.BOLD, 25));
        Bouton2.setForeground(Color.BLACK);
        Bouton2.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));
        this.Bouton3=new JButton("Reporting");
        Bouton3.setFont(new Font("Serif", Font.BOLD, 25));
        Bouton3.setForeground(Color.BLACK);
        Bouton3.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));
        this.Bouton4=new JButton("Quitter");
        Bouton4.setFont(new Font("Serif", Font.BOLD, 25));
        Bouton4.setForeground(Color.BLACK);
        Bouton4.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));
        
        
        Bouton.addActionListener(this);
        Bouton2.addActionListener(this);
        Bouton3.addActionListener(this);
        Bouton4.addActionListener(this);
        
        JLabel tag=new JLabel("Menu Principal");
        tag.setFont(new Font("Serif", Font.BOLD, 25));
        tag.setForeground(Color.white);
        
        panel.add(tag);
        panel.add(Bouton);
        panel.add(Bouton2);
        panel.add(Bouton3);
        panel.add(Bouton4);
        
        
        JPanel tete=new JPanel();
        tete.setBackground(Color.black);
        JLabel titre=new JLabel("Bienvenue dans la page de gestion de l'école\n (Auteur Junayet Bhuiyan, Mathilde Giraudon, Victor Troussard)");
        titre.setFont(new Font("Serif", Font.BOLD, 40));
        titre.setForeground(Color.white);
        tete.add(titre);
        
        fenetre.add(tete);
        fenetre.add(panel);
       
        this.setSize(1900, 1000); //taille de la fenêtre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //termine le processus lorsque l'on clique sur la croix
        this.setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        
        setVisible(true);
        
    }
   
  public  void actionPerformed(ActionEvent event){
      
      if(event.getSource()==Bouton){
                  JOptionPane.showMessageDialog(fenetre, "Disponible Prochainement!!!\n Essayez un autre mode...");
                                  
                   }
       
      
      if(event.getSource()==Bouton2){
          this.dispose();
          new Maj();
       }
       if(event.getSource()==Bouton3){
           JOptionPane.showMessageDialog(fenetre, "Disponible Prochainement!!!\n Essayez un autre mode...");
       }
       if(event.getSource()==Bouton4){
           
           System.exit(0);
       }
   }

}



