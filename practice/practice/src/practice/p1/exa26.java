package practice.p1;

import java.util.Scanner;

public class exa26 {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number");
		int no1=scanner.nextInt();
		System.out.println("Enter second number");
		int no2=scanner.nextInt();
		
		System.out.println("operation available are");
		System.out.println("1-Addition");
		System.out.println("2-Substraction");
		System.out.println("3-multiplication");
		System.out.println("4-Division");
		
		System.out.println("Enter operation no");
		int choice=scanner.nextInt();
		
		switch(choice){
			case 1:System.out.println("addition = " + no1+no2);
			break;
		    case 2:System.out.println("substraction = " + (no1-no2));
		    break;
			case 3:System.out.println("addition = "+ no1*no2);
			break;
			case 4:System.out.println("Division = " + (float)no1/no2);
			break;
			default:System.out.println("invalid operation");
		}
				
	}

}
