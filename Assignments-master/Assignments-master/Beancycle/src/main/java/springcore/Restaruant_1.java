package springcore;

public class Restaruant {

	public void greetCustomer() {
		
		System.out.println("Welcome dear customer!! This is Life Cycle");

	}
	
	public void init() {
		System.out.println("Restaruant is Going through in");
	}
	
	public void destroy() {
		System.out.println("Bean will destroy now");
	}

}
