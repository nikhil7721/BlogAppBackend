
public class ArithmeticOperation {

	public static void main(String[] args) {
		
		Arithmetic addition = (int n1, int n2) -> n1 + n2;
		Arithmetic subtraction = (int n1, int n2) -> n1 - n2;
		Arithmetic multiplication = (int n1, int n2) -> n1 * n2;
		Arithmetic division = (int n1, int n2) -> n1 / n2;
		
		System.out.println("Addition of 12 and 6: " + addition.operation(10,5));
		System.out.println("Subtraction of 12 and 6: " + subtraction.operation(12,6));
        System.out.println("Multiplication of 12 and 6: " + multiplication.operation(12,6));
        System.out.println("Division of 12 and 6: " + division.operation(12,6));
        
	}
	
	@FunctionalInterface
	interface Arithmetic {
		int operation(int n1, int n2);
	}

}
