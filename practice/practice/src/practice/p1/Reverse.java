package practice.p1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no to be reverse");
		int no=scanner.nextInt();
		int rev=0;
		
		while(no>0){
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
			System.out.println("reverse no is = "+rev);

	}

}
