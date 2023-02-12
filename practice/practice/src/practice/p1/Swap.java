package practice.p1;

public class Swap{
	public static void main(String[] args) {
		
		int a=5;
		int b=3;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+ a);
		System.out.println("b="+ b);
		
	}
}