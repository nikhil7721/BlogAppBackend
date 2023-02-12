package practice.p1;

public class exa19 {
   static void bubbleSort(int a[]) {
		int len=a.length;
		for(int i=0;i<len-1;i++)
			for(int j=0;j<len-i-1;j++)
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
	}
	
	static void printArray(int a[])
	{
		int len=a.length;
		for(int i=0;i<len;i++)
			System.out.println(a[i] + " ");
		
		System.out.println();
		
	}
	
	public static void main(String args[])
	{
		int arr[]= {64,34,2626,87,8,727,90};
		
		bubbleSort(arr);
		System.out.println("sorted array");
		
		printArray(arr);
	}

}
