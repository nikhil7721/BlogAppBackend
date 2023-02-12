package practice.p1;


import java.util.List;

public class FunctionalPrograming {
	public static void main(String[] args) {
		List<Integer> numbers=List.of(1,2,3,4,5,6);
		numbers
		.stream()
		.filter(a->a%2==0)
		.forEach(a->System.out.println(a));
		
		
	}

}
