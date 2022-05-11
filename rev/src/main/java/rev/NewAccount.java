package rev;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NewAccount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter customer ID:-");
		int cId=s.nextInt();
		System.out.println("Enter customer First Name:-");
		String name=s.next();
//		System.out.println("Enter customer Last Name:-");
//		String lname=s.next();
		System.out.println("Enter customer Age:-");
		int age=s.nextInt();
		System.out.println("Enter customer Phone:-");
		String phone=s.next();
		System.out.println("Enter customer Address:-");
		String address=s.next();
		System.out.println("Enter customer Aadhar Numer:-");
		int aadhar_no=s.nextInt();
		System.out.println("Enter customer Pan Number:-");
		String pan_no=s.next();
		System.out.println("Enter customer Password:-");
		String pass=s.next();
		System.out.println("Enter initial Balance:-");
		float balance=s.nextFloat();
		
		
		try {
			Statement stmt=(JDBCconnection.createJDBCconnection()).createStatement();
			int no = stmt.executeUpdate("Insert into customer values("+cId+",'"+name+"',"+age+",'"+phone+"','"+address+"',"+aadhar_no+",'"+pan_no+"','"+pass+"',"+balance+")");
			System.out.println("Inserted values"+no);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
