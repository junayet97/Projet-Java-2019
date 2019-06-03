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




public class Maj extends JFrame implements ActionListener {
    JButton Bouton;
    JButton Bouton2;
    
    JButton Bouton3;
    Container fenetre;
   
    
    
    public Maj() {
        
        this.setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        //this.setResizable(false);//fixe la taille de la fenetre
        setTitle("Menu Principal");
        
        this.fenetre=this.getContentPane();
        fenetre.setBackground(Color.LIGHT_GRAY);
        fenetre.setLayout(new FlowLayout(FlowLayout.CENTER));
       
        JPanel panel= new JPanel();
        panel.setLayout(new GridLayout(6,1,50,50));
        panel.setBackground(Color.DARK_GRAY);
        
        this.Bouton=new JButton("Administrateur");
        Bouton.setFont(new Font("Serif", Font.BOLD, 25));
        Bouton.setForeground(Color.BLACK);
        Bouton.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));
        this.Bouton2=new JButton("Enseignant");
        Bouton2.setFont(new Font("Serif", Font.BOLD, 25));
        Bouton2.setForeground(Color.BLACK);
        Bouton2.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));
        this.Bouton3=new JButton("Retour au Menu");
        Bouton3.setFont(new Font("Serif", Font.BOLD, 25));
        Bouton3.setForeground(Color.BLACK);
        Bouton3.setBorder(BorderFactory.createEmptyBorder(20,10,10,10));
        
        
        
        Bouton.addActionListener(this);
        Bouton2.addActionListener(this);
        Bouton3.addActionListener(this);
       
       
        
        JLabel tag=new JLabel("Gestion des Mises à Jour - Qui êtes-vous?");
        tag.setFont(new Font("Serif", Font.BOLD, 25));
        tag.setForeground(Color.white);
        
        panel.add(tag);
        panel.add(Bouton);
        panel.add(Bouton2);
        panel.add(Bouton3);
        
       
        
        
        
        fenetre.add(panel);
       
        this.setSize(1900, 1000); //taille de la fenêtre
        
        this.setLocationRelativeTo(null); //fenêtre positionnée au centre de l'écran
        
        setVisible(true);
        
    }
   
  public  void actionPerformed(ActionEvent event){
      
      if(event.getSource()==Bouton){
                  JOptionPane.showMessageDialog(fenetre, "Disponible Prochainement!!!\n Essayez un autre mode...");
                                  
                   }
       
      
      if(event.getSource()==Bouton2){
          JOptionPane.showMessageDialog(fenetre, "Disponible Prochainement!!!\n Essayez un autre mode...");
       }
      if(event.getSource()==Bouton3){
          this.dispose();
          new Menu_Principal();
       }
       
       
   }

}


