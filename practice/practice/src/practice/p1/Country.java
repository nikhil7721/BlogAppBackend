package practice.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Country {
	
	public static void main(String[] args) {
		
		List<String>contries= Arrays.asList("India","China","America","England","French","Nepal");
		System.out.println(contries);
        Collections.sort(contries);
		System.out.println(contries);
	      List<String>SearchContries=contries.stream().filter(str->str.length()>5).collect(Collectors.toList());
	       System.out.println(SearchContries);
	       SearchContries.forEach(str->System.out.println(str+" "));
	       for(String element:SearchContries) {
	    	   System.out.println(element);
	       }
	      if(contries.contains("Am")) {
	    	   System.out.println("ElementFound");
	       }else {
	    	   System.out.println("Element not Found");
	       }
	       List<String>newCountries=new ArrayList<>();
	       for(int i=0;i<contries.size();i++) {
	    	   newCountries.add(i,contries.get(i));;
	       }
	      System.out.println(newCountries);
         System.out.println(contries.get(2));
         contries.set(2,"Nikhil");
         
         List numbers=new ArrayList<>();
         numbers.add("Nikhil");
         numbers.add(5);
         numbers.add(78);
         numbers.add(77.67);
         numbers.add("nikh");
         
         numbers.add(0,77);
         numbers.set(0,22);
         numbers.remove(2);
         
         System.out.println(numbers);
        System.out.println( numbers.get(3));
        
        List Nikhil=new ArrayList<>();
        for(int i=0;i<numbers.size();i++) {
	    	   Nikhil.add(i,numbers.get(i));;
	       }
        Collections.shuffle(Nikhil);
        System.out.println(Nikhil);
        
	}
	}
