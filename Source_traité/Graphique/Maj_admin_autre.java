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

import java.awt.*;
import java.awt.event.*;
import Modèle.*;
import Controleur.*;
import java.sql.SQLException;

 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Maj_admin_autre extends JFrame implements ActionListener
{
    
    private javax.swing.JPanel jPanel1;
     
    private javax.swing.JScrollPane ScrollPane;
    
    private javax.swing.JButton button_ajouter_annee;
    private javax.swing.JButton button_ajouter_bulletin;
    private javax.swing.JButton button_ajouter_classe;
    private javax.swing.JButton button_ajouter_discipline;
    private javax.swing.JButton button_ajouter_niveau;
    private javax.swing.JButton button_ajouter_trimestre;
    
    private javax.swing.JButton button_modifier_bulletin;
    private javax.swing.JButton button_modifier_classe;
    private javax.swing.JButton button_modifier_discipline;
    private javax.swing.JButton button_modifier_niveau;
    private javax.swing.JButton button_modifier_trimestre;
    
    private javax.swing.JButton button_supprimer_annee;
    private javax.swing.JButton button_supprimer_bulletin;
    private javax.swing.JButton button_supprimer_classe;
    private javax.swing.JButton button_supprimer_discipline;
    private javax.swing.JButton button_supprimer_niveau;
    private javax.swing.JButton button_supprimer_trimestre;
    
    private javax.swing.JButton buttonretour;
    
    private javax.swing.JTextField case_annee;
    private javax.swing.JTextField case_appreciation_bulletin;
    private javax.swing.JTextField case_debut_trimestre;
    private javax.swing.JTextField case_fin_trimestre;
    private javax.swing.JTextField case_idanne_classe;
    private javax.swing.JTextField case_idannee_trimestre;
    private javax.swing.JTextField case_idbulletin_bulletin;
    private javax.swing.JTextField case_idclasse_classe;
    private javax.swing.JTextField case_iddiscipline_discipline;
    private javax.swing.JTextField case_idinscription_bulletin;
    private javax.swing.JTextField case_idniveau_classe;
    private javax.swing.JTextField case_idniveau_niveau;
    private javax.swing.JTextField case_idtrimestre_bulletin;
    private javax.swing.JTextField case_idtrimestre_niveau;
    private javax.swing.JTextField case_nom_classe;
    private javax.swing.JTextField case_nom_discipline;
    private javax.swing.JTextField case_nom_niveau;
    private javax.swing.JTextField case_numéro_trimestre;
    
    
    public Maj_admin_autre()
    {
        
        super("mise à jour autre____Maj_admin_autre.java");
        
        
        this.ScrollPane = new JScrollPane();
        
        this.jPanel1 = new javax.swing.JPanel();
        
        JLabel IDannee = new JLabel();
        JLabel IDniveau = new JLabel();        
        JLabel Nom_niveau = new JLabel();        
        JLabel Trimestre = new JLabel();
        JLabel IDtrimestre_niveau = new JLabel();        
        JLabel numero_trimestre = new JLabel();        
        JLabel debut_trimestre = new JLabel();
        JLabel discipline = new JLabel();       
        JLabel idanne_trimestre = new JLabel();
        JLabel iddiscipline = new JLabel();
        JLabel bulletin = new JLabel();        
        JLabel classe = new JLabel();        
        JLabel fin_trimestre = new JLabel();
        JLabel nom_discipline = new JLabel();
        JLabel idbulletin = new JLabel();
        JLabel appreciation_bulletin = new JLabel();
        JLabel idinscription_bulletin = new JLabel();
        JLabel idtrimestre_bulletin = new JLabel();
        JLabel idclasse = new JLabel();
        JLabel nom_classe = new JLabel();
        JLabel idniveau_classe = new JLabel();
        JLabel idanne_classe = new JLabel();
        JLabel Année = new JLabel();
        JLabel Niveau = new JLabel();
        JLabel logoece = new JLabel();
        JLabel titre = new JLabel();
        
        this.case_fin_trimestre = new JTextField();
        this.case_debut_trimestre = new JTextField();
        this.case_numéro_trimestre = new JTextField();
        this.case_nom_niveau = new JTextField();
        this.case_idniveau_niveau = new JTextField();
        this.case_idannee_trimestre = new JTextField();
        this.case_iddiscipline_discipline = new JTextField();
        this.case_nom_discipline = new JTextField();
        this.case_idclasse_classe = new JTextField();
        this.case_idtrimestre_niveau = new JTextField();
        this.case_idbulletin_bulletin = new JTextField();
        this.case_appreciation_bulletin = new JTextField();
        this.case_idinscription_bulletin = new JTextField();
        this.case_idtrimestre_bulletin = new JTextField();
        this.case_nom_classe = new JTextField();
        this.case_idniveau_classe = new javax.swing.JTextField();
        this.case_idanne_classe = new javax.swing.JTextField();
        
        JSeparator jSeparator1 = new JSeparator();
        JSeparator jSeparator2 = new JSeparator();
        JSeparator jSeparator3 = new JSeparator();
        JSeparator jSeparator4 = new JSeparator();
        JSeparator jSeparator5 = new JSeparator();
        
        this.button_supprimer_discipline = new JButton();
        this.button_ajouter_trimestre = new JButton();
        this.button_supprimer_annee = new JButton();
        this.button_supprimer_niveau = new JButton();
        this.button_supprimer_classe = new JButton();
        this.button_supprimer_trimestre = new JButton();
        this.button_supprimer_bulletin = new JButton();
        this.button_ajouter_discipline = new JButton();
        this.button_ajouter_bulletin = new JButton();
        this.button_ajouter_classe = new JButton();
        this.button_ajouter_niveau = new JButton();
        this.button_ajouter_annee = new JButton();
        this.button_modifier_classe = new JButton();
        this.button_modifier_bulletin = new JButton();
        this.button_modifier_discipline = new JButton();
        this.button_modifier_trimestre = new JButton();
        this.button_modifier_niveau = new JButton();
        this.case_annee = new JTextField();
        
        this.buttonretour = new JButton();
        
        JLabel fond = new JLabel();

        
        //paramere de la page 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);//fenêtre positionnée au centre de l'écran
        setVisible(true);

        //bar déroulante
        ScrollPane.setMinimumSize(new java.awt.Dimension(100, 100));

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 650));
        jPanel1.setLayout(null);

        IDannee.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDannee.setForeground(new java.awt.Color(255, 255, 255));
        IDannee.setText("ID Année Scolaire  :");
        jPanel1.add(IDannee);
        IDannee.setBounds(120, 20, 130, 20);

        button_supprimer_discipline.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_supprimer_discipline.setText("Supprimer");
        jPanel1.add(button_supprimer_discipline);
        button_supprimer_discipline.setBounds(670, 310, 100, 31);

        IDniveau.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDniveau.setForeground(new java.awt.Color(255, 255, 255));
        IDniveau.setText("ID  Niveau :");
        jPanel1.add(IDniveau);
        IDniveau.setBounds(180, 60, 73, 23);
        jPanel1.add(case_idniveau_niveau);
        case_idniveau_niveau.setBounds(260, 60, 130, 20);

        Nom_niveau.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        Nom_niveau.setForeground(new java.awt.Color(255, 255, 255));
        Nom_niveau.setText("Nom Niveau  :");
        jPanel1.add(Nom_niveau);
        Nom_niveau.setBounds(170, 90, 83, 23);

        
        jPanel1.add(case_nom_niveau);
        case_nom_niveau.setBounds(260, 90, 130, 20);

        Trimestre.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        Trimestre.setForeground(new java.awt.Color(255, 255, 255));
        Trimestre.setText("Trimestre ");
        jPanel1.add(Trimestre);
        Trimestre.setBounds(30, 145, 74, 26);

        IDtrimestre_niveau.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDtrimestre_niveau.setForeground(new java.awt.Color(255, 255, 255));
        IDtrimestre_niveau.setText("ID Trimestre :");
        jPanel1.add(IDtrimestre_niveau);
        IDtrimestre_niveau.setBounds(160, 140, 86, 23);

        
        jPanel1.add(case_numéro_trimestre);
        case_numéro_trimestre.setBounds(260, 170, 130, 20);

        numero_trimestre.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        numero_trimestre.setForeground(new java.awt.Color(255, 255, 255));
        numero_trimestre.setText("Numéro :");
        jPanel1.add(numero_trimestre);
        numero_trimestre.setBounds(190, 170, 57, 23);
        jPanel1.add(case_debut_trimestre);
        case_debut_trimestre.setBounds(260, 200, 130, 20);

        debut_trimestre.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        debut_trimestre.setForeground(new java.awt.Color(255, 255, 255));
        debut_trimestre.setText("Début :");
        jPanel1.add(debut_trimestre);
        debut_trimestre.setBounds(200, 200, 45, 23);
        jPanel1.add(case_fin_trimestre);
        case_fin_trimestre.setBounds(260, 230, 130, 20);

        discipline.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        discipline.setForeground(new java.awt.Color(255, 255, 255));
        discipline.setText("Discipline");
        jPanel1.add(discipline);
        discipline.setBounds(30, 300, 65, 26);
        jPanel1.add(case_idannee_trimestre);
        case_idannee_trimestre.setBounds(260, 260, 130, 20);

        idanne_trimestre.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        idanne_trimestre.setForeground(new java.awt.Color(255, 255, 255));
        idanne_trimestre.setText("ID Année Scolaire :");
        jPanel1.add(idanne_trimestre);
        idanne_trimestre.setBounds(130, 260, 116, 23);

        iddiscipline.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        iddiscipline.setForeground(new java.awt.Color(255, 255, 255));
        iddiscipline.setText("ID Discipline :");
        jPanel1.add(iddiscipline);
        iddiscipline.setBounds(170, 300, 83, 23);

        bulletin.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        bulletin.setForeground(new java.awt.Color(255, 255, 255));
        bulletin.setText("Bulletin");
        jPanel1.add(bulletin);
        bulletin.setBounds(30, 370, 54, 26);
        jPanel1.add(case_iddiscipline_discipline);
        case_iddiscipline_discipline.setBounds(260, 300, 130, 20);
        jPanel1.add(case_nom_discipline);
        case_nom_discipline.setBounds(260, 330, 130, 20);

        classe.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        classe.setForeground(new java.awt.Color(255, 255, 255));
        classe.setText("Classe");
        jPanel1.add(classe);
        classe.setBounds(30, 500, 41, 26);
        jPanel1.add(case_idclasse_classe);
        case_idclasse_classe.setBounds(260, 500, 130, 20);

        fin_trimestre.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        fin_trimestre.setForeground(new java.awt.Color(255, 255, 255));
        fin_trimestre.setText("Fin :");
        jPanel1.add(fin_trimestre);
        fin_trimestre.setBounds(220, 230, 27, 23);
        jPanel1.add(case_idtrimestre_niveau);
        case_idtrimestre_niveau.setBounds(260, 140, 130, 20);

        nom_discipline.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        nom_discipline.setForeground(new java.awt.Color(255, 255, 255));
        nom_discipline.setText("Nom Discipline:");
        jPanel1.add(nom_discipline);
        nom_discipline.setBounds(160, 330, 100, 23);

        idbulletin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        idbulletin.setForeground(new java.awt.Color(255, 255, 255));
        idbulletin.setText("ID Bulletin :");
        jPanel1.add(idbulletin);
        idbulletin.setBounds(180, 370, 80, 23);

        appreciation_bulletin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        appreciation_bulletin.setForeground(new java.awt.Color(255, 255, 255));
        appreciation_bulletin.setText("Appréciation:");
        jPanel1.add(appreciation_bulletin);
        appreciation_bulletin.setBounds(170, 400, 90, 23);

        idinscription_bulletin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        idinscription_bulletin.setForeground(new java.awt.Color(255, 255, 255));
        idinscription_bulletin.setText("ID Iscription:");
        jPanel1.add(idinscription_bulletin);
        idinscription_bulletin.setBounds(170, 430, 90, 23);

        idtrimestre_bulletin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        idtrimestre_bulletin.setForeground(new java.awt.Color(255, 255, 255));
        idtrimestre_bulletin.setText("ID Trimestre:");
        jPanel1.add(idtrimestre_bulletin);
        idtrimestre_bulletin.setBounds(170, 460, 90, 23);
        jPanel1.add(case_idbulletin_bulletin);
        case_idbulletin_bulletin.setBounds(260, 370, 130, 20);
        jPanel1.add(case_appreciation_bulletin);
        case_appreciation_bulletin.setBounds(260, 400, 130, 20);
        jPanel1.add(case_idinscription_bulletin);
        case_idinscription_bulletin.setBounds(260, 430, 130, 20);
        jPanel1.add(case_idtrimestre_bulletin);
        case_idtrimestre_bulletin.setBounds(260, 460, 130, 20);

        idclasse.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        idclasse.setForeground(new java.awt.Color(255, 255, 255));
        idclasse.setText("ID Classe:");
        jPanel1.add(idclasse);
        idclasse.setBounds(190, 500, 60, 23);

        nom_classe.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        nom_classe.setForeground(new java.awt.Color(255, 255, 255));
        nom_classe.setText("Nom:");
        jPanel1.add(nom_classe);
        nom_classe.setBounds(210, 530, 40, 23);

        idniveau_classe.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        idniveau_classe.setForeground(new java.awt.Color(255, 255, 255));
        idniveau_classe.setText("ID Niveau:");
        jPanel1.add(idniveau_classe);
        idniveau_classe.setBounds(180, 560, 70, 23);

        idanne_classe.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        idanne_classe.setForeground(new java.awt.Color(255, 255, 255));
        idanne_classe.setText("ID Année Scolaire:");
        jPanel1.add(idanne_classe);
        idanne_classe.setBounds(140, 590, 120, 23);

        
        jPanel1.add(case_nom_classe);
        case_nom_classe.setBounds(260, 530, 130, 20);
        jPanel1.add(case_idniveau_classe);
        case_idniveau_classe.setBounds(260, 560, 130, 20);
        jPanel1.add(case_idanne_classe);
        case_idanne_classe.setBounds(260, 590, 130, 20);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 50, 770, 10);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(10, 130, 770, 20);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(10, 290, 770, 2);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(10, 360, 770, 2);
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(10, 490, 770, 10);

        button_ajouter_trimestre.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_ajouter_trimestre.setText("Ajouter");
        jPanel1.add(button_ajouter_trimestre);
        button_ajouter_trimestre.setBounds(430, 210, 100, 31);

        button_supprimer_annee.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_supprimer_annee.setText("Supprimer");
        jPanel1.add(button_supprimer_annee);
        button_supprimer_annee.setBounds(550, 10, 100, 31);

        button_supprimer_niveau.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_supprimer_niveau.setText("Supprimer");
        jPanel1.add(button_supprimer_niveau);
        button_supprimer_niveau.setBounds(670, 90, 100, 31);

        button_supprimer_classe.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_supprimer_classe.setText("Supprimer");
        jPanel1.add(button_supprimer_classe);
        button_supprimer_classe.setBounds(670, 530, 100, 31);

        button_supprimer_trimestre.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_supprimer_trimestre.setText("Supprimer");
        jPanel1.add(button_supprimer_trimestre);
        button_supprimer_trimestre.setBounds(670, 210, 100, 31);

        button_supprimer_bulletin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_supprimer_bulletin.setText("Supprimer");
        jPanel1.add(button_supprimer_bulletin);
        button_supprimer_bulletin.setBounds(670, 410, 100, 31);

        button_ajouter_discipline.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_ajouter_discipline.setText("Ajouter");
        jPanel1.add(button_ajouter_discipline);
        button_ajouter_discipline.setBounds(430, 310, 100, 31);

        button_ajouter_bulletin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_ajouter_bulletin.setText("Ajouter");
        jPanel1.add(button_ajouter_bulletin);
        button_ajouter_bulletin.setBounds(430, 410, 100, 31);

        button_ajouter_classe.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_ajouter_classe.setText("Ajouter");
        
        jPanel1.add(button_ajouter_classe);
        button_ajouter_classe.setBounds(430, 530, 100, 31);
        button_ajouter_niveau.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_ajouter_niveau.setText("Ajouter");
        
        jPanel1.add(button_ajouter_niveau);
        button_ajouter_niveau.setBounds(430, 90, 100, 31);
        button_ajouter_annee.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_ajouter_annee.setText("Ajouter");
        jPanel1.add(button_ajouter_annee);
        button_ajouter_annee.setBounds(430, 10, 100, 31);
        
        button_modifier_classe.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_modifier_classe.setText("Modifier");
        jPanel1.add(button_modifier_classe);
        button_modifier_classe.setBounds(550, 530, 100, 31);

        button_modifier_bulletin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_modifier_bulletin.setText("Modifier");
        jPanel1.add(button_modifier_bulletin);
        button_modifier_bulletin.setBounds(550, 410, 100, 31);

        button_modifier_discipline.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_modifier_discipline.setText("Modifier");
        jPanel1.add(button_modifier_discipline);
        button_modifier_discipline.setBounds(550, 310, 100, 31);

        button_modifier_trimestre.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_modifier_trimestre.setText("Modifier");
        jPanel1.add(button_modifier_trimestre);
        button_modifier_trimestre.setBounds(550, 210, 100, 31);

        button_modifier_niveau.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_modifier_niveau.setText("Modifier");
        jPanel1.add(button_modifier_niveau);
        button_modifier_niveau.setBounds(550, 90, 100, 31);

        case_annee.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jPanel1.add(case_annee);
        case_annee.setBounds(260, 20, 130, 20);

        Année.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        Année.setForeground(new java.awt.Color(255, 255, 255));
        Année.setText("Année");
        jPanel1.add(Année);
        Année.setBounds(30, 20, 60, 20);

        Niveau.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        Niveau.setForeground(new java.awt.Color(255, 255, 255));
        Niveau.setText("Niveau");
        jPanel1.add(Niveau);
        Niveau.setBounds(30, 60, 60, 26);

        ScrollPane.setViewportView(jPanel1);

        getContentPane().add(ScrollPane);
        ScrollPane.setBounds(80, 110, 830, 550);

        //le logo
        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        getContentPane().add(logoece);
        logoece.setBounds(80, 20, 270, 60);

        //Titre
        titre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Mise à jour Administrateur ");
        getContentPane().add(titre);
        titre.setBounds(560, 30, 341, 40);

        //Le bouton retour
        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        getContentPane().add(buttonretour);
        buttonretour.setBounds(460, 690, 100, 30);

        //Le fond
        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel27");
        getContentPane().add(fond);
        fond.setBounds(0, -6, 1000, 780);
        
        
        
        // faire du bouton une action
        
        this.button_ajouter_annee.addActionListener(this);
        this.button_ajouter_bulletin.addActionListener(this);
        this.button_ajouter_classe.addActionListener(this);
        this.button_ajouter_discipline.addActionListener(this);
        this.button_ajouter_niveau.addActionListener(this);
        this.button_ajouter_trimestre.addActionListener(this);
    
        this.button_modifier_bulletin.addActionListener(this);
        this.button_modifier_classe.addActionListener(this);
        this.button_modifier_discipline.addActionListener(this);
        this.button_modifier_niveau.addActionListener(this);
        this.button_modifier_trimestre.addActionListener(this);
    
        this.button_supprimer_annee.addActionListener(this);
        this.button_supprimer_bulletin.addActionListener(this);
        this.button_supprimer_classe.addActionListener(this);
        this.button_supprimer_discipline.addActionListener(this);
        this.button_supprimer_niveau.addActionListener(this);
        this.button_supprimer_trimestre.addActionListener(this);
        
        this.buttonretour.addActionListener(this);
        
        
        
        
        this.case_annee.addActionListener(this);
        this.case_appreciation_bulletin.addActionListener(this);
        this.case_debut_trimestre.addActionListener(this);
        this.case_fin_trimestre.addActionListener(this);
        this.case_idanne_classe.addActionListener(this);
        this. case_idannee_trimestre.addActionListener(this);
        this. case_idbulletin_bulletin.addActionListener(this);
        this. case_idclasse_classe.addActionListener(this);
        this.case_iddiscipline_discipline.addActionListener(this);
        this.case_idinscription_bulletin.addActionListener(this);
        this.case_idniveau_classe.addActionListener(this);
        this.case_idniveau_niveau.addActionListener(this);
        this.case_idtrimestre_bulletin.addActionListener(this);
        this.case_idtrimestre_niveau.addActionListener(this);
        this.case_nom_classe.addActionListener(this);
        this.case_nom_discipline.addActionListener(this);
        this.case_nom_niveau.addActionListener(this);
        this.case_numéro_trimestre.addActionListener(this);
        
        
        
      
        
        // add the panel to this frame
        jPanel1.add(ScrollPane);
        add(jPanel1);

        pack();
    }

    @Override
     public void actionPerformed(ActionEvent event) 
    { 
        
        if (event.getSource() == button_ajouter_annee)
        {
             
        try{
            Connexion co= new Connexion("java2019","root","");
            String get=case_idniveau_niveau.getText().trim();
            
            
            if(get.equals(""))
            {
                JOptionPane.showMessageDialog(jPanel1, "L'un des champs est vide!");
            }
                else
            {
                 int id1=Integer.parseInt(get);   
                
                ajout_annee(id1);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
       
    
        }
        if (event.getSource() == button_ajouter_bulletin)
        {
               try{
            Connexion co= new Connexion("java2019","root","");
            String get=case_idtrimestre_bulletin.getText().trim();
            String get2=case_idinscription_bulletin.getText().trim();
            String get3=case_appreciation_bulletin.getText().trim();
            
            
            if((get.equals(""))||(get2.equals(""))||(get3.equals("")))
            {
                JOptionPane.showMessageDialog(jPanel1, "L'un des champs est vide!");
            }
                else
            {
                 int id1=Integer.parseInt(get);   
                 int id2=Integer.parseInt(get2); 
                 ajout_bulletin(id1,id2,get3);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
        }
        if (event.getSource() == button_ajouter_classe)
        {
               try{
            Connexion co= new Connexion("java2019","root","");
            String get=case_idanne_classe.getText().trim();
            String get2=case_idniveau_classe.getText().trim();
            String get3=case_nom_classe.getText().trim();
      
            
            if((get.equals(""))||(get2.equals(""))||(get3.equals("")))
            {
                JOptionPane.showMessageDialog(jPanel1, "L'un des champs est vide!");
            }
                else
            {
                 int id1=Integer.parseInt(get);   
                 int id2=Integer.parseInt(get2); 
                
                ajout_classe(id1,id2,get3);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
        }
        if (event.getSource() == button_ajouter_discipline)
        {
                
        try{
            Connexion co= new Connexion("java2019","root","");
            String get=case_nom_discipline.getText().trim();
            
            
            if(get.equals(""))
            {
                JOptionPane.showMessageDialog(jPanel1, "L'un des champs est vide!");
            }
                else
            {   
                  ajout_discipline(get);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
        }
        if (event.getSource() == button_ajouter_niveau)
        {
            try{
            Connexion co= new Connexion("java2019","root","");
            String get=case_nom_niveau.getText().trim();
            
            
            if(get.equals(""))
            {
                JOptionPane.showMessageDialog(jPanel1, "L'un des champs est vide!");
            }
                else
            {
                   
                   ajout_niveau(get);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
        }
        
        
        if (event.getSource() == button_ajouter_trimestre)
        {
               try{
            Connexion co= new Connexion("java2019","root","");
            String get=case_numéro_trimestre.getText().trim();
            String get2=case_debut_trimestre.getText().trim();
            String get3=case_fin_trimestre.getText().trim();
            String get4=case_idannee_trimestre.getText().trim();
           
            
            if((get.equals(""))||(get2.equals(""))||(get3.equals(""))||(get4.equals("")))
            {
                JOptionPane.showMessageDialog(jPanel1, "L'un des champs est vide!");
            }
                else
            {
                 int id1=Integer.parseInt(get);   
                 int id4=Integer.parseInt(get4); 
                 
                ajout_trimestre(id4,id1,get2,get3);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
        }
       
        
        if (event.getSource() == button_modifier_bulletin)
        {
              try{
            Connexion co= new Connexion("java2019","root","");
            String get=case_idbulletin_bulletin.getText().trim();
            String get2=case_appreciation_bulletin.getText().trim();
            
            
            if((get.equals(""))||(get2.equals("")))
            {
                JOptionPane.showMessageDialog(jPanel1, "L'un des champs est vide!");
            }
                else
            {
                 int id1=Integer.parseInt(get);   
               
                modif_bulletin(id1,get2);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
        }
        
        
        if (event.getSource() == button_modifier_classe)
        {
               try{
            Connexion co= new Connexion("java2019","root","");
            String get=case_idclasse_classe.getText().trim();
            String get2=case_nom_classe.getText().trim();
            
            
            if((get.equals(""))||(get2.equals("")))
            {
                JOptionPane.showMessageDialog(jPanel1, "L'un des champs est vide!");
            }
                else
            {
                 int id1=Integer.parseInt(get);   
             
                modif_classe(id1,get2);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
        }
        if (event.getSource() == button_modifier_discipline)
        {
            try{
            Connexion co= new Connexion("java2019","root","");
            String get=case_iddiscipline_discipline.getText().trim();
            String get2=case_nom_discipline.getText().trim();
          
            
            if((get.equals(""))||(get2.equals("")))
            {
                JOptionPane.showMessageDialog(jPanel1, "L'un des champs est vide!");
            }
                else
            {
                 int id1=Integer.parseInt(get);   
                 
                modif_discipline(id1,get2);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
        }
         if(event.getSource()== button_modifier_niveau )
         {
        try{
            Connexion co= new Connexion("java2019","root","");
            String get=case_idniveau_niveau.getText().trim();
            String get2=case_nom_niveau.getText().trim();
          
            
            if((get.equals(""))||(get2.equals("")))
            {
                JOptionPane.showMessageDialog(jPanel1, "L'un des champs est vide!");
            }
                else
            {
                 int id1=Integer.parseInt(get);   
                 
                modif_niveau(id1,get2);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
       
    }
        if (event.getSource() == button_modifier_trimestre)
        {
               try{
            Connexion co= new Connexion("java2019","root","");
            String get=case_numéro_trimestre.getText().trim();
            String get2=case_debut_trimestre.getText().trim();
            String get3=case_fin_trimestre.getText().trim();
            String get4=case_idtrimestre_niveau.getText().trim();
          
            
            if((get.equals(""))||(get2.equals(""))||(get3.equals(""))||(get4.equals("")))
            {
                JOptionPane.showMessageDialog(jPanel1, "L'un des champs est vide!");
            }
                else
            {
                 int id1=Integer.parseInt(get);   
                 int id2=Integer.parseInt(get4); 
                 
                modif_trimestre(id2,id1,get2,get3);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
        }
        
        
         if(event.getSource()== button_supprimer_annee)
        {
           
        try{
            Connexion co= new Connexion("java2019","root","");
            
            String get=case_annee.getText().trim();
          
            
            if(get.equals(""))
            {
                JOptionPane.showMessageDialog(jPanel1, "Le champs est vide!");
            }
                else
            {
                   
                 int id=Integer.parseInt(get);  
                 supprim_annee(id);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
       
    }
        
         
         
         if (event.getSource() == button_supprimer_bulletin)
        {
            try{
            Connexion co= new Connexion("java2019","root","");
            
            String get= case_idbulletin_bulletin.getText().trim();
          
            
            if(get.equals(""))
            {
                JOptionPane.showMessageDialog(jPanel1, "Le champs est vide!");
            }
                else
            {
                   
                 int id=Integer.parseInt(get);  
                 supprim_bulletin(id);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
        }
        
        
        if (event.getSource() == button_supprimer_classe)
        {
           try{
            Connexion co= new Connexion("java2019","root","");
            
            String get=case_idclasse_classe.getText().trim();
          
            
            if(get.equals(""))
            {
                JOptionPane.showMessageDialog(jPanel1, "Le champs est vide!");
            }
                else
            {
                   
                 int id=Integer.parseInt(get);  
                 supprim_classe(id);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
        }
        
        
        
        if (event.getSource() == button_supprimer_discipline)
        {
             try{
            Connexion co= new Connexion("java2019","root","");
            
            String get=case_iddiscipline_discipline.getText().trim();
          
            
            if(get.equals(""))
            {
                JOptionPane.showMessageDialog(jPanel1, "Le champs est vide!");
            }
                else
            {
                   
                 int id=Integer.parseInt(get);  
                 supprim_discipline(id);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
        }
        if (event.getSource() == button_supprimer_niveau)
        {
          try{
            Connexion co= new Connexion("java2019","root","");
            
            String get=case_idniveau_niveau.getText().trim();
          
            
            if(get.equals(""))
            {
                JOptionPane.showMessageDialog(jPanel1, "Le champs est vide!");
            }
                else
            {
                   
                 int id=Integer.parseInt(get);  
                 supprim_niveau(id);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
        }
        if (event.getSource() == button_supprimer_trimestre)
        {
            try{
            Connexion co= new Connexion("java2019","root","");
            
            String get=case_idtrimestre_niveau.getText().trim();
          
            
            if(get.equals(""))
            {
                JOptionPane.showMessageDialog(jPanel1, "Le champs est vide!");
            }
                else
            {
                   
                 int id=Integer.parseInt(get);  
                 supprim_trimestre(id);
            }
                  
           }

        catch(Exception e){JOptionPane.showMessageDialog(jPanel1, "Erreur de saisi rééesayer"); }
        }
        
        
        if (event.getSource() == buttonretour)
        {
            this.dispose();
            new Maj_admin();
        }
    }


/**
  * Ajout d'une annee à partir  des parametres renseignés:
     
     * @param id_annee id de l'annee
   
     
     * @return  1 si c bon, 2 si l'annee existe deja*/
    
    public int ajout_annee(int id_annee)
{   
    AnneeScolaire annee=new AnneeScolaire(id_annee);
        
    
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<AnneeScolaire> e=new DAO_AnneeScolaire(co);
    
    int test=0;
    
    for(int i=0;i<e.getids().size();i++) // on cherche si l'annee n'existe pas déja
    {
        if( Integer.parseInt(e.getids().get(i).trim())== id_annee) 
        {
           
            test=1;
        } 
    }
  
    
    
    if (test==0 ) // si l'annee n'existe pas deja 
     {   e.create(annee); 
       
         JOptionPane.showMessageDialog(jPanel1,"Ajout effectué avec succés");
        return 1;
    }
    
    else{
           if(test==1) JOptionPane.showMessageDialog(jPanel1,"Ajout echoué, l'annee existe déja!");
     
          return 2;
    }
    
   
    }
 
    catch(Exception e){
        
        e.printStackTrace();
        return 0;}
}
  

/**
  * Suprime une année (avec toutes les infos qui lui sont relatives) à partir de l'id de l'annee 
     * @param id_annee id de l'annee
     
     * @return  1 si c bon, 2 si l'eleve n'est pas trouvé*/

public  int supprim_annee(int id_annee)
{   
    AnneeScolaire annee=new AnneeScolaire(id_annee);
    
    
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<AnneeScolaire> e=new DAO_AnneeScolaire(co);
    int test=0;
    for(int i=0;i<e.getids().size();i++) // on cherche si l'annee' existe
    {
        if( Integer.parseInt(e.getids().get(i).trim())== id_annee) 
        {
            test=1;
        } 
    }
    if (test==1) // si l'annee existe
    {
        e.delete(annee);
        JOptionPane.showMessageDialog(jPanel1,"Annee suprimé avec succés");
        return 1;
    }
    else
    {
       JOptionPane.showMessageDialog(jPanel1,"Suppression echoué, l'annee que vous souhaiter supprimer n'existe pas!");
        return 2;
    }
    }
    catch(ClassNotFoundException | SQLException e){return 0;}
}  

/**
  * Ajout d'un niveau à partir des des parametres renseignés:
     
     * @param id_niveau id du niveau
     * @param nom son nom
     
     * @return  1 si c bon, 0 sinon */
    
    public int ajout_niveau(String nom)
{   
    Niveau niveau=new Niveau(nom);
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Niveau> e=new DAO_Niveau(co); 
    
   
   
        e.create(niveau); 
       
        JOptionPane.showMessageDialog(jPanel1, "Ajout effectué avec succés");
        return 1;
    }
    
  
    
   
      catch(Exception e){
        
        e.printStackTrace();
        return 0;}
}


/**
  * Modifie les info sur un niveau à partir de l'id du niveau
     * @param id_niveau id du niveau
     * @param nom nouveau nom
    
     * @return  1 si c bon, 2 si l'eleve n'est pas trouvé*/
    
public  int modif_niveau(int id_niveau,String nom)
{   
    Niveau niveau=new Niveau(id_niveau,nom);
        
    
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Niveau> e=new DAO_Niveau(co);
    int test=0;
    for(int i=0;i<e.getids().size();i++) // on cherche si le niveau existe
    {
        if( Integer.parseInt(e.getids().get(i).trim())== id_niveau)
        {
            test=1;
        } 
    }
    
    if (test==1) // si le niveau existe
    {
        e.update(niveau);
        JOptionPane.showMessageDialog(jPanel1,"Modif effectué avec succés");
        return 1;
    }
    
    else{
       JOptionPane.showMessageDialog(jPanel1,"Modif echoué, le niveau n'existe pas!");
    return 2;
    }
    
   
    }
 
    catch(ClassNotFoundException | NumberFormatException | SQLException e){
        
        return 0;}
    
     
}

/**
  * Suprime un niveau (avec toutes les infos qui lui sont relatives) à partir de l'id de l'eleve 
     * @param id_niveau id de l'eleve
     
     * @return  1 si c bon, 2 si l'eleve n'est pas trouvé*/

public int supprim_niveau(int id_niveau)
{   
    Niveau niveau=new Niveau(id_niveau,"");
    
    
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Niveau> e=new DAO_Niveau(co);
    int test=0;
    for(int i=0;i<e.getids().size();i++) // on cherche si le niveau existe
    {
        if( Integer.parseInt(e.getids().get(i).trim())== id_niveau) 
        {
            test=1;
        } 
    }
    if (test==1) // si le niveau existe
    {
        e.delete(niveau);
        JOptionPane.showMessageDialog(jPanel1,"Niveau suprimé avec succés");
        return 1;
    }
    else
    {
         JOptionPane.showMessageDialog(jPanel1,"Suppression echoué, le niveau que vous souhaiter supprimer n'existe pas!");
        return 2;
    }
    }
    catch(ClassNotFoundException | SQLException e){return 0;}
}  

/**
  * Ajout d'un trimestre à partir des des parametres renseignés:
     * @param id_annee annee du trimestre
     * @param numero numero du trimestre (1,2 ou 3)
     * @param debut date de debut
     * @param fin date de fin
     * @return  1 si c bon
    */
    public int ajout_trimestre(int id_annee,int numero, String debut, String fin)
{   
    Trimestre trimestre=new Trimestre(numero,debut,fin, id_annee);
        
    AnneeScolaire annee=new AnneeScolaire(id_annee);
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Trimestre> e=new DAO_Trimestre(co);
    DAO<AnneeScolaire> a=new DAO_AnneeScolaire(co);
   
  
 
    int test2=0;
   
    
     
    
    
    for(int i=0;i<a.getids().size();i++) // on cherche si l'annee scolaire existe 
    {
        if( Integer.parseInt(a.getids().get(i).trim())== id_annee) 
        {
           
            test2=1;
        } 
    }
    
    
    if (test2==1 ) // si l'annee scolaire existe
    {
        e.create(trimestre); 
      
        
        JOptionPane.showMessageDialog(jPanel1,"Ajout effectué avec succés");
        return 1;
    }
    
    else{
       
        if(test2==0) JOptionPane.showMessageDialog(jPanel1,"Ajout echoué, l'annee' n'existe pas!");
        
    return 2;
    }
    
   
    }
 
    catch(Exception e){
        
        e.printStackTrace();
        return 0;}
}
    
 /**
  * Modifie les info sur un trimestre à partir de l'id du trimestre
     * @param id_trimestre id du trimestre
     * @param debut nouveau debut
     * @param fin nouveau fin
     * @param numero nouveau numero
     * @return  1 si c bon, 2 si l'eleve n'est pas trouvé*/
    
public int modif_trimestre(int id_trimestre,int numero,String debut, String fin)
{   
    Trimestre trimestre=new Trimestre(id_trimestre,numero,debut,fin,0);
        
    
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Trimestre> e=new DAO_Trimestre(co);
    int test=0;
    for(int i=0;i<e.getids().size();i++) // on cherche si le trimestre existe
    {
        if( Integer.parseInt(e.getids().get(i).trim())== id_trimestre) 
        {
            test=1;
        } 
    }
    
    if (test==1) // si le trimestre existe
    {
        boolean b= e.update(trimestre);
        JOptionPane.showMessageDialog(jPanel1,"Modif effectué avec succés");
       
        return 1;
    }
    
    else{
        JOptionPane.showMessageDialog(jPanel1,"Modif echoué, le trimestre n'existe pas!");
    return 2;
    }
    
   
    }
 
    catch(ClassNotFoundException | NumberFormatException | SQLException e){
        
        return 0;}
    
     
}

/**
  * Suprime un trimestre (avec toutes les infos qui lui sont relatives) à partir de l'id du trimestre
     * @param id_trimestre id du trimestre
     
     * @return  1 si c bon, 2 si le trimestre n'est pas trouvé*/
public  int supprim_trimestre(int id_trimestre)
{   
    Trimestre trimestre=new Trimestre(id_trimestre,0,"","",0);
    
    
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Trimestre> e=new DAO_Trimestre(co);
    int test=0;
    for(int i=0;i<e.getids().size();i++) // on cherche si le trimestre existe
    {
        if( Integer.parseInt(e.getids().get(i).trim())== id_trimestre) 
        {
            test=1;
        } 
    }
    if (test==1) // si l'enseignant existe
    {
        e.delete(trimestre);
        JOptionPane.showMessageDialog(jPanel1,"trimestre suprimé avec succés");
        return 1;
    }
    else
    {
        JOptionPane.showMessageDialog(jPanel1,"Suppression echoué, trimestre que vous souhaiter supprimer n'existe pas!");
        return 2;
    }
    }
    catch(ClassNotFoundException | SQLException e){return 0;}
}

/**
  * Ajout d'une discipline à partir  des parametres renseignés:
     
     * @param nom id de l'annee
   
     
     * @return  1 si c bon, 2 si l'annee existe deja*/
    
    public  int ajout_discipline(String nom)
{   
    Discipline discipline=new Discipline(nom);
        
    
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Discipline> e=new DAO_Discipline(co);
    
    
  
    
    
      e.create(discipline); 
       
         JOptionPane.showMessageDialog(jPanel1,"Ajout effectué avec succés");
        return 1;
   
    
    
    
   
    }
 
    catch(Exception e){
        
        e.printStackTrace();
        return 0;}
}
    
/**
  * Modifie les info sur une discipline à partir de l'id de la discipline
     * @param id_discipline id de la discpline
     * @param nom nouveau nom
    
     * @return  1 si c bon, 2 si la discipline n'est pas trouvé*/
    
public int modif_discipline(int id_discipline,String nom)
{   
    Discipline discipline=new Discipline(id_discipline,nom);
        
    
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Discipline> e=new DAO_Discipline(co);
    int test=0;
    for(int i=0;i<e.getids().size();i++) // on cherche si la discipline existe
    {
        if( Integer.parseInt(e.getids().get(i).trim())== id_discipline)
        {
            test=1;
        } 
    }
    
    if (test==1) // si la discpline existe
    {
        e.update(discipline);
         JOptionPane.showMessageDialog(jPanel1,"Modif effectué avec succés");
        return 1;
    }
    
    else{
         JOptionPane.showMessageDialog(jPanel1,"Modif echoué, la discipline n'existe pas!");
    return 2;
    }
    
   
    }
 
    catch(ClassNotFoundException | NumberFormatException | SQLException e){
        
        return 0;}
    
     
}

/**
  * Suprime une discipline (avec toutes les infos qui lui sont relatives) à partir de l'id de la discipline 
     * @param id_discipline id de l'annee
     
     * @return  1 si c bon, 2 si la discipline n'est pas trouvé*/

public int supprim_discipline(int id_discipline)
{   
    Discipline discipline=new Discipline(id_discipline,"");
    
    
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Discipline> e=new DAO_Discipline(co);
    int test=0;
    for(int i=0;i<e.getids().size();i++) // on cherche si la discipline existe
    {
        if( Integer.parseInt(e.getids().get(i).trim())== id_discipline) 
        {
            test=1;
        } 
    }
    if (test==1) // si la discpline existe
    {
        e.delete(discipline);
        JOptionPane.showMessageDialog(jPanel1,"Discpline suprimé avec succés");
        return 1;
    }
    else
    {
        JOptionPane.showMessageDialog(jPanel1,"Suppression echoué, la discipline que vous souhaiter supprimer n'existe pas!");
        return 2;
    }
    }
    catch(ClassNotFoundException | SQLException e){return 0;}
}  

/**
  * Ajout d'un bulletin à partir des parametres renseignés:
     
     * @param id_trimestre id de l'annee
     * @param id_inscription id du niveau
     * @param com l'appréciation
     
     * @return  1 si c bon, */
    
    public  int ajout_bulletin(int id_trimestre,int id_inscription, String com)
{   
    Bulletin bulletin =new Bulletin(com, id_trimestre,id_inscription);
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Bulletin> a=new DAO_Bulletin(co);
    DAO<Trimestre> c=new DAO_Trimestre(co);
    DAO<Inscription> n=new DAO_Inscription(co);
    
    int test2=0;
    int test3=0;
    
    for(int i=0;i<n.getids().size();i++) // on cherche  si un propriétaire du bulletin existe 
    {
        if( Integer.parseInt(n.getids().get(i).trim())== id_inscription) 
        {
           
            test2=1;
        } 
    }
    for(int i=0;i<c.getids().size();i++) // on cherche  si letrimstre existe 
    {
        if( Integer.parseInt(c.getids().get(i).trim())== id_trimestre) 
        {
           
            test3=1;
        } 
    }
    
    if (test2==1 & test3==1) // si le proprietaire existe et que la le trimestre existe
    {
        a.create(bulletin); 
        
         JOptionPane.showMessageDialog(jPanel1,"Ajout effectué avec succés");
        return 1;
    }
    
    else{
      
        if(test2==0)  JOptionPane.showMessageDialog(jPanel1,"Ajout echoué, le propietaire  n'existe pas!");
        if(test3==0)  JOptionPane.showMessageDialog(jPanel1,"Ajout echoué, le trimestre n'existe pas!");
    return 2;
    }
    
   
    }
 
    catch(Exception e){
        
        e.printStackTrace();
        return 0;}
}
    
 /**
  * Modifie les info sur un bulletin à partir de l'id du bulletin
     * @param id_bulletin id de la classe
     * @param com nouvelle apreciation
    
     * @return  1 si c bon, 2 si le bulletin  n'est pas trouvé*/
    
public  int modif_bulletin(int id_bulletin,String com)
{   
    Bulletin bulletin=new Bulletin(id_bulletin,com,0,0,0);
        
    
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Bulletin> e=new DAO_Bulletin(co);
    int test=0;
    for(int i=0;i<e.getids().size();i++) // on cherche si le bulletin existe
    {
        if( Integer.parseInt(e.getids().get(i).trim())== id_bulletin) 
        {
            test=1;
        } 
    }
    
    if (test==1) // si l'classe existe
    {
        e.update(bulletin);
        JOptionPane.showMessageDialog(jPanel1,"Modif effectué avec succés");
        return 1;
    }
    
    else{
        JOptionPane.showMessageDialog(jPanel1,"Modif echoué, le bulletin n'existe pas!");
    return 2;
    }
    
   
    }
 
    catch(ClassNotFoundException | NumberFormatException | SQLException e){
        
        return 0;}
    
     
}

/**
  * Suprime un bulletin (avec toutes les infos qui lui sont relatives) à partir de l'id du bulletin 
     * @param id_bulletin id du bulletin
     
     * @return  1 si c bon, 2 si le bulletin n'est pas trouvé*/

public int supprim_bulletin(int id_bulletin)
{   
    Bulletin bulletin=new Bulletin(id_bulletin,"",0,0, 0);
    
    
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Bulletin> e=new DAO_Bulletin(co);
    int test=0;
    for(int i=0;i<e.getids().size();i++) // on cherche si le bulletin existe
    {
        if( Integer.parseInt(e.getids().get(i).trim())== id_bulletin) 
        {
            test=1;
        } 
    }
    if (test==1) // si le bulletin existe
    {
        e.delete(bulletin);
        JOptionPane.showMessageDialog(jPanel1,"Bulletin suprimé avec succés");
        return 1;
    }
    else
    {
         JOptionPane.showMessageDialog(jPanel1,"Suppression echoué, le bulletin que vous souhaiter supprimer n'existe pas!");
        return 2;
    }
    }
    catch(ClassNotFoundException | SQLException e){return 0;}
}       


/**
  * Ajout une classe à partir des parametres renseignés:
     * @param id_classe id de la classe 
     * @param id_annee id de l'annee
     * @param id_niveau id du niveau
     * @param nom son nom
     
     * @return  1 si c bon,*/
    
    public  int ajout_classe(int id_annee,int id_niveau, String nom)
{   
    Classe classe=new Classe(nom,id_annee,id_niveau);
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<AnneeScolaire> a=new DAO_AnneeScolaire(co);
    DAO<Classe> c=new DAO_Classe(co);
    DAO<Niveau> n=new DAO_Niveau(co);
    
    int test2=0;
    int test3=0;
    
    for(int i=0;i<n.getids().size();i++) // on cherche  si le niveau existe 
    {
        if( Integer.parseInt(n.getids().get(i).trim())== id_niveau) 
        {
           
            test2=1;
        } 
    }
    for(int i=0;i<a.getids().size();i++) // on cherche  si l'annee existe 
    {
        if( Integer.parseInt(a.getids().get(i).trim())== id_annee) 
        {
           
            test3=1;
        } 
    }
    
    if (test2==1 & test3==1) // si le niveau existe et que la l'annee existe
    {
        c.create(classe); 
       
        JOptionPane.showMessageDialog(jPanel1,"Ajout effectué avec succés");
        return 1;
    }
    
    else{
        
        if(test2==0)  JOptionPane.showMessageDialog(jPanel1,"Ajout echoué, le niveau n'existe pas!");
        if(test3==0)  JOptionPane.showMessageDialog(jPanel1,"Ajout echoué, l'annee n'existe pas!");
    return 2;
    }
    
   
    }
 
    catch(Exception e){
        
        e.printStackTrace();
        return 0;}
}

/**
  * Modifie les info sur une classe à partir de l'id de la classe
     * @param id_classe id de la classe
     * @param nom nouveau nom
    
     * @return  1 si c bon, 2 si l'eleve n'est pas trouvé*/
    
public  int modif_classe(int id_classe,String nom)
{   
    Classe classe=new Classe(id_classe,nom,0,0);
        
    
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Classe> e=new DAO_Classe(co);
    int test=0;
    for(int i=0;i<e.getids().size();i++) // on cherche si la classe existe
    {
        if( Integer.parseInt(e.getids().get(i).trim())== id_classe) 
        {
            test=1;
        } 
    }
    
    if (test==1) // si l'classe existe
    {
        e.update(classe);
        JOptionPane.showMessageDialog(jPanel1,"Modif effectué avec succés");
        return 1;
    }
    
    else{
        JOptionPane.showMessageDialog(jPanel1,"Modif echoué, la classe n'existe pas!");
    return 2;
    }
    
   
    }
 
    catch(ClassNotFoundException | NumberFormatException | SQLException e){
        
        return 0;}
    
     
}

/**
  * Suprime une classe (avec toutes les infos qui lui sont relatives) à partir de l'id de la classe 
     * @param id_classe id de la classe
     
     * @return  1 si c bon, 2 si l'eleve n'est pas trouvé*/

public  int supprim_classe(int id_classe)
{   
    Classe classe=new Classe(id_classe,"",0, 0);
    
    
    
    try{
    Connexion co= new Connexion("java2019","root","");
    DAO<Classe> e=new DAO_Classe(co);
    int test=0;
    for(int i=0;i<e.getids().size();i++) // on cherche si la classe existe
    {
        if( Integer.parseInt(e.getids().get(i).trim())== id_classe) 
        {
            test=1;
        } 
    }
    if (test==1) // si la classe existe
    {
        e.delete(classe);
        JOptionPane.showMessageDialog(jPanel1,"Classe suprimé avec succés");
        return 1;
    }
    else
    {
        JOptionPane.showMessageDialog(jPanel1,"Suppression echoué, la classe que vous souhaiter supprimer n'existe pas!");
        return 2;
    }
    }
    catch(ClassNotFoundException | SQLException e){return 0;}
}  
}
