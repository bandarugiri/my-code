package abc_bank;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class User_login {

	public void dashBoard(int i) throws ClassNotFoundException, SQLException {
		System.out.println("option 1 for login account: ");
		System.out.println("Already have an account: ");
		Scanner sc=new Scanner(System.in);
		int input =sc.nextInt();
		if((input<=0||input >=2)&& i<2) {
			System.out.println("invalid entrys ");
			dashBoard(++i);
		}
		else if(i==3) {
			System.out.println("Maximum wrong entrys done");
			System.exit(1);
		}if(input == 1) {
			createAccount(1);
		}	
	}


	private void createAccount(int i) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer ID: ");
		int ID=sc.nextInt();
		System.out.println("Please Enter your first name: ");
		String name =sc.next();
		System.out.println("Enter the Last name: ");
		String name1=sc.next();
		System.out.println("enter your email ID :");
		String emailID = sc.next();
		System.out.println("Please enter your phone number");
		long number = sc.nextLong();
		System.out.println("Enter Customer Address: ");
		String address=sc.next();
		
//		System.out.println("Enter 12 digit Aadhar Number :");
//		long aadhar=sc.nextLong();
//		int custID = (int)(Math.random()*100000000);
//		System.out.println();


		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/abcbank","root","Prasad@123");
		PreparedStatement PS = con.prepareStatement("insert into customer_details values(?,?,?,?,?,?)");
		PS.setInt(1, ID);
		PS.setString(2,name);
		PS.setString(3,name1);
		PS.setString(4, emailID);
		PS.setLong(5,number);
		PS.setString(6, address);
		
//		PS.setLong(4,aadhar);
//		PS.setInt(5, custID);
		boolean validate = PS.execute();
		if(validate){
			System.out.println("values  not  inserted.. ");

		}
		else {
			System.out.println("values insertd.. ");
		}

	}
}
