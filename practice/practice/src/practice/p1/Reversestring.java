package practice.p1;

public class Reversestring{
public static void main(String[] args){
String s="From pain to peak performance.peak pain pain";
System.out.println(s);

for(int i=s.length();i>0;--i){
System.out.print(s.charAt(i-1));
}
}
}