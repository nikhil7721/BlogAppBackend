package Bank_testing;

public class BankAccount {

	long loginID= 7896;
	double balance =3000;
	
	public void showInfo() {
		System.out.println("LoginId : " + loginID + "\n" + "Balance : " + balance);
	}
	
	public void withDraw(double amount) throws InSufficientBalanceException{
		if( balance < amount || balance==0) {
			throw new InSufficientBalanceException();
		}else {
			balance -= amount;
			System.out.println("Your money:" + amount);
		}
	}
	
}
