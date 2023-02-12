package practice.p1;

import java.util.Arrays;

//Write a Java program to copy an array by iterating the array.
public class exa8 {

	public static void main(String[] args) {
	int [] my_array= {12,23,42,6,66,64,5,452,553,33,345,56,4};
    int [] new_array=new int[14];
    
    System.out.println("source Array : " +Arrays.toString(my_array));
    
    for(int i=0; i<my_array.length; i++) {
    	new_array[i]=my_array[i];
    }
	System.out.println("New Array:"+ Arrays.toString(new_array));
	}
	

}
