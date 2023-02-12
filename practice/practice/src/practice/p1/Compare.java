package practice.p1;

import java.util.ArrayList;
import java.util.List;

public class Compare{

public static void main(String[] args){
      List<String>n1=new ArrayList<String>();
      n1.add("nikhil");
      n1.add("aadarsh");
      n1.add("shailesh");
      n1.add("kunal");
      System.out.println(n1);
 
      List<String>n2=new ArrayList<String>();
     n2.add("nikhil");
      n2.add("aadarsh");
      n2.add("shailesh");
      n2.add("kunal");
     System.out.println(n2);
   
 List<String>n3=new ArrayList<String>();

for(String a:n1)
   n3.add(n2.contains(a)?"yes":"No");
System.out.println(n3);
}
}