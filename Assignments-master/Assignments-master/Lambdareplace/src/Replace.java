import java.util.ArrayList;
import java.util.function.UnaryOperator;
class Op implements UnaryOperator<String> {
   public String apply(String str) {
      return str.toUpperCase();
   }
}
public class Replace {
   public static void main(String[] args) throws CloneNotSupportedException {
      ArrayList<String> list = new ArrayList<>();
      list.add("Redmi");
      list.add("Oppo");
      list.add("Vivo");
      list.add("Oneplus");
      list.add("Samsung");
      System.out.println("Contents of the list: "+list);
      list.replaceAll(new Op());
      System.out.println("Contents of the list after replace operation: \n"+list);
   }
}   
