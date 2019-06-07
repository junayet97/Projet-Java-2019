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
public class Rerecherche extends javax.swing.JFrame {

    /**
     * Creates new form Rerecherche
     */
    public Rerecherche() {
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
        buttonprof = new javax.swing.JButton();
        buttoneleve = new javax.swing.JButton();
        buttonretour = new javax.swing.JButton();
        buttonautres = new javax.swing.JButton();
        titrepers = new javax.swing.JLabel();
        titredonnes = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fonds = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(700, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(null);

        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/logoECE.jpg"))); // NOI18N
        logoece.setText("jLabel1");
        jPanel1.add(logoece);
        logoece.setBounds(10, 10, 270, 60);

        titre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Recherches d'informations");
        jPanel1.add(titre);
        titre.setBounds(330, 40, 330, 30);

        buttonprof.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonprof.setText("Proffeseur");
        buttonprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonprofActionPerformed(evt);
            }
        });
        jPanel1.add(buttonprof);
        buttonprof.setBounds(180, 170, 120, 50);

        buttoneleve.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttoneleve.setText("Elève");
        buttoneleve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoneleveActionPerformed(evt);
            }
        });
        jPanel1.add(buttoneleve);
        buttoneleve.setBounds(360, 170, 120, 50);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(310, 410, 90, 30);

        buttonautres.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonautres.setText("Autre");
        jPanel1.add(buttonautres);
        buttonautres.setBounds(360, 290, 120, 50);

        titrepers.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titrepers.setForeground(new java.awt.Color(255, 255, 255));
        titrepers.setText("Rechercher des informations sur une personnes :");
        jPanel1.add(titrepers);
        titrepers.setBounds(90, 120, 460, 40);

        titredonnes.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titredonnes.setForeground(new java.awt.Color(255, 255, 255));
        titredonnes.setText("Autre type de recherche :");
        jPanel1.add(titredonnes);
        titredonnes.setBounds(90, 300, 300, 30);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(90, 260, 450, 10);

        fonds.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/imagefond.jpg"))); // NOI18N
        fonds.setText("jLabel3");
        jPanel1.add(fonds);
        fonds.setBounds(-10, 0, 710, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttoneleveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoneleveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttoneleveActionPerformed

    private void buttonprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonprofActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonprofActionPerformed

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
            java.util.logging.Logger.getLogger(Rerecherche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rerecherche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rerecherche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rerecherche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rerecherche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonautres;
    private javax.swing.JButton buttoneleve;
    private javax.swing.JButton buttonprof;
    private javax.swing.JButton buttonretour;
    private javax.swing.JLabel fonds;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoece;
    private javax.swing.JLabel titre;
    private javax.swing.JLabel titredonnes;
    private javax.swing.JLabel titrepers;
    // End of variables declaration//GEN-END:variables
}
