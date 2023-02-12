package practice.p1;

public class Frequency{
public static void main(String[] args){

int Array1[]=new int[]{1,2,3,4,3,2,5,6,4,7,6,8,5,3,9,0,5};
int Fr[]=new int[Array1.length];
int visited=-1;

for(int i=0;i<Array1.length;i++){
int count=1;
   for(int j=i+1;j<Array1.length;j++){
         if(Array1[i]==Array1[j]){
       count++;
      Fr[j]=visited;
}
}
if(Fr[i]!=visited)
   Fr[i]=count;
}
System.out.println("------------------");
System.out.println("Element |Frequency");
System.out.println("------------------");

for(int i=0;i<Fr.length;i++){
   if(Fr[i]!=visited)
System.out.println("  "+Array1[i]+"  |   "+Fr[i]);
}
System.out.println("------------------");
}
}
