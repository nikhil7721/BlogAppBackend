package practice.p1;

import java.util.ArrayList;

public class Findword{
public static void main(String[] args){
String s="From pain to peak parformane.chin support foe extra stability from pain from";
String word="";
int count=0,maxcount=0;
ArrayList<String>words=new ArrayList<String>();
int length=0;
s=s+" ";

for(int i=0;i<s.length();i++) {
   if(s.charAt(i)!=' ') {
	   word=word+s.charAt(i);
   }else {
	   words.add(word);
	   length++;
	   word="";
	
	
//while(s!=null){
//String string[]=s.toLowerCase().split("([,.\\s]+) ");

//for(String n:string){
//    words.add(n);
}
}
for(int i=0;i<words.size();i++){
  count++;
  for(int j=i+1;j<words.size();j++){
   if(words.get(i).equals(words.get(j))){
     count++;
   }
}
if(count>maxcount){
 maxcount=count;
  word=words.get(i);
}
}
System.out.println("most repeated word  = " + word);
}
}

