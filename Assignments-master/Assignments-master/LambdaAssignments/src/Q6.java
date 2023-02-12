
import java.util.ArrayList;
import java.util.function.UnaryOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Q6 { 

	public static void main(String[] args) {
		 
		List<String> str = Arrays.asList("Nikhil", "Arjun","Piyush");
		
		UnaryOperator<String> unaryOperator = (list) -> list.toUpperCase();
		
		str.replaceAll(l -> unaryOperator.apply(l));
		
		 System.out.println(str);
	}

}
