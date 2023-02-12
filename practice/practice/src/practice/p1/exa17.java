package practice.p1;

public class exa17 {
	public static void main(String[] args) {
		
		int array1[]= {1,3,4,55,48,37,37,92};
		int sum=0;
		
		for(int i:array1)
			
		sum=sum +i;
		double average=sum/array1.length;
		System.out.println("sum of elements="+ sum);
		System.out.println("average of number="+ average);
	}

}
