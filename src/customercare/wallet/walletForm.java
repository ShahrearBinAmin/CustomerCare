/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercare.wallet;

import com.mysql.jdbc.Connection;
import static customercare.database.ICrudImpl.ip;
import java.sql.ResultSet;
import customercare.ui.Login;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class walletForm extends javax.swing.JFrame {

    private Connection connection;
    Login login = new Login();
    /**
     * Creates new form walletForm
     */
    public walletForm() {
        initComponents();
        
         
        //balance();
        show();

    }

          @SuppressWarnings("unchecked")
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        m = new javax.swing.JLabel();
        money = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        m.setText("Money :");

        jLabel1.setText("username:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(money)
                    .addComponent(userNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(money, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void balance()
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                this.connection=(Connection) DriverManager.getConnection("jdbc:mysql://"+ip+"/wallet","root","123");
                System.out.println("Connection established successfully with the database wallet");
                PreparedStatement preparedStatement = connection.prepareStatement("insert into wallet1(username,money) values (?,?)");
                preparedStatement.setString(1,login.getUsername() );
                preparedStatement.setString(2, "10000");
                preparedStatement.executeUpdate();
                System.out.println("Connection established successfully with the database wallet");
            } catch (Exception e) {
                System.out.println("Error"+e.getMessage());
            }
            
        }
    public void show()
    {
        
        try {
            userNameText.setText(login.getUsername());
                Class.forName("com.mysql.jdbc.Driver");
                this.connection=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/wallet","root","");
                System.out.println("Connection established successfully with the database wallet");
                Statement statement = connection.createStatement();
                ResultSet resultSet =    (ResultSet) statement.executeQuery("select * from wallet1 where username = '"+userNameText.getText()+"'");
                //money.setText(resultSet.getString("money"));
                System.out.println("Connection established successfully with the database wallet");
            } catch (Exception e) {
                System.out.println("Error"+e.getMessage());
            }
       
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel m;
    private javax.swing.JTextField money;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables
}
