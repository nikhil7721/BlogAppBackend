package practice.p1;

public class exa28 {
	 boolean myNumber(int no) {
		for(int i=2;i<no;i++) {
			if(no%2==0) {
				System.out.println(false);
				return false;
			}
		}
		System.out.println(true);
		return true;
	}

	public static void main(String[] args) {
		exa28 exa28=new exa28();
		exa28.myNumber(6);
		

	}

}
