package practice.p1;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		int flag=0;
		System.out.println("Enter the last number of range");
		Scanner scanner=new Scanner(System.in);
        int Number=scanner.nextInt();
        if(Number==0 || Number==1) {
        	System.out.println("Number is prime");
        }
        else {
        for (int i=2;i<Number;i++) {
        	if(Number % i==0) {
        		System.out.println("Number is not prime");
        		flag=1;
        		break;
        	}
        		
        	}
       if(flag==0) System.out.println("Number is Prime");
        }
        	
        }
        
	}


