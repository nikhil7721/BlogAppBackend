package spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext
				("applicationContext.xml");
		 QuestionViaList qvl=(QuestionViaList) context.getBean("question");
		 QuestionViaSet qvl1=(QuestionViaSet) context.getBean("question1");
		 QuestionViaMap qvl2=(QuestionViaMap) context.getBean("question2");
		 qvl.displayInfo();
		 qvl1.displayInfo();
		 qvl2.displayInfo();
	}
}	
		

