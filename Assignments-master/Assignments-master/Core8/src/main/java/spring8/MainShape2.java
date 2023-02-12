package spring8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainShape2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("shape2.xml");
		context.registerShutdownHook();
		Shape obj=(Shape) context.getBean("Shape2");
		obj.draw();
		

	}
