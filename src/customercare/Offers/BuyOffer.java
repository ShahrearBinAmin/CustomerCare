/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercare.Offers;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import static customercare.database.ICrudImpl.ip;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import customercare.ui.Login;
import java.sql.PreparedStatement;

public class BuyOffer extends javax.swing.JFrame {
    String s1,mobilenumber;
    int megabyteDbU,minuteDbU,flag=0,taka,megabyteDbA,Airtime;
    public static String Specific;
    private static final String VOICENAME="kevin16";////////////////kevin16
    
    public BuyOffer(String name) {
        initComponents();
        this.Specific=name;
        setLocationRelativeTo(null); 
        showItem(pos);
        System.err.println("robi after in constructor");
        System.out.println(Specific);
        if(Specific.endsWith("internet"))
        {
            flag=1;
        }
        else
            flag=0;
        
        setLocationRelativeTo(null);
    }
    char detectnumber(String Specific)
        {
            char a='0';
            if(Specific.startsWith("gp"))
            {
                a='7';
            }
            else if(Specific.startsWith("airtel"))
            {
                a='6';
            }
            else if(Specific.startsWith("robi"))
            {
                a='8';
            }
            else if(Specific.startsWith("banglalink"))
            {
                a='9';
            }
            else if(Specific.startsWith("teletalk"))
            {
               a='5';
            }
            return a;
        }
    int pos=0;
    //connecting with adminUpdate where all offers are located
    public Connection getConnection(){
        Connection conn = null;
        try {
            String url = "jdbc:mysql://"+ip+"/adminupdate?useSSL=false";
            
            conn = DriverManager.getConnection(url, "root","123");
        } catch (SQLException e) {
           Logger.getLogger(Query.class.getName()).log(Level.SEVERE, null, e);
        }
        return conn;
    }
    //connecting with user details,java_db
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
    //Receving the details in arrylist from db
    public ArrayList<OfferDetails> getItemsList()
    {
        try {
            Connection connection = getConnection();
           
            Statement st = connection.createStatement();
            String cmd = "SELECT * FROM "+Specific;
            ResultSet rs = st.executeQuery(cmd);

            ArrayList<OfferDetails> list = new ArrayList<OfferDetails>();

            OfferDetails item;

            while(rs.next())
            {
//                if(flag==1)
//                {
//                    OfferAmount.setText(rs.getString("megabyte")+" "+"Megabyte");
//                }
//                else
//                {
//                    OfferAmount.setText(rs.getString("megabyte")+" "+"Minute");
//                }
//                offerPrice.setText(rs.getString("takain")+" "+"Taka");
                megabyteDbA=Integer.parseInt(rs.getString("megabyte"));
                taka=Integer.parseInt(rs.getString("takain"));
                System.err.println("robi after rs");
               item = new OfferDetails(rs.getBytes("imagein"),rs.getString("takain"),
                      rs.getString("megabyte"),rs.getString("title"),rs.getString("offerdescription"));
               
               list.add(item);
            }
            return list;

        } catch (SQLException e) {
            return null;
        }
    }
     public String getTitle()
    {
        String title_name = title.getText();
        return title_name;
    }
     //showing the details in user interface
     public void showItem(int index)
    {

        title.setText(getItemsList().get(index).getTitle());
        System.err.println("robi after items");
        DescriptionArea.setText(getItemsList().get(index).getDescription());
        if(flag==1)
        {
           OfferAmount.setText(getItemsList().get(index).getMb()+" Megabyte"); 
        }
        else
        {
          OfferAmount.setText(getItemsList().get(index).getMb()+" Minute");  
        }
        
        offerPrice.setText(getItemsList().get(index).getTaka()+" Taka");
        ImageIcon icon = new ImageIcon(getItemsList().get(index).getImage());
        Image image = icon.getImage().getScaledInstance(imageLabel.getWidth(), 
        imageLabel.getHeight(), Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(image));
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        balance = new javax.swing.JTextField();
        buy = new javax.swing.JButton();
        title = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        next = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MbOrMin = new javax.swing.JTextField();
        listen = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescriptionArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        offerPrice = new javax.swing.JTextField();
        OfferAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1090, 595));
        getContentPane().setLayout(null);
        getContentPane().add(imageLabel);
        imageLabel.setBounds(596, 131, 426, 271);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Your Airtime Balance :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(776, 431, 144, 34);

        balance.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        balance.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(balance);
        balance.setBounds(932, 431, 101, 34);

        buy.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        buy.setText("Buy");
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });
        getContentPane().add(buy);
        buy.setBounds(502, 515, 80, 35);

        title.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        title.setForeground(new java.awt.Color(102, 153, 255));
        getContentPane().add(title);
        title.setBounds(190, 90, 373, 35);

        refresh.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        getContentPane().add(refresh);
        refresh.setBounds(965, 90, 87, 35);

        next.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next);
        next.setBounds(942, 515, 81, 35);

        previous.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        previous.setText("Previous");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });
        getContentPane().add(previous);
        previous.setBounds(36, 515, 84, 35);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("You have :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(638, 90, 86, 35);

        MbOrMin.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        MbOrMin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(MbOrMin);
        MbOrMin.setBounds(736, 90, 131, 35);

        listen.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        listen.setText("Listen");
        listen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listenActionPerformed(evt);
            }
        });
        getContentPane().add(listen);
        listen.setBounds(974, 12, 69, 60);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel3.setText("Title :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(81, 90, 91, 35);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/Offers/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(36, 12, 110, 60);

        DescriptionArea.setColumns(20);
        DescriptionArea.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        DescriptionArea.setRows(5);
        jScrollPane1.setViewportView(DescriptionArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(81, 129, 482, 273);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Offer Price :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(81, 414, 100, 27);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Offer Amount :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(81, 447, 100, 24);

        offerPrice.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        offerPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(offerPrice);
        offerPrice.setBounds(193, 414, 100, 27);

        OfferAmount.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        OfferAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(OfferAmount);
        OfferAmount.setBounds(193, 447, 100, 28);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customercare/Offers/cb5f93fd1f4e9947b655eeccdab52aca--vector-background-background-images.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -5, 1090, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    
   // used for showing balnce for the user
    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        Connection con=openConnection();
        try {
            Statement state = con.createStatement();
            ResultSet resultset = state.executeQuery("select * from user3 where username = '"+Login.UName+"'");//sb need to replace with login.Uname;
            //System.out.println(un);
            if(resultset.next())
            {
                balance.setText(resultset.getString("airtime")+" "+"Taka");
                if(flag==1)
                {
                    MbOrMin.setText(resultset.getString("totalmb")+" "+"Megabyte");
                    //OfferAmount.setText(s1);
                }
                else if(flag==0)
                {
                     MbOrMin.setText(resultset.getString("totalmin")+" "+"Minute");
                }
                Airtime=Integer.parseInt(resultset.getString("airtime"));
                megabyteDbU=Integer.parseInt(resultset.getString("totalmb"));
                minuteDbU=Integer.parseInt(resultset.getString("totalmin"));
                System.out.println(minuteDbU+"-------------");
                mobilenumber=resultset.getString("mobile");
                Connection conn=getConnection();
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuyOffer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_refreshActionPerformed
    //going next item of arraylist
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        pos++;
        if(pos >= getItemsList().size())
        {
            pos = getItemsList().size()-1;
        }
        showItem(pos);
    }//GEN-LAST:event_nextActionPerformed
    // going previous item of arraylist
    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        pos--;
        if(pos < 0)
        {
            pos = 0;
        }
        showItem(pos);
    }//GEN-LAST:event_previousActionPerformed
    //updating the changed airtime & megabyte
    String newMegabyteDbU,newMinuteDbU,airtime;
    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
       char b=detectnumber(Specific);
   
        if(b==mobilenumber.charAt(2))
        {
           if(flag==1)
        {//megabyte needed to change
            if(Airtime>taka)
            {
                Airtime-=taka;
                megabyteDbU+=megabyteDbA;
                newMegabyteDbU=Integer.toString(megabyteDbU);
                newMinuteDbU=Integer.toString(minuteDbU);
                airtime=Integer.toString(Airtime);
                JOptionPane.showMessageDialog(null,"Your internet balance purshed successfully ","Congratulation!!",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"You are out of money ","Sorry you can'nt buy!!",JOptionPane.WARNING_MESSAGE);
            }
        }
        else if(flag==0)
        {
            if(Airtime>taka)
            {
                Airtime-=taka;
                minuteDbU+=megabyteDbA;
                newMegabyteDbU=Integer.toString(megabyteDbU);
                newMinuteDbU=Integer.toString(minuteDbU);
                airtime=Integer.toString(Airtime);
                JOptionPane.showMessageDialog(null,"Your minute purshed successfully ","Congratulation!!",JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"You are out of money ","Sorry you can'nt buy!!",JOptionPane.WARNING_MESSAGE);
            }
        }
        Connection con =openConnection();
            try {
                PreparedStatement preparedStatement=con.prepareStatement("UPDATE user3 SET airtime=? where username = ?");
                preparedStatement.setString(1,airtime);
                preparedStatement.setString(2, Login.UName);
                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(BuyOffer.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                PreparedStatement preparedStatement=con.prepareStatement("UPDATE user3 SET totalmb=? where username = ?");
                preparedStatement.setString(1,newMegabyteDbU );
                preparedStatement.setString(2, Login.UName);
                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(BuyOffer.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                PreparedStatement preparedStatement=con.prepareStatement("UPDATE user3 SET totalmin=? where username = ?");
                preparedStatement.setString(1,newMinuteDbU );
                preparedStatement.setString(2, Login.UName);
                preparedStatement.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(BuyOffer.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        else
        {
            JOptionPane.showMessageDialog(null,"You can't buy this offer ","You are not in this service provider!!",JOptionPane.WARNING_MESSAGE);
        }
        
            
        
    }//GEN-LAST:event_buyActionPerformed

    private void listenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listenActionPerformed
        //System.setProperty("mbrola.base","C:\\Users\\Shahrear\\Documents\\NetBeansProjects\\resources");
        Voice voice;
        VoiceManager vm=VoiceManager.getInstance();
        voice=vm.getVoice(VOICENAME);
        voice.allocate();
        if(DescriptionArea.getText()==null)
        {
            try {
            voice.speak("Nothing to listen");
        } catch (Exception e) {
        }
        }
        else
        {
            try {
                voice.speak("Hey"+Login.UName+"I'm Watson It's pleasure to tell you Offer title"+title.getText());
                if(flag==1)
            {
                    voice.speak("Your current internet pack is"+MbOrMin.getText()+"Megabyte");
            }
            else voice.speak("Your current voice pack is"+MbOrMin.getText()+"Minute");
                if(Airtime<taka)
            {
                voice.speak("You can not buy this offer,You are out of money!!,Please recharge");
                
            }
            else
                {
                    voice.speak("You can buy this offer,by pressing buy button");
                    voice.speak(DescriptionArea.getText());
                }
            
        } catch (Exception e) {
        }
        }
    }//GEN-LAST:event_listenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        String pass;
//        if(flag==1)
//        {
//            pass="";
//        }
//        OfferType of=new OfferType(Specific);
//        of.setVisible(true);
//        this.hide();
         offersForm of=new offersForm();
         of.setVisible(true);
         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyOffer(Specific).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea DescriptionArea;
    private javax.swing.JTextField MbOrMin;
    private javax.swing.JTextField OfferAmount;
    private javax.swing.JTextField balance;
    private javax.swing.JButton buy;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listen;
    private javax.swing.JButton next;
    private javax.swing.JTextField offerPrice;
    private javax.swing.JButton previous;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
