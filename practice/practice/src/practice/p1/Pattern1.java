package practice.p1;

public class Pattern1{
public static void main(String[] args){
int i,j,lines=4;

for(i=1;i<=lines;i++){
for(j=1;j<=lines;j++){
if(i==j){
System.out.print("*");
}else{
System.out.print("0");
}
}
j--;
System.out.print("*");
while(j>=1){
if(i==j){
System.out.print("*");
}else{
System.out.print("0");
}
j--;
}
System.out.println(" ");
}
}
}
