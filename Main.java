/*     CS286-Fall21*/
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.util.Scanner;


public class Main {
    /* Get skills by candidate id */
    public static void returnmovie(int movieid) {
        
        String query = "{ call returnmovie(?) }";
        ResultSet rs;

        try (Connection conn = MySQLJDBCUtil.getConnection(); //Create a connection
                CallableStatement stmt = conn.prepareCall(query)) {// Define statement

            stmt.setInt(1, movieid);

            rs = stmt.executeQuery(); // Execute Statement
            while (rs.next()) {
                System.out.println(String.format("%s - %s",
                        rs.getString("title"),
                        rs.getString("genres")
                        + " " + rs.getString("ROUND(AVG(rating),1)")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static int get_horrormovie() {
        // 
        String query = "{ call get_horrormovie() }";
        ResultSet rs;

        try (Connection conn = MySQLJDBCUtil.getConnection(); //Create a connection
                CallableStatement stmt = conn.prepareCall(query)) {// Define statement

            rs = stmt.executeQuery(); // Execute Statement
            while (rs.next()) {
                return(rs.getInt("movieid"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    public static int get_actionmovie() {
        // 
        String query = "{ call get_actionmovie() }";
        ResultSet rs;

        try (Connection conn = MySQLJDBCUtil.getConnection(); //Create a connection
                CallableStatement stmt = conn.prepareCall(query)) {// Define statement

            rs = stmt.executeQuery(); // Execute Statement
            while (rs.next()) {
                return(rs.getInt("movieid"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    public static int get_thrillermovie() {
        // 
        String query = "{ call get_thrillermovie() }";
        ResultSet rs;

        try (Connection conn = MySQLJDBCUtil.getConnection(); //Create a connection
                CallableStatement stmt = conn.prepareCall(query)) {// Define statement

            rs = stmt.executeQuery(); // Execute Statement
            while (rs.next()) {
                return(rs.getInt("movieid"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    public static int get_dramamovie() {
        // 
        String query = "{ call get_dramamovie() }";
        ResultSet rs;

        try (Connection conn = MySQLJDBCUtil.getConnection(); //Create a connection
                CallableStatement stmt = conn.prepareCall(query)) {// Define statement

            rs = stmt.executeQuery(); // Execute Statement
            while (rs.next()) {
                return(rs.getInt("movieid"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    public static int get_scifimovie() {
        // 
        String query = "{ call get_scifimovie() }";
        ResultSet rs;

        try (Connection conn = MySQLJDBCUtil.getConnection(); //Create a connection
                CallableStatement stmt = conn.prepareCall(query)) {// Define statement

            rs = stmt.executeQuery(); // Execute Statement
            while (rs.next()) {
                return(rs.getInt("movieid"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    public static int get_comedymovie() {
        // 
        String query = "{ call get_comedymovie() }";
        ResultSet rs;

        try (Connection conn = MySQLJDBCUtil.getConnection(); //Create a connection
                CallableStatement stmt = conn.prepareCall(query)) {// Define statement

            rs = stmt.executeQuery(); // Execute Statement
            while (rs.next()) {
                return(rs.getInt("movieid"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    public static int get_romancemovie() {
        // 
        String query = "{ call get_romancemovie() }";
        ResultSet rs;

        try (Connection conn = MySQLJDBCUtil.getConnection(); //Create a connection
                CallableStatement stmt = conn.prepareCall(query)) {// Define statement

            rs = stmt.executeQuery(); // Execute Statement
            while (rs.next()) {
                return(rs.getInt("movieid"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }
    public static int get_randommovie() {
        // 
        String query = "{ call get_randommovie() }";
        ResultSet rs;

        try (Connection conn = MySQLJDBCUtil.getConnection(); //Create a connection
                CallableStatement stmt = conn.prepareCall(query)) {// Define statement

            rs = stmt.executeQuery(); // Execute Statement
            while (rs.next()) {
                return(rs.getInt("movieid"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

        public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}

