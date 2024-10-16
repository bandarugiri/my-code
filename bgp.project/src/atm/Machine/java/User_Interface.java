package atm.Machine.java;

import java.util.Scanner;

public class User_Interface {

	private static final int status = 0;

	public static void main(String[] args) {
		Atm_Operations oper=new Atm_Operations();
		Scanner sc= new Scanner(System.in);
		int atm_number = 360476;
		int atm_pin =4272;
		System.out.println("WELCOME TO ATM");
		System.out.print("ENTER THE ATM NUMBER: ");
		int atm_number2=sc.nextInt();
		System.out.print("ENTER THE ATM PIN: ");
		int atm_pin2=sc.nextInt();
		while(true) 
		{
			if(atm_number==atm_number2 && atm_pin==atm_pin2) {	
				System.out.println(" 1.VIEW BALANCE \n 2.WITHDRAW AMOUNT \n 3.DEPOSIT  AMOUNT  \n 4.VIEW MINI \n 5 EXIT");
				System.out.println("Enter the choice");
				int ch = sc.nextInt();
				if(ch==1) {
					oper.view_Balance();	
				}else if(ch==2) {
					System.out.println("enter the withdrawal amount:");
					double withdraw_Amount=sc.nextInt();
					oper.withdraw_Amount(withdraw_Amount);
				}
				else if(ch==3) {
					System.out.println("Enter the Amunt to deposite ");
					double depositeAmount=sc.nextDouble();
					oper.deposit_Amount(depositeAmount);

				}
				else if(ch==4) {
					oper.view_Ministatement();

				}else if(ch==5) {
					System.out.println("Collect your ATM CARD \n tHANK YOU");
					System.exit(status);
				}

			
		}
		else {
			System.out.println("ENTERED ATM PIN OR NUMBER IS INVALID");
		}

	}

	}
}
