
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q3 {


	

		public static void main(String[] args) {
			 
			String[] str = {"Himanshu", "Patil","Dhule"};
			
			
			Supplier<String> supplier = ()-> Arrays.toString(str) ;        //A Supplier interface has only one single method called get().
			System.out.println(supplier.get());                            //It does not accept any arguments and returns an object of any data type.

			Consumer<String[]> consumer = (string) -> System.out.println(Arrays.toString(string));         //The Consumer interface has only one single method called accept(). 
			consumer.accept(str);                                                                        //It accepts a single argument of any data type and does not return any result.

			Predicate<String[]> predicate = (string) -> Arrays.toString(string).contains("Nikhil");     //The Predicate interface has only one single method test().
			System.out.println(predicate.test(str));                                                     //It may be true or false depending on the values of its variables.
		
			Function<String[], String> function = (string) -> Arrays.toString(string);               //The Function interface has only one single method apply().
			System.out.println(function.apply(str));                                                  //It can accept an object of any data type and returns a result of any datatype.
			
		}
		
	
	
}

