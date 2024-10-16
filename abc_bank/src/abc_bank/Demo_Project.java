package abc_bank;

import java.sql.SQLException;
import java.util.Scanner;

	

public class Demo_Project {
	
	
	static {
		System.out.println("welcome to abc bank");
		try {
			Validation(0);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		
	}
	public static void Validation(int i) throws ClassNotFoundException, SQLException {
 		Scanner sc=new Scanner(System.in);
		System.out.println("Select option 1 for user login: ");
		
		System.out.println("Select option 2 for manager login: ");
		int input = sc.nextInt();
		if((input<=0||input>=3 )&& i<=2) {
			System.out.println("invalid entry");
			Validation(++i);
			
			
		}
		else if(i==3) {
			System.out.println("Maximum wrong entry thank u");
			
		}
		else if(input ==1) {
			User_login ul = new User_login();
			ul.dashBoard(i);
		}
		else {
			System.out.println("login into the manager Account1");
		}
		 	}

}
