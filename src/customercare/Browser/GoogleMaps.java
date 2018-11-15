/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customercare.Browser;
import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
public class GoogleMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner scan=new Scanner(System.in);
        String sp="gp";//scan.next();
        
        String link = "https://www.google.com.bd/maps/@23.7317006,90.3930042,17.54z?hl=en";
        NativeInterface.open();
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            JFrame frame = new JFrame("Find Agent");
            
            frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           
            frame.getContentPane().add(getBrowser(link), BorderLayout.CENTER);
            frame.setSize(700,550);
          
            
            frame.setLocationByPlatform(true);
            frame.setVisible(true);
            
            frame.setLocationRelativeTo(null);
        }
    });
        NativeInterface.runEventPump();
         Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
        @Override
        public void run() {
            NativeInterface.close();
        }
    }));
    }
         public static JPanel getBrowser(String link)
    {
         JPanel p = new JPanel(new BorderLayout());
         JWebBrowser wb = new JWebBrowser();
         p.add(wb,BorderLayout.CENTER);
         wb.setBarsVisible(false);
         wb.navigate(link);
         return p;
    }
        
    
}
