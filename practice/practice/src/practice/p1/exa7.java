package practice.p1;

import java.util.Arrays;

//Write a Java program to remove a specific element from an array.
public class exa7 {

	public static void main(String[] args) {
		int[] my_array= {34,56,4,32,87,89,64,83,26,17,27};
		
		System.out.println("original Array:" + Arrays.toString(my_array));
		
      int removeIndex=1;
      
      for(int i=removeIndex;i<my_array.length - 1;i++) {
    	  my_array[i]=my_array[i + 1];
      }
      System.out.println("After removing the second element" +Arrays.toString(my_array));
	}

}
