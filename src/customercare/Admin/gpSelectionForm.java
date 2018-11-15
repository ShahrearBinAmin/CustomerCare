/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercare.Admin;

/**
 *
 * @author Shahrear
 */
public class gpSelectionForm extends javax.swing.JFrame {

    String VoiceOrInternet,SpVoiceOrIn;
    public static String ServiceProviderName;
    public gpSelectionForm(String sp) {
        initComponents();
        this.ServiceProviderName=sp;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voice = new javax.swing.JButton();
        internet = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1047, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        voice.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        voice.setText("Voice Offers");
        voice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voiceActionPerformed(evt);
            }
        });
        getContentPane().add(voice, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 274, 219, 45));

        internet.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        internet.setText("Internet Offers");
        internet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internetActionPerformed(evt);
            }
        });
        getContentPane().add(internet, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 413, 219, 45));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/Admin/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 35, 110, 60));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Offer Type");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 74, 178, 69));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/Admin/background-12.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 1050, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void internetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internetActionPerformed
        VoiceOrInternet ="internet";
        SpVoiceOrIn=ServiceProviderName+VoiceOrInternet;
        SubmissionFormNet gpfl=new SubmissionFormNet(SpVoiceOrIn);
        gpfl.setVisible(true);
        dispose();
    }//GEN-LAST:event_internetActionPerformed

    private void voiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voiceActionPerformed
        VoiceOrInternet ="voice";
        SpVoiceOrIn=ServiceProviderName+VoiceOrInternet;
        SubmissionFormNet sfn=new SubmissionFormNet(SpVoiceOrIn);
        sfn.setVisible(true);
        dispose();
    }//GEN-LAST:event_voiceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminForm af=new AdminForm();
        af.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(gpSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gpSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gpSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gpSelectionForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gpSelectionForm(ServiceProviderName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton internet;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton voice;
    // End of variables declaration//GEN-END:variables
}
