package practice.p1;

import java.util.Arrays;

public class Practice1{
public static int[] addElement(int index,int arr[],int no){

int newArray[]=new int[arr.length+1];
for(int i=0;i<arr.length+1;i++){
	if(i<index) {
 newArray[i]=arr[i];
 newArray[index]=no;
 }else if(i==index){
	 newArray[i]=no;
 }else{
	 newArray[i]=arr[i-1];
 }
	}
return newArray;
}
public static void main(String[] args){

int array1[]={10,20,40,50,60};
int index=2;
int no=30;

array1=addElement(index,array1,no);

System.out.println(Arrays.toString(array1));
}
}