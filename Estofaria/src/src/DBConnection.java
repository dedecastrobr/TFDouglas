package src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DBConnection {
      
     String bd = "mydb";
     String user = "root";
     String password = "kirchoff";
     String url = "jdbc:mysql://localhost/"+bd+"?useTimezone=true&serverTimezone=UTC";
     Connection conn = null;

    
public DBConnection() {
     try {
         Class.forName("com.mysql.cj.jdbc.Driver"); 

         conn = DriverManager.getConnection(url, user, password);
         if(conn != null){
             System.out.println("Connecting database ["+conn+"] OK!");
         }
 
     } catch (SQLException e) {
  
          System.out.println("Exception conexion: " + e.getMessage());
     }catch(ClassNotFoundException e){
          System.out.println("Exception driver: " + e.getMessage());
     }
}
     public Connection getConn() {
         return conn;
     }


}
