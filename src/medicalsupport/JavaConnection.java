package medicalsupport;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author danmutwiri
 */
public class JavaConnection {
    private static Connection connection;
    public static Connection dbConnect(){
        String database = "jdbc:mysql://localhost:3306/demo";
        String username = "root";
        String password = "daniel123";
        
        if(connection == null){
            try{
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                connection = (Connection) DriverManager.getConnection(database,username,password);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Connection Failed!");
            }
        }
        return connection;
    }
}