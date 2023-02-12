package spring8;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainShape3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("shape3.xml");
		context.registerShutdownHook();
		Shape obj=(Shape) context.getBean("Shape3");
		obj.draw();
		;

	}

}
