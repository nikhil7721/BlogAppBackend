package practice.p1;

class A{
	void display() {
		System.out.println("Hello A");
	}
}
public class B extends A{
	void display() {
		System.out.println("Hello B");
	}
  public static void main(String[] args) {
	B b1= (B) new A();
	b1.display();
}
}