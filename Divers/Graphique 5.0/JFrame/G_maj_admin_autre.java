/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphique.JFrame;

/**
 *
 * @author mathi
 */
public class G_maj_admin_autre extends javax.swing.JFrame {

    /**
     * Creates new form miseajourautre
     */
    public G_maj_admin_autre() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPane = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        IDannee = new javax.swing.JLabel();
        button_supprimer_discipline = new javax.swing.JButton();
        IDniveau = new javax.swing.JLabel();
        case_idniveau_niveau = new javax.swing.JTextField();
        Nom_niveau = new javax.swing.JLabel();
        case_nom_niveau = new javax.swing.JTextField();
        Trimestre = new javax.swing.JLabel();
        IDtrimestre_niveau = new javax.swing.JLabel();
        case_numéro_trimestre = new javax.swing.JTextField();
        numero_trimestre = new javax.swing.JLabel();
        case_debut_trimestre = new javax.swing.JTextField();
        debut_trimestre = new javax.swing.JLabel();
        case_fin_trimestre = new javax.swing.JTextField();
        discipline = new javax.swing.JLabel();
        case_idannee_trimestre = new javax.swing.JTextField();
        idanne_trimestre = new javax.swing.JLabel();
        iddiscipline = new javax.swing.JLabel();
        bulletin = new javax.swing.JLabel();
        case_iddiscipline_discipline = new javax.swing.JTextField();
        case_nom_discipline = new javax.swing.JTextField();
        classe = new javax.swing.JLabel();
        case_idclasse_classe = new javax.swing.JTextField();
        fin_trimestre = new javax.swing.JLabel();
        case_idtrimestre_niveau = new javax.swing.JTextField();
        nom_discipline = new javax.swing.JLabel();
        idbulletin = new javax.swing.JLabel();
        appreciation_bulletin = new javax.swing.JLabel();
        idinscription_bulletin = new javax.swing.JLabel();
        idtrimestre_bulletin = new javax.swing.JLabel();
        case_idbulletin_bulletin = new javax.swing.JTextField();
        case_appreciation_bulletin = new javax.swing.JTextField();
        case_idinscription_bulletin = new javax.swing.JTextField();
        case_idtrimestre_bulletin = new javax.swing.JTextField();
        idclasse = new javax.swing.JLabel();
        nom_classe = new javax.swing.JLabel();
        idniveau_classe = new javax.swing.JLabel();
        idanne_classe = new javax.swing.JLabel();
        case_nom_classe = new javax.swing.JTextField();
        case_idniveau_classe = new javax.swing.JTextField();
        case_idanne_classe = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        button_ajouter_trimestre = new javax.swing.JButton();
        button_supprimer_annee = new javax.swing.JButton();
        button_supprimer_niveau = new javax.swing.JButton();
        button_supprimer_classe = new javax.swing.JButton();
        button_supprimer_trimestre = new javax.swing.JButton();
        button_supprimer_bulletin = new javax.swing.JButton();
        button_ajouter_discipline = new javax.swing.JButton();
        button_ajouter_bulletin = new javax.swing.JButton();
        button_ajouter_classe = new javax.swing.JButton();
        button_ajouter_niveau = new javax.swing.JButton();
        button_ajouter_annee = new javax.swing.JButton();
        button_modifier_classe = new javax.swing.JButton();
        button_modifier_bulletin = new javax.swing.JButton();
        button_modifier_discipline = new javax.swing.JButton();
        button_modifier_trimestre = new javax.swing.JButton();
        button_modifier_niveau = new javax.swing.JButton();
        case_annee = new javax.swing.JTextField();
        Année = new javax.swing.JLabel();
        Niveau = new javax.swing.JLabel();
        logoece = new javax.swing.JLabel();
        titre = new javax.swing.JLabel();
        buttonretour = new javax.swing.JButton();
        fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        ScrollPane.setMinimumSize(new java.awt.Dimension(100, 100));

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 650));
        jPanel1.setLayout(null);

        IDannee.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDannee.setForeground(new java.awt.Color(255, 255, 255));
        IDannee.setText("ID Année Scolaire :");
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
        Nom_niveau.setText("Nom Niveau :");
        jPanel1.add(Nom_niveau);
        Nom_niveau.setBounds(170, 90, 83, 23);

        case_nom_niveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case_nom_niveauActionPerformed(evt);
            }
        });
        jPanel1.add(case_nom_niveau);
        case_nom_niveau.setBounds(260, 90, 130, 20);

        Trimestre.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        Trimestre.setForeground(new java.awt.Color(255, 255, 255));
        Trimestre.setText("Trimestre ");
        jPanel1.add(Trimestre);
        Trimestre.setBounds(30, 170, 74, 26);

        IDtrimestre_niveau.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDtrimestre_niveau.setForeground(new java.awt.Color(255, 255, 255));
        IDtrimestre_niveau.setText("ID Trimestre :");
        jPanel1.add(IDtrimestre_niveau);
        IDtrimestre_niveau.setBounds(160, 120, 86, 23);

        case_numéro_trimestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case_numéro_trimestreActionPerformed(evt);
            }
        });
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
        case_idtrimestre_niveau.setBounds(260, 120, 130, 20);

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

        case_nom_classe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case_nom_classeActionPerformed(evt);
            }
        });
        jPanel1.add(case_nom_classe);
        case_nom_classe.setBounds(260, 530, 130, 20);
        jPanel1.add(case_idniveau_classe);
        case_idniveau_classe.setBounds(260, 560, 130, 20);
        jPanel1.add(case_idanne_classe);
        case_idanne_classe.setBounds(260, 590, 130, 20);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(10, 50, 770, 10);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(10, 150, 770, 20);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(10, 290, 770, 2);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(10, 360, 770, 2);
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(10, 490, 770, 10);

        button_ajouter_trimestre.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_ajouter_trimestre.setText("Ajouter");
        button_ajouter_trimestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ajouter_trimestreActionPerformed(evt);
            }
        });
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
        button_ajouter_discipline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ajouter_disciplineActionPerformed(evt);
            }
        });
        jPanel1.add(button_ajouter_discipline);
        button_ajouter_discipline.setBounds(430, 310, 100, 31);

        button_ajouter_bulletin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_ajouter_bulletin.setText("Ajouter");
        button_ajouter_bulletin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ajouter_bulletinActionPerformed(evt);
            }
        });
        jPanel1.add(button_ajouter_bulletin);
        button_ajouter_bulletin.setBounds(430, 410, 100, 31);

        button_ajouter_classe.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_ajouter_classe.setText("Ajouter");
        button_ajouter_classe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ajouter_classeActionPerformed(evt);
            }
        });
        jPanel1.add(button_ajouter_classe);
        button_ajouter_classe.setBounds(430, 530, 100, 31);

        button_ajouter_niveau.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_ajouter_niveau.setText("Ajouter");
        button_ajouter_niveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ajouter_niveauActionPerformed(evt);
            }
        });
        jPanel1.add(button_ajouter_niveau);
        button_ajouter_niveau.setBounds(430, 90, 100, 31);

        button_ajouter_annee.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        button_ajouter_annee.setText("Ajouter");
        button_ajouter_annee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ajouter_anneeActionPerformed(evt);
            }
        });
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

        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/logoECE.jpg"))); // NOI18N
        getContentPane().add(logoece);
        logoece.setBounds(80, 20, 270, 60);

        titre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Mise à jour Administrateur ");
        getContentPane().add(titre);
        titre.setBounds(560, 30, 341, 40);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        getContentPane().add(buttonretour);
        buttonretour.setBounds(460, 690, 100, 30);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel27");
        getContentPane().add(fond);
        fond.setBounds(0, -6, 1000, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void case_numéro_trimestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case_numéro_trimestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_case_numéro_trimestreActionPerformed

    private void case_nom_niveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case_nom_niveauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_case_nom_niveauActionPerformed

    private void case_nom_classeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case_nom_classeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_case_nom_classeActionPerformed

    private void button_ajouter_trimestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ajouter_trimestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_ajouter_trimestreActionPerformed

    private void button_ajouter_disciplineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ajouter_disciplineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_ajouter_disciplineActionPerformed

    private void button_ajouter_bulletinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ajouter_bulletinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_ajouter_bulletinActionPerformed

    private void button_ajouter_classeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ajouter_classeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_ajouter_classeActionPerformed

    private void button_ajouter_niveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ajouter_niveauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_ajouter_niveauActionPerformed

    private void button_ajouter_anneeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ajouter_anneeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_ajouter_anneeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(G_maj_admin_autre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(G_maj_admin_autre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(G_maj_admin_autre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(G_maj_admin_autre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new G_maj_admin_autre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Année;
    private javax.swing.JLabel IDannee;
    private javax.swing.JLabel IDniveau;
    private javax.swing.JLabel IDtrimestre_niveau;
    private javax.swing.JLabel Niveau;
    private javax.swing.JLabel Nom_niveau;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel Trimestre;
    private javax.swing.JLabel appreciation_bulletin;
    private javax.swing.JLabel bulletin;
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
    private javax.swing.JLabel classe;
    private javax.swing.JLabel debut_trimestre;
    private javax.swing.JLabel discipline;
    private javax.swing.JLabel fin_trimestre;
    private javax.swing.JLabel fond;
    private javax.swing.JLabel idanne_classe;
    private javax.swing.JLabel idanne_trimestre;
    private javax.swing.JLabel idbulletin;
    private javax.swing.JLabel idclasse;
    private javax.swing.JLabel iddiscipline;
    private javax.swing.JLabel idinscription_bulletin;
    private javax.swing.JLabel idniveau_classe;
    private javax.swing.JLabel idtrimestre_bulletin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel logoece;
    private javax.swing.JLabel nom_classe;
    private javax.swing.JLabel nom_discipline;
    private javax.swing.JLabel numero_trimestre;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables
}
