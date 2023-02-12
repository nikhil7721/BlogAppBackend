package practice.p1;

public class Pattern6{
public static void main(String[] args){
int i,j,lines=10;

for(i=1;i<=lines;i++){
for(j=1;j<=lines;j++){
if(i==1){
System.out.print("1");
}else if(j==1){
System.out.print("1");
}else if(i==lines||j==lines){
System.out.print("1");
}else{
System.out.print(" ");
}
}
System.out.println(" ");
}
}
}