package practice.p1;

public class Linear{
public static int LinearSearch(int arr[],int key){
  for(int i=0;i<arr.length;i++){
             if(arr[i]==key){
             return i;
             }
             }
         return -1;
         
}
public static void main(String[] args){
int a1[]={2,20,30,1,3,3,44,55,56};
int key=30;
int k=LinearSearch(a1, key);
if(k==-1) {
	System.out.println("elemnt not found");
}else
System.out.println(key+"is found at index: "+LinearSearch(a1,key));
}
}