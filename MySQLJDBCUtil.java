import java.io.FileInputStream;
import java.io.IOException; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.util.Properties;
/**
 * Write a description of class mysqljdbc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MySQLJDBCUtil {
/** Get database connection * * @return a Connection object * @throws SQLException */
public static Connection getConnection() throws SQLException { Connection conn = null;
try {
// db parameters use your schema and password
String url = "jdbc:mysql://127.0.0.1:3306/finalproject"; 
String user = "root";
String password = "Luu38Winston";
// create a connection to the database
conn = DriverManager.getConnection(url, user, password); // more processing here
// ...
} catch(SQLException e) { System.out.println(e.getMessage());
}
return conn; }
}