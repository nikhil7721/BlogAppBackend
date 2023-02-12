package practice.p1;

import java.util.Scanner;

public class exa25 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number");
		int number1=scanner.nextInt();
		
		System.out.println("Enter Second number");
		int number2=scanner.nextInt();
		
		System.out.println("operation available are");
		System.out.println("1-Addition");
		System.out.println("2-Substraction");
		System.out.println("3-multiplication");
		System.out.println("4-Division");
		
		System.out.println("Enter operation ");
		int choice=scanner.nextInt();
		
		if(choice==1) {
			
				int sum=number1+number2;
			System.out.println("Addition = "+ sum);
		}
		
		if(choice==2) {
			int sub=number1-number2;
			System.out.println("Substraction = "+sub);
		}
		
		if(choice==3) {
			int mul=number1*number2;
			System.out.println("multiplication = "+mul);
		}
		
		if(choice==4) {
			float div=(float)number1/number2;
			System.out.println("Division = "+ div);
		}
	}

}
