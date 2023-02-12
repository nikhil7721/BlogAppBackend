package SpringRest.SpringRest_Q3;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
	
	Infor Detail;
	
	public List<Infor> GetList() {
		
		List<Infor> list = new ArrayList<>();
		
		list.add( new Infor("karnataka","Bangalore","India","560001"));
		list.add( new Infor("AndhraPradesh","Ananthapur","India","560002"));
		list.add( new Infor("Telangana","Hyderabad","India","560003"));
		list.add( new Infor("Tamil Nadu","Madurai","India","560004"));
		list.add( new Infor("Kerala","Trivandram","India","560005"));
		System.out.println( list );
		
		return list;	
	}
		
	public Infor displayInformation( String zipcode ) {
		
		List<Infor> list = GetList();
		
		System.out.println( list );
		
		for( int i = 0; i < list.size(); i++ ) {
			
			System.out.println( list.get(i) );
			
			if ( zipcode.equals( list.get(i).getZipcode() )) {
				
				Detail = list.get(i);
				System.out.print( Detail );
			}
		}
		return Detail;
	}

}
