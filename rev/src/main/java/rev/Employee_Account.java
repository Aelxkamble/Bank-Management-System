package rev;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee_Account {
	
	
	public void LoginEmp()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Employee ID:-");
		int eid=s.nextInt();
		System.out.println("Enter the Password to login to Your Account:-");
		String password = s.next();
		
		try {
			Statement stmt = (JDBCconnection.createJDBCconnection()).createStatement();
			ResultSet result= stmt.executeQuery("Select ename from employee where eId ="+eid+"and password='"+password+"'");
			if(result.next())
			{
				System.out.println("EMployee Login Sucessfully....");
			}
			else
			{
				System.out.println("You Enter Wrong Password...");
			}
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
			stmt.executeUpdate("update customer set  review= 1 where cId="+eid+"");
			
			System.out.println("Coustomer Account is Verify");
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
			ResultSet rs=stmt.executeQuery("select eid,ename,address,password from employee where eid="+eid+"");
			if(rs.next())
			{
				System.out.println("Employee ID:-" +rs.getInt("eid"));
				System.out.println("Employee Name:-" +rs.getString("ename"));
				System.out.println("Employee Address:-" +rs.getString("address"));
				System.out.println("Employee Pssword:-" +rs.getString("password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		Employee_Account ea= new Employee_Account();
		Scanner scanner = new Scanner(System.in);
		int ch;	
		do {
			System.out.println("*****************WELCOME TO REVATURE BANK****************");
			System.out.println("1. Employee Login");
			System.out.println("2. Verify Customer Account");
			System.out.println("3. Display  Emplyee Deatails");
			System.out.println("================================================================================================");
			System.out.println("Enter an option:");
			System.out.println("================================================================================================");
			int option = scanner.nextInt();
			System.out.println("\n");
			
			switch(option) {
			case 1:ea.LoginEmp();
				break;
				
			case 2:ea.reviewEmpAccount();
				break;
			case 3:ea.viewEmpAccount();
			    break;
				
			default:System.out.println("Invalid Option!!.Please Enter again...");
				break;
			}
			System.out.println("Do you want to continue?(1)");
			ch =scanner.nextInt();
		}while( ch==1);
		
		System.out.println("ThakYou for using our services.........");

	

	}
}
