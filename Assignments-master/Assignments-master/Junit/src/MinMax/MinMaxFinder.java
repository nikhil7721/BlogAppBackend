package MinMax;

import java.util.Arrays;
import java.util.Iterator;

public class MinMaxFinder {
	 
	public int[] findMinMax(int[] a) {
		//int max=0,min=0;
		int[] arr = new int[2];
		Arrays.sort(a);
		
		arr[0] = a[0];
		arr[1] = a[a.length-1];
		
		return arr;
	}
	

}