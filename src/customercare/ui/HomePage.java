/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercare.ui;

import com.mysql.jdbc.Connection;
import customercare.AirtimeRecharge.AirtimeForm;
import customercare.Browser.GoogleMaps;
import customercare.ClientOption.ClientChat;
import customercare.Offers.offersForm;
import customercare.database.ICrudImpl;
import static customercare.database.ICrudImpl.ip;
import customercare.wallet.walletRefillForm;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import sun.awt.DesktopBrowse;

/**
 *
 * @author Shahrear
 */
public class HomePage extends javax.swing.JFrame {
    Login l = new Login();
    public String un;
    public static String ip = ICrudImpl.ip;
    private Connection connection;
    /**
     * Creates new form walletForm
     */
    public HomePage() {
        initComponents();
        un = Login.UName;
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        airtimeRecharge = new javax.swing.JButton();
        walletRefill = new javax.swing.JButton();
        billPayment = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        refresh = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        DataPack = new javax.swing.JButton();
        FindAgent = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        contactUs = new javax.swing.JButton();
        set = new javax.swing.JButton();
        TotalWalletMoney = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        airtimeBalance = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Find Agent");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1047, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        airtimeRecharge.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        airtimeRecharge.setText("Airtime Recharge");
        airtimeRecharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airtimeRechargeActionPerformed(evt);
            }
        });
        getContentPane().add(airtimeRecharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 210, 40));

        walletRefill.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        walletRefill.setText("Wallet Refill");
        walletRefill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walletRefillActionPerformed(evt);
            }
        });
        getContentPane().add(walletRefill, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 210, 40));

        billPayment.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        billPayment.setText("Bill Payment");
        getContentPane().add(billPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 210, 40));

        refresh.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/ui/refresh.png"))); // NOI18N
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/ui/Profile.png"))); // NOI18N
        jButton3.setText("jButton3");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/ui/homeVutton.png"))); // NOI18N
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 618, Short.MAX_VALUE)
                .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 140));

        DataPack.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        DataPack.setText("Data Pack & Offers");
        DataPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataPackActionPerformed(evt);
            }
        });
        getContentPane().add(DataPack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 210, 40));

        FindAgent.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        FindAgent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/ui/ezgif.com-resize.gif"))); // NOI18N
        FindAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindAgentActionPerformed(evt);
            }
        });
        getContentPane().add(FindAgent, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 110, 80));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("Find Agent");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, 110, 40));

        contactUs.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        contactUs.setText("Contact Us");
        contactUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactUsActionPerformed(evt);
            }
        });
        getContentPane().add(contactUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 540, 110, 40));

        set.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        set.setText("Bank Refill");
        set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setActionPerformed(evt);
            }
        });
        getContentPane().add(set, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 210, 40));

        TotalWalletMoney.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TotalWalletMoney.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(TotalWalletMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 190, 63, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/ui/MoneyFinal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 240, 80, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Taka");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 200, -1, 29));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/ui/ezgif.com-resize (3).gif"))); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 110, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/ui/H.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 530, 280));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Wallet Money");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, 80, 30));

        airtimeBalance.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        airtimeBalance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(airtimeBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 400, 70, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Airtime Balance");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 90, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Taka");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 400, 30, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/ui/Money_Fist-512.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, 80, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/ui/waterColor.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1050, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void walletRefillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walletRefillActionPerformed

        walletRefillForm wf = new walletRefillForm();
        wf.setVisible(true);
        dispose();
    }//GEN-LAST:event_walletRefillActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        Connection con =openConnection();
        try {
            Statement state = con.createStatement();
            ResultSet resultset = state.executeQuery("select * from user3 where username = '"+Login.UName+"'");
            System.out.println(un);
            if(resultset.next())
            {
               
                TotalWalletMoney.setText(resultset.getString("money"));
                airtimeBalance.setText(resultset.getString("airtime"));
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshActionPerformed

    private void airtimeRechargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airtimeRechargeActionPerformed
        AirtimeForm af=new AirtimeForm();
        af.setVisible(true);
        dispose();
    }//GEN-LAST:event_airtimeRechargeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FindAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindAgentActionPerformed
        // TODO add your handling code here:
        Desktop d=Desktop.getDesktop();
        try {
            d.browse(new URI("https://www.google.com.bd/maps/@23.7211147,90.3963863,15z?hl=en"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
         //GoogleMaps googleMaps=new GoogleMaps();
         
           
        dispose();
        
    }//GEN-LAST:event_FindAgentActionPerformed

    private void DataPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataPackActionPerformed
        offersForm of=new offersForm();
        of.setVisible(true);
        dispose();
    }//GEN-LAST:event_DataPackActionPerformed

    private void contactUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactUsActionPerformed
        try {
            ClientChat cc=new ClientChat();
            cc.setVisible(true);
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_contactUsActionPerformed

    private void setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setActionPerformed
        Settings s=new Settings();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_setActionPerformed

    public Connection openConnection()
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                this.connection=(Connection) DriverManager.getConnection("jdbc:mysql://"+ip+"/java_db?useSSL=false","root","123");
                System.out.println("Connection established successfully with the database server,Home Page");
            } catch (Exception e) {
                System.out.println("Error"+e.getMessage());
            }
           return this.connection;
        }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DataPack;
    private javax.swing.JButton FindAgent;
    private javax.swing.JTextField TotalWalletMoney;
    private javax.swing.JTextField airtimeBalance;
    private javax.swing.JButton airtimeRecharge;
    private javax.swing.JButton billPayment;
    private javax.swing.JButton contactUs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton refresh;
    private javax.swing.JButton set;
    private javax.swing.JButton walletRefill;
    // End of variables declaration//GEN-END:variables
}
