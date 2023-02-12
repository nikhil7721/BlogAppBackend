package practice.p1;

import java.util.Iterator;
import java.util.LinkedList;

public class Exa34 {
	public static void main(String[] args) {
		LinkedList<String>arr=new LinkedList<String>();
		arr.add("red");
		arr.add("blue");
		arr.add("yellow");
		arr.add("green");
		
		Iterator<String> ob=arr.iterator();
		while(ob.hasNext()) {
			System.out.println(ob.next());
		}
	}

}
