package atm.Machine.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Atm_Operations implements ATM_Interface{
	ATM atm= new ATM();
	Map<Double,String> ministmt=new HashMap<>();
	public void view_Balance() {
		System.out.println("Available Balance: " + atm.getBalance());

	}

	@Override
	public void withdraw_Amount(double withdraw_Amount) {
		if(withdraw_Amount%500==0) {
			if(withdraw_Amount <=atm.getBalance()) {
				System.out.println("collect the cash" + withdraw_Amount);
				atm.setBalance(atm.getBalance()-withdraw_Amount);
				ministmt.put(withdraw_Amount," Amount withdraw");
				view_Balance();
			}
			else
			{
				System.out.println("insufficient Balance");
				
			}

		}
		else {
			System.out.println("enter the amount in terms of 500");
		}

	}
	@Override
	public void deposit_Amount(double deposite_Amount) {
		System.out.println("Deposited amount is : " + deposite_Amount);	
		atm.setBalance(atm.getBalance()+deposite_Amount);
		ministmt.put(deposite_Amount,"Deposited successfully");
		view_Balance();
	}

	@Override
	public void view_Ministatement() {
		Set<Double> set=ministmt.keySet();
		for(Double d:set) {
			System.out.println(d+"="+ministmt.get(d));
		}
	}

}
