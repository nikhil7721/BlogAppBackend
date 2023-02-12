package spring2;

import java.util.Iterator;
import java.util.Set;

public class QuestionViaSet {
	
	private int questionId;
	private String question;
	private Set<String> answers;
	public QuestionViaSet(int questionId, String question, Set<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
		
		
	}
	
	
	public void displayInfo() {
		System.out.println("This is done via SET and Injected via Constructor");
		System.out.println(questionId+" "+question);  
	    System.out.println("answers are:");  
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	    System.out.println("---------------------------------------");

	}

}
