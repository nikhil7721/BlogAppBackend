package spring3;

public class BankAccount {

	int accountld; 
	String accountHolderName;
	String accountType;
	long accountBalance;
	
	public BankAccount(int accountld, String accountHolderName, String accountType, long accountBalance) {
		super();
		this.accountld = accountld;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	
	
	
}
