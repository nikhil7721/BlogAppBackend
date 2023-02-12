package Java.until;

import java.util.Scanner;

public class marks {
	public static void main(String args[]) {
		double p,c,m;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter Chemistry marks :");
		p=sc.nextDouble();
		System.out.println("enter Biology70 marks :");
		c=sc.nextDouble();
		System.out.println("enter Maths marks :");
		m=sc.nextDouble();
		if(p>=60.00&&c>=60.00&&m>=60.00)
			System.out.println("RESULT : Passed");
		else
			if(p>=60.00&&c>=60.00&&m<60||p<60&&c>=60&&m>=60||p>=60&&c<60&&m>=60)
				System.out.println("RESULT : Promoted");
			else
				if(p>=60||c>=60||m>=60&&p<60||m<60||c<60)
					System.out.println("Failed");
	}
}

