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
public class G_admin_prof_ajouter extends javax.swing.JFrame {

    /**
     * Creates new form G_admin_eleve_ajouter
     */
    public G_admin_prof_ajouter() {
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
        gtritre = new javax.swing.JLabel();
        ptitre = new javax.swing.JLabel();
        titre = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        prenom = new javax.swing.JLabel();
        IDenseignant = new javax.swing.JLabel();
        IDclasse = new javax.swing.JLabel();
        IDdiscipline = new javax.swing.JLabel();
        case_nom = new javax.swing.JTextField();
        case_prenom = new javax.swing.JTextField();
        case_IDenseignant = new javax.swing.JTextField();
        case_IDclasse = new javax.swing.JTextField();
        case_IDdiscipline = new javax.swing.JTextField();
        buttonajouter = new javax.swing.JButton();
        buttonretour = new javax.swing.JButton();
        fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));

        jPanel1.setLayout(null);

        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(20, 20, 270, 70);

        gtritre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtritre.setForeground(new java.awt.Color(204, 204, 255));
        gtritre.setText("Mise à jour Enseignant");
        jPanel1.add(gtritre);
        gtritre.setBounds(380, 30, 280, 40);

        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Compte Administrateur");
        jPanel1.add(ptitre);
        ptitre.setBounds(370, 70, 300, 40);

        titre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Ajouter un Enseignant :");
        jPanel1.add(titre);
        titre.setBounds(210, 140, 240, 50);

        nom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 255, 255));
        nom.setText("Nom :");
        jPanel1.add(nom);
        nom.setBounds(208, 200, 60, 23);

        prenom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        prenom.setForeground(new java.awt.Color(255, 255, 255));
        prenom.setText("Prénom :");
        jPanel1.add(prenom);
        prenom.setBounds(190, 230, 80, 23);

        IDenseignant.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDenseignant.setForeground(new java.awt.Color(255, 255, 255));
        IDenseignant.setText("ID Enseignant :");
        jPanel1.add(IDenseignant);
        IDenseignant.setBounds(154, 260, 120, 23);

        IDclasse.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDclasse.setForeground(new java.awt.Color(255, 255, 255));
        IDclasse.setText("ID Classe :");
        jPanel1.add(IDclasse);
        IDclasse.setBounds(182, 290, 90, 23);

        IDdiscipline.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDdiscipline.setForeground(new java.awt.Color(255, 255, 255));
        IDdiscipline.setText("ID Discipline : ");
        jPanel1.add(IDdiscipline);
        IDdiscipline.setBounds(158, 320, 110, 23);

        case_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case_nomActionPerformed(evt);
            }
        });
        jPanel1.add(case_nom);
        case_nom.setBounds(270, 200, 120, 20);

        case_prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case_prenomActionPerformed(evt);
            }
        });
        jPanel1.add(case_prenom);
        case_prenom.setBounds(270, 230, 120, 20);
        jPanel1.add(case_IDenseignant);
        case_IDenseignant.setBounds(270, 260, 120, 20);
        jPanel1.add(case_IDclasse);
        case_IDclasse.setBounds(270, 290, 120, 20);
        jPanel1.add(case_IDdiscipline);
        case_IDdiscipline.setBounds(270, 320, 120, 20);

        buttonajouter.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonajouter.setText("Ajouter");
        jPanel1.add(buttonajouter);
        buttonajouter.setBounds(470, 260, 90, 31);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(290, 380, 90, 31);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel10");
        jPanel1.add(fond);
        fond.setBounds(0, 0, 700, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void case_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_case_nomActionPerformed

    private void case_prenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case_prenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_case_prenomActionPerformed

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
            java.util.logging.Logger.getLogger(G_admin_prof_ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(G_admin_prof_ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(G_admin_prof_ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(G_admin_prof_ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new G_admin_prof_ajouter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDclasse;
    private javax.swing.JLabel IDdiscipline;
    private javax.swing.JLabel IDenseignant;
    private javax.swing.JButton buttonajouter;
    private javax.swing.JButton buttonretour;
    private javax.swing.JTextField case_IDclasse;
    private javax.swing.JTextField case_IDdiscipline;
    private javax.swing.JTextField case_IDenseignant;
    private javax.swing.JTextField case_nom;
    private javax.swing.JTextField case_prenom;
    private javax.swing.JLabel fond;
    private javax.swing.JLabel gtritre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoece;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel prenom;
    private javax.swing.JLabel ptitre;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables
}
