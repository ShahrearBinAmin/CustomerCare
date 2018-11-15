
package customercare.ui;

import customercare.model.User;
import customercare.model.UserInteractionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Shahrear
 */
public class SignupForm extends javax.swing.JDialog {

    private final UserInteractionListener listener;

   
    public SignupForm(java.awt.Frame parent, boolean modal,UserInteractionListener listener) {
        super(parent, modal);
        this.listener=listener;
        initComponents();
        setLocationRelativeTo(parent);
        setTitle("SignUp Form");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        signup = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        atm = new javax.swing.JComboBox<>();
        mobile = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(623, 573));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("First Name :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 108, 33));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Last Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 108, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("User Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 108, 34));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" Password :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 108, 36));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 195, 33));
        getContentPane().add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 195, 33));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 195, 33));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 195, 33));

        signup.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        signup.setText("Signup");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, -1, 33));

        clear.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, 33));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gender :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 108, 36));

        gender.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 68, 36));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("E-Mail :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 108, 36));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ATM :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 108, 36));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 195, 33));

        atm.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        atm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VISA", "Master Card", "Nexus", "VISA electron", "American Express" }));
        getContentPane().add(atm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 111, 36));
        getContentPane().add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 195, 33));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Mobile :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 108, 39));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Sign Up Form");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 195, 56));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/ui/042e750cbc58c97de7c0a07512475e5d.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 640, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        resetAllFields();
    }//GEN-LAST:event_clearActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        try{
            //System.out.println(SignupIsVallid());
        if(SignupIsVallid())
        {
            User user=new User();
            user.setName(this.name.getText());
            user.setLastname(this.lastname.getText());
            user.setUsername(this.username.getText());
            user.setPassword(this.password.getText());
            user.setMobile(this.mobile.getText());
            user.setGender((String) this.gender.getSelectedItem());
            user.setEmail(this.email.getText());
            user.setAtm((String) this.atm.getSelectedItem());
            //System.out.println(this.listener.signup(user));
            if(this.listener.signup(user))
            {
                dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"You can't signup with the specified form!","Please check your form Again",JOptionPane.ERROR_MESSAGE);
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"User Name must not be empty!","Please check your form Again",JOptionPane.WARNING_MESSAGE);
        }
        }catch(Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_signupActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> atm;
    private javax.swing.JButton clear;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> gender;
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
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JButton signup;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void resetAllFields() {
        this.name.setText(null);
        this.lastname.setText(null);
        this.username.setText(null);
        this.password.setText(null);
        this.email.setText(null);
        this.mobile.setText(null);
    }

    private boolean SignupIsVallid() {
        return !this.username.getText().isEmpty();
    }
}
