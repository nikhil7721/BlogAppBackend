package practice.p1;

public class exa30 {
	int no;
 static void printTriangle(int no) {
	  for (int i=1;i<=5;i++) {
		  for(int j=1;j<=i;j++) {
			  System.out.print(j+ " ");
		  }
		  System.out.println();
	  }
	  
    }
   public static void main(String[] args) {
	   exa30.printTriangle(5);
	
}
}
