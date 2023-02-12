package practice.p1;

public class String1{
public static void main(String[] args){
String s="From pain to peak performance";
int count=0;

for(int i=0;i<s.length();i++){
if(s.charAt(i)!=' ')
count++;
}
System.out.println("total no of characters in string  " + count);
}
}