/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercare.ClientOption;

import customercare.database.ICrudImpl;
import customercare.ui.HomePage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Shahrear
 */
public class ClientChat extends javax.swing.JFrame {

    static Socket s;
    static DataOutputStream dout;
    static DataInputStream din;
    public static String ip=ICrudImpl.ip;

    /**
     * Creates new form ClientChat
     */
    public ClientChat() throws IOException {
        initComponents();
        s = new Socket(ip,1201);

        din = new DataInputStream(s.getInputStream());

        dout = new DataOutputStream(s.getOutputStream());
        new recev().start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        msg_text = new javax.swing.JTextField();
        Send = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        msg_area = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        msg_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msg_textActionPerformed(evt);
            }
        });
        getContentPane().add(msg_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 460, 493, 49));

        Send.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/ClientOption/302-512.png"))); // NOI18N
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });
        getContentPane().add(Send, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 460, 68, 49));

        msg_area.setColumns(20);
        msg_area.setRows(5);
        jScrollPane1.setViewportView(msg_area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 179, 616, 213));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Client");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 30, 261, 83));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/ClientOption/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 53, 110, 60));

        jLabel2.setText("Please write your message here ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 431, 353, 23));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/ClientOption/ezgif.com-resize (4).gif"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 179, 215, 213));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/ClientOption/6866136424_ca340d0e4e_b.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setMinimumSize(new java.awt.Dimension(1047, 660));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -1, 1050, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        try {
            String msgout = "";
            msgout = msg_text.getText().trim();
            dout.writeUTF(msgout);
            msg_area.setText(msg_area.getText().trim() + "\nUser: " + msgout);
            msg_area.setFocusable(false);
            msg_text.setText(null);

        } catch (Exception e) {

        }
    }//GEN-LAST:event_SendActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomePage hp=new HomePage();
        hp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void msg_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msg_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msg_textActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    class recev extends Thread{

        public recev() {

        }

        public void run() {
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
                java.util.logging.Logger.getLogger(ClientChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(ClientChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(ClientChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(ClientChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>

            /* Create and display the form */
 /*java.awt.EventQueue.invokeLater(() -> {
            new ClientChat().setVisible(true);
        });*/
            try {

                String msing = "";
                while (!msing.equals("ShutUp")) {
                    msing = din.readUTF();
                    msg_area.setText(msg_area.getText().trim() + "\nServer: " + msing);
                }
            } catch (IOException e) {

            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton Send;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea msg_area;
    public static javax.swing.JTextField msg_text;
    // End of variables declaration//GEN-END:variables
}
