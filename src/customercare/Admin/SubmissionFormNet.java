
package customercare.Admin;

import static customercare.database.ICrudImpl.ip;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class SubmissionFormNet extends javax.swing.JFrame {
      String s1;
      public static String ip="localhost";
      public static String Specific;
    public SubmissionFormNet(String name) {
        initComponents();
        this.Specific=name;
        System.out.println(Specific+"----------");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField6 = new javax.swing.JTextField();
        PackUpdate1 = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        PackPhotoBrowse1 = new javax.swing.JButton();
        PackTaka1 = new javax.swing.JTextField();
        PackData1 = new javax.swing.JTextField();
        PackTitle1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PackDescription1 = new javax.swing.JTextArea();

        jButton3.setText("Update");

        jLabel2.setText("jLabel1");

        jButton4.setText("Photo");

        jTextField4.setText("Taka");

        jTextField5.setText("Megabyte");

        jTextField6.setText("Offer Description");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1256, 588));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PackUpdate1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        PackUpdate1.setText("Update");
        PackUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackUpdate1ActionPerformed(evt);
            }
        });
        getContentPane().add(PackUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1182, 271, -1, 34));

        image.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        image.setText("Offer Image");
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 152, 441, 304));

        PackPhotoBrowse1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        PackPhotoBrowse1.setText("Photo");
        PackPhotoBrowse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackPhotoBrowse1ActionPerformed(evt);
            }
        });
        getContentPane().add(PackPhotoBrowse1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 238, 97, 33));

        PackTaka1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        PackTaka1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PackTaka1.setText("0");
        getContentPane().add(PackTaka1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 304, 97, 39));

        PackData1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        PackData1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PackData1.setText("0");
        getContentPane().add(PackData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 383, 97, 34));

        PackTitle1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        PackTitle1.setText("Title");
        getContentPane().add(PackTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 152, 483, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Offer Update");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 33, 396, 52));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Taka");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 304, 50, 39));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mb/Minute");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 383, 67, 34));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/Admin/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 110, 60));

        PackDescription1.setColumns(20);
        PackDescription1.setRows(5);
        jScrollPane1.setViewportView(PackDescription1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 470, 260));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PackPhotoBrowse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackPhotoBrowse1ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
       //fileChooser.setLocation();
         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
         fileChooser.addChoosableFileFilter(filter);
         int result = fileChooser.showSaveDialog(null);
         if(result == JFileChooser.APPROVE_OPTION){
             File selectedFile = fileChooser.getSelectedFile();
             String path = selectedFile.getAbsolutePath();
             image.setIcon(ResizeImage(path));
             s1 = path;
              }
         else if(result == JFileChooser.CANCEL_OPTION){
             System.out.println("No Data");
         }
    }//GEN-LAST:event_PackPhotoBrowse1ActionPerformed

    private void PackUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackUpdate1ActionPerformed
        try{
               /*String url = "jdbc:mysql://192.168.0.126/adminupdate?autoReconnect=true&useSSL=false";
               System.out.println("error");
               Connection con = DriverManager.getConnection(url,"root","123");*/
               try {
    Class.forName("com.mysql.jdbc.Driver");
} 
catch (ClassNotFoundException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
} 



    String url = "jdbc:mysql://"+ip+"/adminupdate?autoReconnect=true&useSSL=false";
    Connection con = DriverManager.getConnection(url, "root", "123");


               System.out.println("connected from insertion page");
               PreparedStatement ps = con.prepareStatement("insert into "+Specific+"(imagein,takain,megabyte,title,offerdescription) values(?,?,?,?,?)");
               System.out.println("Hi");
               InputStream is = new FileInputStream(new File(s1));
               System.out.println("NNN");
               ps.setBlob(1,is);
               ps.setString(2, PackTaka1.getText());
               ps.setString(3, PackData1.getText());
               ps.setString(4,PackTitle1.getText());
               ps.setString(5,PackDescription1.getText());
               ps.executeUpdate();
               JOptionPane.showMessageDialog(null, "Data submitted successfully!");
           }catch(Exception ex){
               System.out.println(ex);
               JOptionPane.showMessageDialog(null,"Sorry!! You didn't give data","",JOptionPane.ERROR_MESSAGE);
           }
        reSetallField();
    }//GEN-LAST:event_PackUpdate1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        gpSelectionForm gp=new gpSelectionForm("");
        gp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubmissionFormNet(Specific).setVisible(true);
            }
        });
    }
    public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(image.getWidth(), image.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
    private void reSetallField() {
        this.PackData1.setText(null);
        this.PackTaka1.setText(null);
        this.PackTitle1.setText(null);
        this.image.removeAll();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PackData1;
    private javax.swing.JTextArea PackDescription1;
    private javax.swing.JButton PackPhotoBrowse1;
    private javax.swing.JTextField PackTaka1;
    private javax.swing.JTextField PackTitle1;
    private javax.swing.JButton PackUpdate1;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
