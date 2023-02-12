package springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@Configuration
public class BankAccount {
	
	int accountld; 
	String accountHolderName;
	String accountType;
	long accountBalance;
	 	
	@Autowired
	public BankAccount(int accountld, String accountHolderName, String accountType, long accountBalance) {
		super();
		this.accountld = accountld;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
 
	

}
