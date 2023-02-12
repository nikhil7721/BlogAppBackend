package Assignment4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class assignment4 {
	
public static void main(String[] args) throws IOException {
		
		var path = "C:\\Users\\ANILYSIN\\eclipse-workspace\\Java11\\src\\assignment4\\StudentList.txt";
		
		 List<String> str = Files.readAllLines(Path.of(path));
		 
		  long count =   str.stream().filter(l -> !(l.isBlank())).count();
		 System.out.println(str.stream().filter(l -> !(l.isBlank())).
				 map(l-> l.strip()).collect(Collectors.toList()) + 
				 "\nThere are " +count + " Students");
		 
	}


}
