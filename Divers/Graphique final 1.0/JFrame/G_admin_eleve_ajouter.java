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
public class G_admin_eleve_ajouter extends javax.swing.JFrame {

    /**
     * Creates new form G_admin_eleve
     */
    public G_admin_eleve_ajouter() {
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
        IDclasse = new javax.swing.JLabel();
        case_nom = new javax.swing.JTextField();
        case_prenom = new javax.swing.JTextField();
        case_IDeleve = new javax.swing.JTextField();
        case_IDclasse = new javax.swing.JTextField();
        buttonajouter = new javax.swing.JButton();
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
        logoece.setBounds(30, 20, 270, 60);

        gtitre.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        gtitre.setForeground(new java.awt.Color(204, 204, 255));
        gtitre.setText("Mise à jour élève");
        jPanel1.add(gtitre);
        gtitre.setBounds(410, 30, 220, 30);

        ptitre.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        ptitre.setForeground(new java.awt.Color(204, 204, 255));
        ptitre.setText("Compte Administrateur");
        jPanel1.add(ptitre);
        ptitre.setBounds(370, 60, 300, 50);

        titre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        titre.setForeground(new java.awt.Color(204, 204, 255));
        titre.setText("Ajouter un élève :");
        jPanel1.add(titre);
        titre.setBounds(250, 150, 180, 33);

        nom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 255, 255));
        nom.setText("Nom :");
        jPanel1.add(nom);
        nom.setBounds(230, 200, 50, 23);

        prenom.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        prenom.setForeground(new java.awt.Color(255, 255, 255));
        prenom.setText("Prénom :");
        jPanel1.add(prenom);
        prenom.setBounds(210, 230, 70, 23);

        IDeleve.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDeleve.setForeground(new java.awt.Color(255, 255, 255));
        IDeleve.setText("ID Elève :");
        jPanel1.add(IDeleve);
        IDeleve.setBounds(210, 260, 70, 23);

        IDclasse.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        IDclasse.setForeground(new java.awt.Color(255, 255, 255));
        IDclasse.setText("ID Classe : ");
        jPanel1.add(IDclasse);
        IDclasse.setBounds(210, 290, 70, 23);
        jPanel1.add(case_nom);
        case_nom.setBounds(280, 200, 130, 20);
        jPanel1.add(case_prenom);
        case_prenom.setBounds(280, 230, 130, 20);

        case_IDeleve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                case_IDeleveActionPerformed(evt);
            }
        });
        jPanel1.add(case_IDeleve);
        case_IDeleve.setBounds(280, 260, 130, 20);
        jPanel1.add(case_IDclasse);
        case_IDclasse.setBounds(280, 290, 130, 20);

        buttonajouter.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonajouter.setText("Ajouter");
        buttonajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonajouterActionPerformed(evt);
            }
        });
        jPanel1.add(buttonajouter);
        buttonajouter.setBounds(470, 240, 110, 31);

        buttonretour.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        buttonretour.setText("Retour");
        buttonretour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonretourActionPerformed(evt);
            }
        });
        jPanel1.add(buttonretour);
        buttonretour.setBounds(310, 370, 100, 31);

        fond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Graphique/JFrame/imagefond.jpg"))); // NOI18N
        fond.setText("jLabel9");
        jPanel1.add(fond);
        fond.setBounds(-6, 0, 710, 510);

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

    private void buttonretourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonretourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonretourActionPerformed

    private void buttonajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonajouterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonajouterActionPerformed

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
            java.util.logging.Logger.getLogger(G_admin_eleve_ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(G_admin_eleve_ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(G_admin_eleve_ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(G_admin_eleve_ajouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new G_admin_eleve_ajouter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDclasse;
    private javax.swing.JLabel IDeleve;
    private javax.swing.JButton buttonajouter;
    private javax.swing.JButton buttonretour;
    private javax.swing.JTextField case_IDclasse;
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
