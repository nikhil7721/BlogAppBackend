package practice.p1;

import java.util.Arrays;

//Write a Java program to insert an element (specific position) into an array.
public class exa9 {

	public static void main(String[] args) {
		
		int my_array[]= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        
		int Index_Position=2;
		int newValue=38;
		
		System.out.println("original array"+ Arrays.toString(my_array));
		
		for(int i=my_array.length-1;i>Index_Position;i--) {
			my_array[i]=my_array[i-1];
		}
		my_array[Index_Position]=newValue;
		System.out.println("new Array"+Arrays.toString(my_array));		
		
	}

}
