package practice.p1;

import java.util.Arrays;

public class Bubble{

void Bubblesort(int nums[]){
   int n=nums.length;
for(int i=0;i<n-1;i++) 
  for(int j=0;j<n-i-1;j++)
     if(nums[j]>nums[j+1]){
int temp=nums[j];
nums[j]=nums[j+1];
nums[j+1]=temp;
}
}
public static void main(String[] args){
Bubble ob=new Bubble();
int nums[]={-2,5,55,3,-5,89,31,23};
System.out.println("Original array"+ Arrays.toString(nums));
ob.Bubblesort(nums);
System.out.println("sorted array"+Arrays.toString(nums));
}
}
