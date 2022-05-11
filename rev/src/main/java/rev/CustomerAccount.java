package rev;
import java.util.*;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;

public class CustomerAccount {
	
	 static Scanner s=new Scanner(System.in);
	public boolean login()
	{
		System.out.println("Enter the Customer ID:-");
		int cId=s.nextInt();
		System.out.println("Enter the Password to login to Your Account:-");
		String pass = s.next();
		
		
		try {
		Statement stmt = (JDBCconnection.createJDBCconnection()).createStatement();
		boolean result= stmt.execute("Select name from customer where cId ="+cId+"and pass='"+pass+"'");
		if(result ==true)
		{
			System.out.println("Login");
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
		
	}
		
		void deposit()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Customer ID in which you want to deposit amount:");
			int cId=s.nextInt();
			System.out.println("Enter an amount to deposit:");
			float amou  =s.nextFloat();
			
			
			try {
				Statement stmt = (JDBCconnection.createJDBCconnection()).createStatement();
				stmt.executeUpdate("update customer set balance = balance +"+amou+" where cId="+cId+"");
				System.out.println("Amount is deposited..");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		void withdraw()
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Customer ID from where you want to withdraw amount:");
			int cId=s.nextInt();
			System.out.println("Enter an amount to withdraw:");
			float amou  =s.nextFloat();
			
			
			try {
				Statement stmt = (JDBCconnection.createJDBCconnection()).createStatement();
				stmt.executeUpdate("update customer set balance=balance -"+amou+" where cId="+cId+"");
				System.out.println("Amount is withdraw...");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		public void checkBalance() 
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter CustomerID to Check Balance");
			int cID=s.nextInt();
			
			try {
				Statement stmt = (JDBCconnection.createJDBCconnection()).createStatement();
				ResultSet rs=stmt.executeQuery("select cId,name,balance from customer where cId="+cID+"");
				if(rs.next())
				{
					System.out.println(" Your Balance is :-"+rs.getFloat("balance"));
				}
				else 
				{
					System.out.println("There is no Customer idexisting in the Table");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	public static void main(String[] args) {
		CustomerAccount ac= new CustomerAccount();
		if(ac.login() == true) 
		{
			
		
	{
		char option ='\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("********************Welcome****************");
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Exit");
		
		do
		{
			System.out.println("================================================================================================");
			System.out.println("Enter an option:");
			System.out.println("================================================================================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':ac.checkBalance();
				break;
				
			case 'B':ac.deposit();
				break;
				
			case 'C':ac.withdraw();
				break;	
			case 'D':
				System.out.println("***********************************************************");
				break;
				
			default:
				System.out.println("Invalid Option!!.Please Enter again...");
				break;
					
				
			}
		}while(option !='D');
		
		System.out.println("ThakYou for using our services.........");
	}
	}

}
}
