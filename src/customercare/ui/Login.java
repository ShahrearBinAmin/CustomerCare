/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercare.ui;

import customercare.Admin.SuperAdmin;
import customercare.helper.Controller;
import customercare.model.User;
import customercare.model.UserInteractionListener;

/**
 *
 * @author Shahrear
 */
public class Login extends javax.swing.JFrame implements UserInteractionListener{
    private final Controller controller;
    public static String UName;
    public String getuname()
    {
        UName= username.getText();
        return UName;
    }
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        this.controller=Controller.getController();
    }
    static String user_name;
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        UserOrAdmin = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Name :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 194, 116, 47));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 253, 116, 45));

        username.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 194, 217, 41));

        password.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 253, 217, 40));

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Customer Care");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        login.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 326, 78, 34));

        clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 326, 78, 34));

        signup.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        signup.setText("SignUp");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 494, 102, 46));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("New User? Sign up here");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 444, -1, 32));

        UserOrAdmin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        UserOrAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        getContentPane().add(UserOrAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 194, 67, 41));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/ui/finalBack.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -2, 600, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
       SignupForm signupForm=new SignupForm(this,true,this);
       signupForm.setVisible(true);
    }//GEN-LAST:event_signupActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        this.username.setText(null);
        this.password.setText(null);
    }//GEN-LAST:event_clearActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try{
        User user=this.controller.login(this.username.getText(),this.password.getText());
         System.out.println(user);
        String s=(String) UserOrAdmin.getSelectedItem();
        if(user!=null)
        {
           HomePage homePage=new HomePage();
           homePage.setVisible(true);
           user_name = user.getUsername();
            System.out.println(user_name);
            getuname();
            this.hide();
        }
        else if((username.getText()).equalsIgnoreCase("shanto") && (password.getText()).equalsIgnoreCase("234") && s.equals("Admin"))
        {
            SuperAdmin sa=new SuperAdmin();
            sa.setVisible(true);
            dispose();
        }
        else
        {
            System.out.println("Authentication dennied");
        }}catch(Exception e)
        {
            System.out.println("problem");
        }
    }//GEN-LAST:event_loginActionPerformed
    public String getUsername()
    {
        return user_name;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> UserOrAdmin;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signup;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    @Override
    public boolean signup(User user) {
        return this.controller.signup(user);
    }
}
