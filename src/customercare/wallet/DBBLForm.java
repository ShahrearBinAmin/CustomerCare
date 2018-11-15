/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercare.wallet;
import com.mysql.jdbc.Connection;
import customercare.database.ICrudImpl;
import static customercare.database.ICrudImpl.ip;
import customercare.ui.Login;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Shahrear
 */
public class DBBLForm extends javax.swing.JFrame {
    private Connection connection;
    public String un,pinDB;
    public static String ip = ICrudImpl.ip;
    public int balanceDB,NewBalance,walletMoney;
    Login l = new Login();
    /**
     * Creates new form DBBLForm
     */
    public DBBLForm() {
        initComponents();
        setLocationRelativeTo(null);
        un = Login.UName;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yourCardNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        refillAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        availableBalance = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        balanceInfo = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Ok = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ibPin = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1047, 660));
        getContentPane().setLayout(null);

        yourCardNo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        getContentPane().add(yourCardNo);
        yourCardNo.setBounds(510, 220, 214, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Refill Amount :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 270, 103, 30);

        refillAmount.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        refillAmount.setText("0");
        getContentPane().add(refillAmount);
        refillAmount.setBounds(510, 270, 113, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Available Balance :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 340, 103, 30);

        availableBalance.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        getContentPane().add(availableBalance);
        availableBalance.setBounds(510, 340, 113, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Please Enter Your Pin :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 410, 124, 30);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DBBL");

        balanceInfo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        balanceInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/wallet/refresh.png"))); // NOI18N
        balanceInfo.setText("Balance Info");
        balanceInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceInfoActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/wallet/back.png"))); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(334, 334, 334)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 363, Short.MAX_VALUE)
                .addComponent(balanceInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balanceInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1040, 105);

        Ok.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        Ok.setText("OK");
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });
        getContentPane().add(Ok);
        Ok.setBounds(700, 510, 49, 40);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Your Card No :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 220, 103, 30);

        ibPin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ibPin.setText("0");
        getContentPane().add(ibPin);
        ibPin.setBounds(510, 410, 122, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/wallet/wallpaper-background-32.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 15, 1040, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void balanceInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceInfoActionPerformed
        Connection con =openConnection();
        try {
            Statement state = con.createStatement();
            ResultSet resultset = state.executeQuery("select * from user3 where username = '"+Login.UName+"'");
            System.out.println(un);
            if(resultset.next())
            {
                if(resultset.getString("iddbbl").equalsIgnoreCase("0") || resultset.getString("pindbbl").equalsIgnoreCase("0"))
                {
                    JOptionPane.showMessageDialog(null,"You do'nt have DBBL Bank account","Error  !!",JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                 yourCardNo.setText(resultset.getString("iddbbl"));
                availableBalance.setText(resultset.getString("dbbl"));
                balanceDB=Integer.parseInt(resultset.getString("dbbl"));
                pinDB=resultset.getString("pindbbl");
                String WalletMoney=resultset.getString("money");
                walletMoney=Integer.parseInt(WalletMoney);
                }

                

            }
        } catch (SQLException ex) {
            Logger.getLogger(IslamiBankForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_balanceInfoActionPerformed

    private void OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkActionPerformed
        String refillText=this.refillAmount.getText();
        int refillMoney=Integer.parseInt(refillText);
        String pinText=this.ibPin.getText();
        //String self=(String)this.SelfOrOther.getSelectedItem();
        int flag=0;
        if(balanceDB<refillMoney)
        {
            flag=1;
            JOptionPane.showMessageDialog(null,"You are out of money !!","Sorry! You can't refill wallet",JOptionPane.WARNING_MESSAGE);
        }
        if(pinDB.equals(pinText)==false)
        {
            flag=1;
            JOptionPane.showMessageDialog(null,"Your pin "+pinText+" is not correct ","Sorry! You can't refill wallet",JOptionPane.WARNING_MESSAGE);

        }
        else if(flag==0)
        {
            walletMoney+=refillMoney;
            String wMoney=Integer.toString(walletMoney);
            NewBalance=balanceDB-refillMoney;
            //System.out.println(NewBalance);
            String newBalance=Integer.toString(NewBalance);
            Connection con =openConnection();
            try {
                PreparedStatement preparedStatement=con.prepareStatement("UPDATE user3 SET dbbl = ? where username = ?");
                preparedStatement.setString(1, newBalance);
                preparedStatement.setString(2, Login.UName);
                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(IslamiBankForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                PreparedStatement preparedStatement=con.prepareStatement("UPDATE user3 SET money = ? where username = ?");
                preparedStatement.setString(1, wMoney);
                preparedStatement.setString(2, Login.UName);
                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(IslamiBankForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"Your wallet refilled with "+refillText+" Taka successfully :) ","Confirmation message",JOptionPane.INFORMATION_MESSAGE);
        }

        dispose();
    }//GEN-LAST:event_OkActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        walletRefillForm wrf=new walletRefillForm();
        wrf.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed
    public Connection openConnection()
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                this.connection=(Connection) DriverManager.getConnection("jdbc:mysql://"+ip+"/java_db?useSSL=false","root","123");
                System.out.println("Connection established successfully with the database server ,dbbl");
            } catch (Exception e) {
                System.out.println("Error"+e.getMessage());
            }
           return this.connection;
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
            java.util.logging.Logger.getLogger(DBBLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DBBLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DBBLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DBBLForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DBBLForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Ok;
    private javax.swing.JTextField availableBalance;
    private javax.swing.JButton balanceInfo;
    private javax.swing.JPasswordField ibPin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField refillAmount;
    private javax.swing.JTextField yourCardNo;
    // End of variables declaration//GEN-END:variables
}