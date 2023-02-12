package practice.p1;

public class exa4 {

	public static void main(String[] args) {
		
		int sum=0 ;
		int [] numbers=new int[9];
		numbers[0]=23;
		numbers[1]=47;
		numbers[2]=8;
		numbers[3]=74;
		numbers[4]=35;
		numbers[5]=22;
		numbers[6]=14;
		numbers[7]=93;
		numbers[8]=29;
		
		for(int i=0; i <numbers.length;i++)
			sum=sum+numbers[i];
		
		double average=sum/numbers.length;
		System.out.println("Average value of the array :" + average);
		
	}

}
