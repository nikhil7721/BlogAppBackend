package practice.p1;

class Loan{
Loan(){
System.out.println("Inside loan");
}
}
class HomeLoan extends Loan{
    HomeLoan(){
      super();
    }
public static void main(String args[]){
HomeLoan homeLoan=new HomeLoan();
}
}