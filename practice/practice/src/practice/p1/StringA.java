package practice.p1;

public class StringA {
	public static void main(String[] args) {
	String A=new String("Hello");
	String B=new String("Hello");
	String C="Hello";
    System.out.println(A==B);
    System.out.println(A.equals(B));
    System.out.println(A==C);
    System.out.println(A.equals(C));
}
}
