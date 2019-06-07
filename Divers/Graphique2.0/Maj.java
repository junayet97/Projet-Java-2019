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
    private JLabel logoece;
    private JLabel titre;
    private JButton buttonprof;
    private JButton buttonadmin;
    private JButton buttonretour;
    private JLabel fonds;
   
    
    
    public Maj() {
        
        super("Mise à jour");
        
        
        //Inititalisation
        this.jPanel1 = new JPanel();
        
        JLabel logoece  = new JLabel();
        JLabel titre = new JLabel();
        
        this.buttonprof= new JButton();
        this.buttonadmin = new JButton();
        this.buttonretour = new JButton();
        JLabel fonds = new JLabel();
        
        //Parametrage de la page
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
        logoece.setBounds(10, 10, 270, 60);
        
        //Le titre
        titre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Recherche d'une personne :");
        jPanel1.add(titre);
        titre.setBounds(170, 140, 330, 30);
        
        //Bouton Prof
        buttonprof.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonprof.setText("Professeur");
        jPanel1.add(buttonprof);
        buttonprof.setBounds(180, 230, 150, 50);
        
        //Bouton Elève
        buttonadmin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonadmin.setText("Administrateur");
        jPanel1.add(buttonadmin);
        buttonadmin.setBounds(370, 230, 150, 50);
        
        //Bouton de Retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(290, 380, 80, 30);
        
        
        //Le fond
        fonds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fonds.setText("jLabel3");
        jPanel1.add(fonds);
        fonds.setBounds(4, 4, 700, 490);
        
        
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
            new MajAdmin();
                                  
        }
        if(event.getSource()== buttonprof)
        {
            this.dispose();
            new MajProf();
        }
        if(event.getSource()== buttonretour)
        {
            this.dispose();
            new Menu_Principal();
        }
   }
}


