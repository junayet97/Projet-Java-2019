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
public class G_recherche_autres extends javax.swing.JFrame {

    /**
     * Creates new form rechercheautres
     */
    public G_recherche_autres() {
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

        jPanel1 = new javax.swing.JPanel();
        logoece = new javax.swing.JLabel();
        titre = new javax.swing.JLabel();
        niveaux = new javax.swing.JLabel();
        classes = new javax.swing.JLabel();
        annees = new javax.swing.JLabel();
        disciplines = new javax.swing.JLabel();
        paneltabniveau = new javax.swing.JScrollPane();
        tabniveaux = new javax.swing.JTable();
        paneltabannee = new javax.swing.JScrollPane();
        tabannees = new javax.swing.JTable();
        paneltabdiscipline = new javax.swing.JScrollPane();
        tabdiscipline = new javax.swing.JTable();
        panelclasse = new javax.swing.JScrollPane();
        tabclasses = new javax.swing.JTable();
        inscription = new javax.swing.JLabel();
        panelinscription = new javax.swing.JScrollPane();
        tabinscription = new javax.swing.JTable();
        enseignement = new javax.swing.JLabel();
        panelenseignement = new javax.swing.JScrollPane();
        tabenseignement = new javax.swing.JTable();
        buttonretour = new javax.swing.JButton();
        fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 900));
        jPanel1.setLayout(null);

        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(60, 40, 270, 60);

        titre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Autre type de recherche");
        jPanel1.add(titre);
        titre.setBounds(580, 40, 330, 70);

        niveaux.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        niveaux.setForeground(new java.awt.Color(255, 255, 255));
        niveaux.setText("Niveaux");
        jPanel1.add(niveaux);
        niveaux.setBounds(120, 370, 70, 20);

        classes.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        classes.setForeground(new java.awt.Color(255, 255, 255));
        classes.setText("Classes");
        jPanel1.add(classes);
        classes.setBounds(350, 180, 50, 20);

        annees.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        annees.setForeground(new java.awt.Color(255, 255, 255));
        annees.setText("Années");
        jPanel1.add(annees);
        annees.setBounds(70, 170, 70, 30);

        disciplines.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        disciplines.setForeground(new java.awt.Color(255, 255, 255));
        disciplines.setText("Disciplines");
        jPanel1.add(disciplines);
        disciplines.setBounds(750, 370, 110, 20);

        tabniveaux.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Niveau", "Nom Niveau"
            }
        ));
        paneltabniveau.setViewportView(tabniveaux);

        jPanel1.add(paneltabniveau);
        paneltabniveau.setBounds(40, 400, 240, 90);

        tabannees.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        tabannees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "ID Année Scolaire"
            }
        ));
        paneltabannee.setViewportView(tabannees);

        jPanel1.add(paneltabannee);
        paneltabannee.setBounds(40, 210, 130, 90);

        tabdiscipline.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Discipline", "Nom Discipline"
            }
        ));
        paneltabdiscipline.setViewportView(tabdiscipline);

        jPanel1.add(paneltabdiscipline);
        paneltabdiscipline.setBounds(660, 400, 300, 90);

        tabclasses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Classe", "Nom Classe", "ID Niveau"
            }
        ));
        panelclasse.setViewportView(tabclasses);

        jPanel1.add(panelclasse);
        panelclasse.setBounds(230, 210, 330, 90);

        inscription.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        inscription.setForeground(new java.awt.Color(255, 255, 255));
        inscription.setText("Inscription");
        jPanel1.add(inscription);
        inscription.setBounds(730, 180, 90, 30);

        tabinscription.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Inscription", "ID Personne", "ID Classe"
            }
        ));
        panelinscription.setViewportView(tabinscription);

        jPanel1.add(panelinscription);
        panelinscription.setBounds(610, 210, 350, 90);

        enseignement.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        enseignement.setForeground(new java.awt.Color(255, 255, 255));
        enseignement.setText("Enseignement");
        jPanel1.add(enseignement);
        enseignement.setBounds(420, 370, 100, 23);

        tabenseignement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Enseignement", "ID Discipline"
            }
        ));
        panelenseignement.setViewportView(tabenseignement);

        jPanel1.add(panelenseignement);
        panelenseignement.setBounds(370, 400, 220, 90);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(440, 600, 100, 30);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel6");
        fond.setPreferredSize(new java.awt.Dimension(1600, 1000));
        jPanel1.add(fond);
        fond.setBounds(0, 0, 1000, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(G_recherche_autres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(G_recherche_autres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(G_recherche_autres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(G_recherche_autres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new G_recherche_autres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel annees;
    private javax.swing.JButton buttonretour;
    private javax.swing.JLabel classes;
    private javax.swing.JLabel disciplines;
    private javax.swing.JLabel enseignement;
    private javax.swing.JLabel fond;
    private javax.swing.JLabel inscription;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoece;
    private javax.swing.JLabel niveaux;
    private javax.swing.JScrollPane panelclasse;
    private javax.swing.JScrollPane panelenseignement;
    private javax.swing.JScrollPane panelinscription;
    private javax.swing.JScrollPane paneltabannee;
    private javax.swing.JScrollPane paneltabdiscipline;
    private javax.swing.JScrollPane paneltabniveau;
    private javax.swing.JTable tabannees;
    private javax.swing.JTable tabclasses;
    private javax.swing.JTable tabdiscipline;
    private javax.swing.JTable tabenseignement;
    private javax.swing.JTable tabinscription;
    private javax.swing.JTable tabniveaux;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables
}
