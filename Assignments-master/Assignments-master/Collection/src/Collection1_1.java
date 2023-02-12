
import java.util.*;


public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Long,Contact> tree=new TreeMap<>();
		tree.put(1L,(new Contact("----NAME----","-------E-MAIL Address-----","----GENDER----")));
		tree.put(9140551008L,(new Contact("Himanshu","  patilhimanshu@gmail.com","   Male")));
		tree.put(6519091008L,(new Contact("Nikhil","   patilnkikhil@gmail.com","   Male")));
		tree.put(9623871008L,(new Contact("Bhushan","  bachhavbhushan@gmail.com","   Male")));
		tree.put(7640551008L,(new Contact("Durgesh","  patildurgesh@gmail.com","   Male")));
		tree.put(5340551008L,(new Contact("Raju","  patilraju@gmail.com","   Male")));
		System.out.println(tree);
		Set<Map.Entry<Long,Contact>> entrySet=tree.entrySet();
		System.out.println(entrySet);
		//Map.Entry<Long, Contact>[] entryArray=entrySet.toArray(new Map.Entry[entrySet.size()]);
		System.out.println("Key of Tree Map are :\n");
		for(Map.Entry<Long, Contact> entryArray:entrySet) {
			System.out.println(entryArray.getKey());
		}
		System.out.println("Values of Tree Map are :\n");
		for(Map.Entry<Long, Contact> entryArray:entrySet) {
			System.out.println(entryArray.getValue());
		}

	}

}
