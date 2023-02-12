package MinMax;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          MinMaxFinder obj = new MinMaxFinder();
          
         int[] a =  obj.findMinMax(new int[] {1,3,4,5,7});
         
         System.out.println(a[1]);
	}

}