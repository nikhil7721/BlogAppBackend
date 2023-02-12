package practice.p1;

import java.util.Scanner;

//public class Armstrong {
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("enter the no to check Armstrong no or not");
//		int no=scanner.nextInt();
//		int sum=0;
//		int rem;
//		
//		while(no>0) {
//			rem=no%10;
//		    sum=sum+(rem*rem*rem);
//		    no=no/10;  
//		}
//		System.out.println(sum);
//		if(no==sum){
//			System.out.println("it is armstrong no");
//		}else {
//			System.out.println("its not a armstrong no");
//		}
//
//	}
//}
public class Armstrong{
public static void main(String[] args){
int no=152,temp,rem,arm=0;
temp=no;

while(no>0){
rem=no%10;
arm=(arm)+(rem*rem*rem);
no=no/10;
}
if(arm==temp){
System.out.println("no is Armstrong no");
}else{
System.out.println("no is not Armstrong no");
}
}}