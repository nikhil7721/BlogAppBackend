package practice.p1;

public class exa6 {
	
	public static boolean contains(int[] arr,int item) {
		for(int n:arr) {
			if(item==n) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] my_array1= {
				127,233,3344,4232,323,4645,657,4646,464,6463,335,768,12
		};
		
		System.out.println(contains(my_array1,233));
		System.out.println(contains(my_array1,2014));
	}

}
