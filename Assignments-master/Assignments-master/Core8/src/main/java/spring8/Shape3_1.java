package spring8;

import q9.PostConstruct;
import q9.PreDestroy;

public class Shape3 {

	public void draw() {
		System.out.println("Drawing a circle");
		
	}
	
	
	public void myInit() {
		System.out.println("My init method called for Shape");
	}
	
	public void cleanup() {
		System.out.println("My cleanup method called for Shape");
	}

}
