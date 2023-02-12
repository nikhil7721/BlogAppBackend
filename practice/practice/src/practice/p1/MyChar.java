package practice.p1;

public class MyChar {
	
	private char ch;
	
	public MyChar(char ch){
		this.ch=ch;
	
	}

	public boolean isVoWel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		return true;
			
		return false;
	}

	public boolean isNumber(char ch) {
		if(ch>=47 && ch<=57)
			return true;
			
		return false;
	}

	public boolean isAlphabet(char ch) {
		if(ch>=97 && ch<=122)
			return true;
		
		if(ch>=65 && ch<=90)
			return true;
		
		return false;
	}

	public static void printLowerCaseAlphabets() {
		for(char i=97;i<=122;i++) {
		System.out.printf(i +" ");}
		System.out.println();
	}

	public static void printUpperCaseAlphabets() {
		for(char i=65;i<=90;i++)
			System.out.printf(i +" ");
		}
		
	}


