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
public class G_maj_prof_evaluation extends javax.swing.JFrame {

    /** Creates new form PPBUL */
    public G_maj_prof_evaluation() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoece = new javax.swing.JLabel();
        gtitre = new javax.swing.JLabel();
        titre = new javax.swing.JLabel();
        ptitre = new javax.swing.JLabel();
        buttonmodifier = new javax.swing.JButton();
        buttonajouter = new javax.swing.JButton();
        buttonretour = new javax.swing.JButton();
        buttonsupprimer = new javax.swing.JButton();
        fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));

        jPanel1.setLayout(null);

        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        logoece.setText("jLabel1");
        jPanel1.add(logoece);
        logoece.setBounds(30, 30, 270, 60);

        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Mise à jour Evaluation");
        jPanel1.add(gtitre);
        gtitre.setBounds(360, 30, 290, 40);

        titre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Que souhaitez-vous effectuez :");
        jPanel1.add(titre);
        titre.setBounds(190, 120, 330, 40);

        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Compte Enseignant");
        jPanel1.add(ptitre);
        ptitre.setBounds(390, 70, 260, 40);

        buttonmodifier.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonmodifier.setText("Modifier");
        buttonmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonmodifierActionPerformed(evt);
            }
        });
        jPanel1.add(buttonmodifier);
        buttonmodifier.setBounds(280, 240, 120, 40);

        buttonajouter.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonajouter.setText("Ajouter");
        jPanel1.add(buttonajouter);
        buttonajouter.setBounds(280, 170, 120, 40);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(300, 380, 80, 30);

        buttonsupprimer.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonsupprimer.setText("Supprimer");
        jPanel1.add(buttonsupprimer);
        buttonsupprimer.setBounds(280, 310, 120, 40);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fond.setText("Compte Enseilgant");
        jPanel1.add(fond);
        fond.setBounds(-6, -6, 710, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonmodifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonmodifierActionPerformed

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
            java.util.logging.Logger.getLogger(G_maj_prof_evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(G_maj_prof_evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(G_maj_prof_evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(G_maj_prof_evaluation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new G_maj_prof_evaluation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonajouter;
    private javax.swing.JButton buttonmodifier;
    private javax.swing.JButton buttonretour;
    private javax.swing.JButton buttonsupprimer;
    private javax.swing.JLabel fond;
    private javax.swing.JLabel gtitre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoece;
    private javax.swing.JLabel ptitre;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables

}
