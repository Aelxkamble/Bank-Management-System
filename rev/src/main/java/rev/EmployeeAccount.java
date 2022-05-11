package rev;
import java.util.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

public class EmployeeAccount {
	public void createEmpAccount()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee Id:-");
		int eid= s.nextInt();
		
		System.out.println("Enter Employee Name:-");
		String ename=s.next();
		
		System.out.println("Enter Employee Age:-");
		int age=s.nextInt();
		
		System.out.println("Enter Employee Address");
		String add=s.next();
		
		System.out.println("Enter Employee Password");
		String pass=s.next();
		
		
		
		try {
			Statement stmt = (JDBCconnection.createJDBCconnection()).createStatement();
			int no = stmt.executeUpdate("insert into employee values("+eid+",'"+ename+"',"+age+",'"+add+"','"+pass+"'");
			System.out.println("Inserted values"+no);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void LoginEmp()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Employee ID:-");
		int eid=s.nextInt();
		System.out.println("Enter the Password to login to Your Account:-");
		String pass = s.next();
		
		try {
			Statement stmt = (JDBCconnection.createJDBCconnection()).createStatement();
			boolean result= stmt.execute("Select ename from employee where eId ="+eid+"and pass='"+pass+"'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public void reviewEmpAccount()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Employee ID to Revivew:-");
		int eid=s.nextInt();
		
		try {
			Statement stmt = (JDBCconnection.createJDBCconnection()).createStatement();
			stmt.executeUpdate("update employee set  review= 1 where cId="+eid+"");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void viewEmpAccount()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Employee ID to Display Details:-");
		int eid=s.nextInt();
		
		try {
			Statement stmt = (JDBCconnection.createJDBCconnection()).createStatement();
			ResultSet rs=stmt.executeQuery("select eid,name,age,add,pass from employee where eid="+eid+"");
			System.out.println("Employee ID:-" +rs.getInt("+eid+"));
			System.out.println("Employee Name:-" +rs.getString("+name+"));
			System.out.println("Employee Age:-" +rs.getInt("+age+"));
			System.out.println("Employee Address:-" +rs.getString("+add+"));
			System.out.println("Employee Pssword:-" +rs.getString("+pass+"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void deleteEmpAccount()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter EmployeeID to be Delete:-");
		int eid=s.nextInt();
		
		
		try {
			Statement stmt = (JDBCconnection.createJDBCconnection()).createStatement();
			ResultSet result=stmt.executeQuery("delete * from employee where eid="+eid+"");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	public static void main(String[] args) {
		EmployeeAccount ea= new EmployeeAccount();
		ea.createEmpAccount();
	}

}
