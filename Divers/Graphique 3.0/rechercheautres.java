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
public class rechercheautres extends javax.swing.JFrame {

    /**
     * Creates new form rechercheautres
     */
    public rechercheautres() {
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
        annees = new javax.swing.JLabel();
        disciplines = new javax.swing.JLabel();
        buttonretour = new javax.swing.JButton();
        paneltabniveau = new javax.swing.JScrollPane();
        tabniveaux = new javax.swing.JTable();
        paneltabannee = new javax.swing.JScrollPane();
        tabannees = new javax.swing.JTable();
        paneltabdiscipline = new javax.swing.JScrollPane();
        tabdiscipline = new javax.swing.JTable();
        fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        jPanel1.setLayout(null);

        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(20, 20, 270, 60);

        titre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Autre type de recherche");
        jPanel1.add(titre);
        titre.setBounds(330, 30, 330, 70);

        niveaux.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        niveaux.setForeground(new java.awt.Color(255, 255, 255));
        niveaux.setText("Niveaux");
        jPanel1.add(niveaux);
        niveaux.setBounds(300, 160, 70, 20);

        annees.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        annees.setForeground(new java.awt.Color(255, 255, 255));
        annees.setText("Années");
        jPanel1.add(annees);
        annees.setBounds(90, 160, 70, 30);

        disciplines.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        disciplines.setForeground(new java.awt.Color(255, 255, 255));
        disciplines.setText("Disciplines");
        jPanel1.add(disciplines);
        disciplines.setBounds(530, 170, 110, 20);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(280, 380, 100, 30);

        tabniveaux.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID niveau", "Nom niveau"
            }
        ));
        paneltabniveau.setViewportView(tabniveaux);

        jPanel1.add(paneltabniveau);
        paneltabniveau.setBounds(240, 200, 190, 90);

        tabannees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Id Année Scolaire"
            }
        ));
        paneltabannee.setViewportView(tabannees);

        jPanel1.add(paneltabannee);
        paneltabannee.setBounds(50, 200, 150, 90);

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
        paneltabdiscipline.setBounds(460, 200, 210, 90);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel6");
        jPanel1.add(fond);
        fond.setBounds(-10, -6, 710, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(rechercheautres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rechercheautres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rechercheautres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rechercheautres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rechercheautres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel annees;
    private javax.swing.JButton buttonretour;
    private javax.swing.JLabel disciplines;
    private javax.swing.JLabel fond;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoece;
    private javax.swing.JLabel niveaux;
    private javax.swing.JScrollPane paneltabannee;
    private javax.swing.JScrollPane paneltabdiscipline;
    private javax.swing.JScrollPane paneltabniveau;
    private javax.swing.JTable tabannees;
    private javax.swing.JTable tabdiscipline;
    private javax.swing.JTable tabniveaux;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables
}
