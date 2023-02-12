package practice.p1;


public class exa20 {
	static int []nums;
	
	public static void main(String[] args) {
		nums=new int[] {3,2,4,5,6,7,8,8,8,6,4,5};
		int flag=0;
		int search=8;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==search)
			{
				System.out.println("number found at index " + i);
			flag=1;
			}		
			
		}
		if(flag==0)
		System.out.println("number not found");
		

	}
	
//	private static void Linear_search(int[]nums,int search)
//	{
//		int flag=0;
//		for(int i=0;i<nums.length;i++)
//		{
//			if(nums[i]==search)
//			{
//				System.out.println("number found at index " + i);
//			flag=1;
//			}		
//			
//		}
//		if(flag==0)
//		System.out.println("number not found");
//	}

}
