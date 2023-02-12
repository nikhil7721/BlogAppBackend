package practice.p1;

public class exa24 {
	static void printTable(int A) {
		for(int i=1;i<=10;i++) {
			System.out.printf("%d*%d=%d",A,i,A*i).println();;
		}	
	}
    public static void main(String[] args) {
		printTable(5);
	}
}
