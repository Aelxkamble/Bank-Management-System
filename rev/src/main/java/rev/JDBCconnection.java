package rev;
import java.util.*;
import java.sql.*;

public class JDBCconnection{
   
	   public static String url="jdbc:postgresql://localhost:5432/bank";
	   public static String user="postgres";
	   public static String password="Balaji569@";
	   public static Connection createJDBCconnection() {
		   			Connection con=null;
		   
		   try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   return con;
	   }  
}
