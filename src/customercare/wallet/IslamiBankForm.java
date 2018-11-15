
package customercare.wallet;

import com.mysql.jdbc.Connection;
import customercare.database.ICrudImpl;
import customercare.ui.Login;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class IslamiBankForm extends javax.swing.JFrame {
    private Connection connection;
    public String un,pinDB;
    public static String ip = ICrudImpl.ip;
    public int balanceDB,NewBalance,walletMoney;
    Login l = new Login();
    public IslamiBankForm() {
        initComponents();
        setLocationRelativeTo(null);
        un = Login.UName;
        //show();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        balanceInfo = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        yourCardNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        refillAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        availableBalance = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Ok = new javax.swing.JButton();
        ibPin = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1047, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Islami Bank");

        balanceInfo.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        balanceInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/wallet/refresh.png"))); // NOI18N
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
                .addGap(22, 22, 22)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                .addComponent(balanceInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(balanceInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addGap(19, 19, 19))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Your Card No :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 103, 35));
        getContentPane().add(yourCardNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 214, 35));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Refill Amount :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 103, 35));

        refillAmount.setText("0");
        getContentPane().add(refillAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 113, 35));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Available Balance :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 103, 35));
        getContentPane().add(availableBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 113, 35));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Please Enter Your Pin :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, 35));

        Ok.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        Ok.setText("OK");
        Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkActionPerformed(evt);
            }
        });
        getContentPane().add(Ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 72, 37));

        ibPin.setText("0");
        getContentPane().add(ibPin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 122, 38));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/wallet/islamibanksssssss.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 1050, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
   else if(flag==0 )
   {
       NewBalance=balanceDB-refillMoney;
       String newBalance=Integer.toString(NewBalance);
       walletMoney+=refillMoney;
       String wMoney=Integer.toString(walletMoney);
       Connection con =openConnection();
            try {
                PreparedStatement preparedStatement=con.prepareStatement("UPDATE user3 SET islamibank = ? where username = ?");
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

    private void balanceInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceInfoActionPerformed
          Connection con =openConnection();
        try {
            Statement state = con.createStatement();
            ResultSet resultset = state.executeQuery("select * from user3 where username = '"+Login.UName+"'");
            System.out.println(un);
            if(resultset.next())
            {
                if(resultset.getString("idislmibank").equalsIgnoreCase("0") || resultset.getString("pinislamibank").equalsIgnoreCase("0"))
                {
                    JOptionPane.showMessageDialog(null,"You do'nt have Islami Bank account","Error  !!",JOptionPane.WARNING_MESSAGE);
                    
                }
                else
                {
                    yourCardNo.setText(resultset.getString("idislmibank"));
                    
                    availableBalance.setText(resultset.getString("islamibank"));
                balanceDB=Integer.parseInt(resultset.getString("islamibank"));
                pinDB=resultset.getString("pinislamibank");
                String WalletMoney=resultset.getString("money");
                walletMoney=Integer.parseInt(WalletMoney);
                }
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(IslamiBankForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_balanceInfoActionPerformed

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
                System.out.println("Connection established successfully with the database server in Islami Bank");
            } catch (Exception e) {
                System.out.println("Error in Islami Bank"+e.getMessage());
            }
           return this.connection;
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
