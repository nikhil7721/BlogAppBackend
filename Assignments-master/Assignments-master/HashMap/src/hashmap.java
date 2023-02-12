import java.util.HashMap;
public class hashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Bhushan", 10);
		map.put("Durgesh", 20);
		map.put("Raju", 30);
		map.put("Shubham", 40);
		map.put("Sathe", 50);
		map.put("Pranav", 60);
		map.put("Nikhil", 70);
		map.put("Manoj", 80);
		map.put("Gaurav", 90);
		map.put("Maharastra", 100);
		
		System.out.println("Size of map is:-" + map.size());
		
		System.out.println(map);
		
		if (map.containsKey("Maharastra")) {
			
		    Integer a = map.get("Maharastra");
		    System.out.println("Value for key" + " \"Maharastra\" is:- " + a);
		}
	}

}
