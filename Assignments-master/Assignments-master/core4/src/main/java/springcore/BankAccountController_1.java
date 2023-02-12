package springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
//@Configuration
@Controller
public class BankAccountController implements ApplicationContextAware, BeanNameAware{

	ApplicationContext context;
	String bean;
	BankAccount obj;
	

	
	public void withdraw(long accountld, double balance) {
		
		 obj.accountBalance -= balance;
		
	}
	
	public void deposit(long accountld, double balance) {
		
		 obj.accountBalance += balance;
		
	}
	public long getBalance(long accountld) {
		return obj.accountBalance;
	}
//	public boolean fundTransfer(long fromAccount, long toAccount, double amont);
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		 
		this.context = applicationContext;
		obj =(BankAccount) applicationContext.getBean("Account");
	}
	
	public void setBeanName(String name) {
	// TODO Auto-generated method stub
	this.bean = name;
}
}
