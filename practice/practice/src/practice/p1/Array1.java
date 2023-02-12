package practice.p1;

public class Array1 {
	public static void main(String[] args) {
		int array1[]=new int[] { 1,2 ,3 ,4,5, 6};
		
		int array2[]=new int[array1.length];
		
		for(int i=0;i<array1.length;i++) {
			array2[i]=array1[i];
		}

		System.out.println("element of original array");
		for(int i=0;i<array1.length;i++) {
			System.out.println(array1[i] + " ");
		}
		
		System.out.println("elements of duplicate array");
		for(int i=0;i<array2.length;i++){
			System.out.println(array2[i] + " ");
		}
}
}
