package practice.p1;

class Teacher{
String name;
Teacher(){
       System.out.println("In Teacher class");
    }
}
class Student3 extends Teacher{
       Student3(){
       System.out.println("In Student class");
    }
int id;
public static void main(String a[]){
Student3 ob=new Student3(); //Line 1
ob.name="abcde"; //Line 2
ob.id=12345;}
}