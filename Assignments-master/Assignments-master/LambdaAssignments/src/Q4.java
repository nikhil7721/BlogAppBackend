
import java.util.ArrayList;
import java.util.List;

public class Q4 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> str = new ArrayList<>();
			
			str.add("Himanshu");
			str.add("patil");
			str.add("Gaurav");
			str.add("Baviskar");
			
			str.removeIf(l -> l.length()%2 !=0);
			
			System.out.println(str);
			
	}
}	



