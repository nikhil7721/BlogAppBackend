package generics;

public class Algorithm {
	
	public static void main(String[] args) {
		Integer arr[] = {333,666};
		
		System.out.println("Before swap position :"+ arr[0]+ " "+arr[1]);
		swapnum(arr);
		
}

	private static<S> void swapnum(S[] arr) {
		
		S temp = arr[1];
		arr[1]= arr[0];
		arr[0]= temp;
		System.out.println("After swap position:"+ arr[0]+ " "+arr[1]);
		
		
	}
 
		
	}
	
