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
public class G_admin_prof_modifier extends javax.swing.JFrame {

    /**
     * Creates new form G_admin_prof_modifier
     */
    public G_admin_prof_modifier() {
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
        gtitre = new javax.swing.JLabel();
        ptitre = new javax.swing.JLabel();
        titre = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        prenom = new javax.swing.JLabel();
        IDeleve = new javax.swing.JLabel();
        case_nom = new javax.swing.JTextField();
        case_prenom = new javax.swing.JTextField();
        case_IDeleve = new javax.swing.JTextField();
        buttonmodifier = new javax.swing.JButton();
        buttonretour = new javax.swing.JButton();
        fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(null);

        logoece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/logoECE.jpg"))); // NOI18N
        jPanel1.add(logoece);
        logoece.setBounds(20, 30, 270, 60);

        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Mise à jour élève");
        jPanel1.add(gtitre);
        gtitre.setBounds(390, 20, 290, 44);

        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Compte Administrateur");
        jPanel1.add(ptitre);
        ptitre.setBounds(370, 60, 300, 40);

        titre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Modifier un élève :");
        jPanel1.add(titre);
        titre.setBounds(230, 160, 250, 33);

        nom.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 255, 255));
        nom.setText("Nom :");
        jPanel1.add(nom);
        nom.setBounds(220, 210, 60, 20);

        prenom.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        prenom.setForeground(new java.awt.Color(255, 255, 255));
        prenom.setText("Prénom :");
        jPanel1.add(prenom);
        prenom.setBounds(200, 250, 80, 20);

        IDeleve.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        IDeleve.setForeground(new java.awt.Color(255, 255, 255));
        IDeleve.setText("ID Elève :");
        jPanel1.add(IDeleve);
        IDeleve.setBounds(200, 290, 80, 20);

        case_nom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jPanel1.add(case_nom);
        case_nom.setBounds(280, 210, 140, 20);

        case_prenom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jPanel1.add(case_prenom);
        case_prenom.setBounds(280, 250, 140, 20);

        case_IDeleve.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        case_IDeleve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case_IDeleveActionPerformed(evt);
            }
        });
        jPanel1.add(case_IDeleve);
        case_IDeleve.setBounds(280, 290, 140, 20);

        buttonmodifier.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonmodifier.setText("Modifier");
        jPanel1.add(buttonmodifier);
        buttonmodifier.setBounds(470, 250, 90, 31);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        jPanel1.add(buttonretour);
        buttonretour.setBounds(290, 380, 90, 31);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel8");
        fond.setMaximumSize(new java.awt.Dimension(700, 500));
        fond.setMinimumSize(new java.awt.Dimension(700, 500));
        fond.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.add(fond);
        fond.setBounds(0, 0, 700, 500);

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

    private void case_IDeleveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_case_IDeleveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_case_IDeleveActionPerformed

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
            java.util.logging.Logger.getLogger(G_admin_prof_modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(G_admin_prof_modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(G_admin_prof_modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(G_admin_prof_modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new G_admin_prof_modifier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDeleve;
    private javax.swing.JButton buttonmodifier;
    private javax.swing.JButton buttonretour;
    private javax.swing.JTextField case_IDeleve;
    private javax.swing.JTextField case_nom;
    private javax.swing.JTextField case_prenom;
    private javax.swing.JLabel fond;
    private javax.swing.JLabel gtitre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoece;
    private javax.swing.JLabel nom;
    private javax.swing.JLabel prenom;
    private javax.swing.JLabel ptitre;
    private javax.swing.JLabel titre;
    // End of variables declaration//GEN-END:variables
}
