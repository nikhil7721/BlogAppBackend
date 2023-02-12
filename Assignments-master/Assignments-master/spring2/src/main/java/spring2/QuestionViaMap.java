package spring2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionViaMap {
	
	private int questionId;
	private String question;
	private Map<String,String> answers;
	public QuestionViaMap(int questionId, String question, Map<String,String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
		
	
	}
	
	public void displayInfo() {
		System.out.println("This is done via MAP and Injected via Constructor");
		System.out.println(questionId+" "+question);  
	    System.out.println("answers are:");  
	    Set<Entry<String, String>> set=answers.entrySet();  
	    Iterator<Entry<String,String>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	    

	}

}
