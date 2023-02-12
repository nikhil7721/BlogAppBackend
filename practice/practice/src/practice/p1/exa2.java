package practice.p1;

public class exa2 {

	public static void main(String[] args) {
		
		int sum=0;
		int my_array[]=new int[5];
		my_array[0]=2;
		my_array[1]=5;
		my_array[2]=11;
		my_array[3]=43;
		my_array[4]=8;
		
		for(int i:my_array)
			sum=sum+i;
		System.out.println("the sum is : "+ sum);
		
		
	}

}
