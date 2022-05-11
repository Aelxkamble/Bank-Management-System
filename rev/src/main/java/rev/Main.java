package rev;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int ch;
		
		
		do {
			System.out.println("*****************WELCOME TO REVATURE BANK****************");
			System.out.println("1. Create New Account");
			System.out.println("2. Customer Login");
			System.out.println("3. Employee Login");
			System.out.println("================================================================================================");
			System.out.println("Enter an option:");
			System.out.println("================================================================================================");
			int option = scanner.nextInt();
			System.out.println("\n");
			
			switch(option) {
			case 1:NewAccount na= new NewAccount();
					na.main(args);
				break;
				
			case 2:CustomerAccount ca=new CustomerAccount();
					ca.main(args);
				break;
			case 3:Employee_Account Emp=new Employee_Account();
					Emp.main(args);
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
