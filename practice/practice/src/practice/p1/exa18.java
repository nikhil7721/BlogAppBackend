package practice.p1;

import java.util.Arrays;

public class exa18 {
	
	static void uniquearray(int[] my_array)
	{
		System.out.println("original array:");
		
		for (int i=0;i< my_array.length;i++) 
		{
			System.out.println(my_array[i]+"\t");
		}
		
		int uniqueElements=my_array.length;
		
		for(int i=0;i<uniqueElements;i++)
		{
			for(int j=i+1;j<uniqueElements;j++) {
				if(my_array[i]==my_array[j]) {
					my_array[j]=my_array[uniqueElements - 1];
					uniqueElements--;
					j--;
				}
			}
		}
		int array1[]=Arrays.copyOf(my_array, uniqueElements);
		//printing arrayWithoutDuplicates
		System.out.println();
		System.out.println("Array with unique values: ");
		
		for(int i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]+"\t");
		}
		System.out.println();
		
		System.out.println("---------------------");
	}
	
	public static void main(String[] args) {
		uniquearray(new int[]{0,3,-2,4,3,2});
		uniquearray(new int[] {10,181,26,16,16,10,20,1,2,3,2});
	}
	

}
