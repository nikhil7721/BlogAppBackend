package practice.p1;

import java.util.Scanner;

//public class Fibonacci {
//
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int number=scanner.nextInt();
		public class Fibonacci{
			public static void main(String[] args){
			int a=0,b=1,c;
			int n=9;

			System.out.print(a+","+b);

			for(int i=2;i<n;++i){
			  c=a+b;
			  System.out.print(","+c);
			  a=b;
			  b=c;
			}
}
}