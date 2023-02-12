
import java.lang.annotation.*;
import java.lang.reflect.*;  
//@Target(ElementType.METHOD)
@Target(ElementType.METHOD)
//@Target(ElementType.LOCAL_VARIABLE)
@Retention(RetentionPolicy.RUNTIME)
@interface info
{
	int ID();
	String name();
	String date();
	String time();
}
class hello
{
	@info(ID=1,name="Himanshu",date="20-08-1998",time="9:30PM")
	
	public void abc()
	{
		System.out.print("manish");
	}
}
public class Anno2  {
   
	
	public static void main(String[] args) throws Exception
	{
	
         hello h=new hello();
         Method m=h.getClass().getMethod("abc");
         info i =m.getAnnotation(info.class);
         System.out.print(i.ID()+" "+i.name()+" "+ i.date()+" "+ i.time());
	}

}