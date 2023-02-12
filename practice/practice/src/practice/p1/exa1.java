package practice.p1;

import java.util.Arrays;

public class exa1 {

	public static void main(String[] args) {
		
		int numbers[]=new int[4];
		numbers[0]=10;
		numbers[1]=6;
		numbers[2]=70;
		numbers[3]=45;
		
		String[] myarray2=new String[4];
		myarray2[0]="java";
		myarray2[1]="python";
		myarray2[2]="c++";
		myarray2[3]="sap";
		
		System.out.println("original numeric arrays" + Arrays.toString(numbers));
		Arrays.sort(numbers);
	    System.out.println("sorted numeric array" +Arrays.toString(numbers));
	    
	    System.out.println("original string arrays" + Arrays.toString(myarray2));
	    Arrays.sort(myarray2);
	    System.out.println("sorted string arrays"+ Arrays.toString(myarray2));
	}
}
