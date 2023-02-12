package practice.p1;

public class Pattern8{
public static void main(String[] args){
int i,j,lines=6;
for(i=lines;i>0;i--){
for(j=0;j<lines-i;j++){
System.out.print(" ");
}
for(int k=0;k<(2*i-1);k++){
System.out.print("*");
}
System.out.println("");
}
}
}