package spring8;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Shape implements InitializingBean, DisposableBean {

	public void draw() {
		System.out.println("Drawing a circle");
		
	}
	
	public void destroy() throws Exception {
		System.out.println("This is Destroy");
		
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is Initializing method");		
	}

}
