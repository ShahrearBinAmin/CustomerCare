/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercare.Offers;

import static customercare.database.ICrudImpl.ip;
import customercare.ui.HomePage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;

/**
 *
 * @author Shahrear
 */
public class offersForm extends javax.swing.JFrame {
    public static String serviceProviderName;
    private String number;
    /**
     * Creates new form offersForm
     */
    public offersForm() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gp = new javax.swing.JButton();
        airtel = new javax.swing.JButton();
        robi = new javax.swing.JButton();
        banglalink = new javax.swing.JButton();
        teletalk = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1047, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        gp.setText("Grameen Phone");
        gp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gpActionPerformed(evt);
            }
        });
        getContentPane().add(gp, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 220, -1, 43));

        airtel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        airtel.setText("Airtel");
        airtel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airtelActionPerformed(evt);
            }
        });
        getContentPane().add(airtel, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 281, 138, 43));

        robi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        robi.setText("Robi");
        robi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                robiActionPerformed(evt);
            }
        });
        getContentPane().add(robi, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 342, 138, 43));

        banglalink.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        banglalink.setText("Banglalink");
        banglalink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banglalinkActionPerformed(evt);
            }
        });
        getContentPane().add(banglalink, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 403, 138, 43));

        teletalk.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        teletalk.setText("Teletalk");
        teletalk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teletalkActionPerformed(evt);
            }
        });
        getContentPane().add(teletalk, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 464, 138, 43));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/Offers/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 37, 110, 60));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Service Provider");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 37, 183, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/Offers/042e750cbc58c97de7c0a07512475e5d.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 1050, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gpActionPerformed
        serviceProviderName="gp";
        OfferType gpsf=new OfferType(serviceProviderName);
                    gpsf.setVisible(true);
                    dispose();
        
        
    }//GEN-LAST:event_gpActionPerformed

    private void airtelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airtelActionPerformed
        serviceProviderName="airtel";
        OfferType gpsf=new OfferType(serviceProviderName);
                    gpsf.setVisible(true);
                    dispose();
        
    }//GEN-LAST:event_airtelActionPerformed

    private void robiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_robiActionPerformed
        serviceProviderName="robi";
        OfferType gpsf=new OfferType(serviceProviderName);
                    gpsf.setVisible(true);
                    dispose();
        
    }//GEN-LAST:event_robiActionPerformed

    private void banglalinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banglalinkActionPerformed
        serviceProviderName="banglalink";
        OfferType gpsf=new OfferType(serviceProviderName);
                    gpsf.setVisible(true);
                    dispose();
        
    }//GEN-LAST:event_banglalinkActionPerformed

    private void teletalkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teletalkActionPerformed
        serviceProviderName="teletalk";
        OfferType gpsf=new OfferType(serviceProviderName);
                    gpsf.setVisible(true);
                    dispose();
        
    }//GEN-LAST:event_teletalkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomePage h=new HomePage();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
     public Connection openConnection(){
        Connection conn = null;
        try {
            String url = "jdbc:mysql://"+ip+"/java_db?useSSL=false";
            
            conn = DriverManager.getConnection(url, "root","123");
        } catch (SQLException e) {
           Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, e);
        }
        return conn;
    }
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
            java.util.logging.Logger.getLogger(offersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(offersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(offersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(offersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new offersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton airtel;
    private javax.swing.JButton banglalink;
    private javax.swing.JButton gp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton robi;
    private javax.swing.JButton teletalk;
    // End of variables declaration//GEN-END:variables
}