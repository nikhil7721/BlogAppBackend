package practice.p1;

import java.util.Scanner;

//public class Palindrome {
//
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Enter number to be reverse");
//		int no=scanner.nextInt();
//	    int rev=0;
//		while(no>0) {
//			int rem=no%10;
//			rev=rev+rem;
//			no=no/10;
//		}
//      System.out.println(rev);
//	}
//	 
//}
public class Palindrome{
public static void main(String[] args){
  int no=323,temp,rev=0,rem;
temp=no;
while(no>0){
rem=no%10;
rev=(rev*10)+rem;
no=no/10;
}
if(rev==temp){
System.out.println("no is palindrome");
}else{
System.out.println("no is not palindrome");
}
}
}