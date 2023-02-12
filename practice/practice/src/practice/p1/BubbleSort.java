package practice.p1;

public class BubbleSort{
public static void bubbleSort(int arr[]){
int temp=0;

for(int i=0;i<arr.length;i++){
  for(int j=1;j<arr.length;j++){
               if(arr[j]<arr[j-1]){
                 temp=arr[j-1];
                  arr[j-1]=arr[j];
                   arr[j]=temp;}
}
}
}
 
public static void main(String[] args){
         
int arr1[]={2,5,46,5,4,532,12,67,54,321,3};

bubbleSort(arr1);
System.out.println("Array after sorting");
for(int i=0;i<arr1.length;i++){
System.out.print(arr1[i]+",");
}
}
}