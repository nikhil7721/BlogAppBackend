package practice.p1;

import java.util.Scanner;

public class Sumofdigits {
	public static void main(String[] args) {
		
		
		System.out.println("Enter the number");
		Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		System.out.println("The sum of the digits is: " + sumDigits(number));
		
	}
	
	public static int sumDigits(int number) {
		 int sum=0;
		
		while(number!=0) {
		
		sum+=number%10;
		number/=10;
		}
		return sum;
		
	}
	

}
