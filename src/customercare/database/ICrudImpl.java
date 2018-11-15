
package customercare.database;

import com.mysql.jdbc.Connection;
import customercare.model.User;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Shahrear
 */
public class ICrudImpl implements ICrud {
    private Connection connection;
    public static String ip="localhost";// You need to change the ip for communicating with other

    @Override
    public boolean insert(User user) {
        try {
            String query="INSERT INTO user3 values('"+user.getUsername()+"','"+user.getName()+"','"+user.getLastname()+"','"+user.getPassword()+"','"+user.getMobile()+"','"+user.getGender()+"','"+user.getEmail()+"','"+user.getAtm()+"','"+user.getIdIslamiBank()+"','"+user.getPinIslamiBank()+"','"+user.getIslamiBank()+"','"+user.getIdCityBank()+"','"+user.getPinCityBank()+"','"+user.getCityBank()+"','"+user.getIdStandardChartred()+"','"+user.getPinStandardChartred()+"','"+user.getStandardChartered()+"','"+user.getIdBankAsia()+"','"+user.getPinBankAsia()+"','"+user.getBankAsia()+"','"+user.getIdDbbl()+"','"+user.getPinDbbl()+"','"+user.getDbbl()+"','"+user.getIdBracBank()+"','"+user.getPinBracBank()+"','"+user.getBracBank()+"','"+user.getMoney()+"','"+user.getAirtime()+"','"+user.getMegabyte()+"','"+user.getMinute()+"')";
            Statement statement=this.connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            return  true;
        } catch (SQLException ex) {
             //stem.out.println(ex);
            return false;
          
        } 
    }

    @Override
    public User getUser(String userName, String password) {
       try {
            String query="SELECT * FROM user3 where username ='"+userName+"'and password='"+password+"'";
            PreparedStatement preparedStatement=this.connection.prepareStatement(query);
            ResultSet resultSet=preparedStatement.executeQuery();
            User user = null;
            if(resultSet.next())
            {
                user=new User();
                user.setUsername(resultSet.getString("username"));
                user.setName(resultSet.getString("name"));
                user.setLastname(resultSet.getString("lastname"));
                user.setPassword(resultSet.getString("password"));
                user.setMobile(resultSet.getString("mobile"));
                user.setGender(resultSet.getString("gender"));
                user.setEmail(resultSet.getString("email"));
                user.setAtm(resultSet.getString("atm"));
//                user.setCardnumber(resultSet.getString("cardno"));
//                user.setPin(resultSet.getString("pin"));
            }
            preparedStatement.close();
            resultSet.close();
            return  user;
        } catch (SQLException ex) {
            return null;
        } 
        
    }
    
    public void openConnection()
        {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                this.connection=(Connection) DriverManager.getConnection("jdbc:mysql://"+ip+"/java_db?useSSL=false","root","123");
                System.out.println("Connection established successfully with the database server");
            } catch (Exception e) {
                System.out.println("Error"+e.getMessage());
            }
            //return this.connection;
        }
    
}
