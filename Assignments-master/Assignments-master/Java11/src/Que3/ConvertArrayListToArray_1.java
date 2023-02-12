package Que3;

import java.util.ArrayList;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("quick");
		al.add("brown");
		al.add("fox");
		al.add("jumps");
		al.add("over");
		al.add("the");
		al.add("lazy");
		al.add("dog");
		
		//String arr[]= new String [al.size()];
		
		//for (int i=0;i<al.size();i++) {
		//	arr[i]=al.get(i);
			
		//}
		String arr[]=al.toArray(new String[al.size()]);
		for (String j:arr) {
			System.out.println(j);
		}

	}
}	
