package practice.p1;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar=new MyChar('a');
		System.out.println(myChar.isVoWel('d'));
		System.out.println(myChar.isNumber('3'));
		System.out.println(myChar.isAlphabet('3'));
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
		
		

	}

}
