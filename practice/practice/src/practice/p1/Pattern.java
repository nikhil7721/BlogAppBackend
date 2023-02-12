package practice.p1;

public class Pattern{
public static void main (String[] args){

int i,j,lines=5;

for(i=1;i<=lines;i++){
for(j=lines;j>0;j--){
  if (i!=j){
  System.out.print(j);
}else{
System.out.print("*");
}
  }
System.out.println(" ");

}
}
}

