package practice.p1;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		this.name=name;
		this.marks=marks;
	}
		
		public int[] getNoOfMarks(){
			System.out.println(marks.length);
			return marks;
			}
			
	   public int getTotalOfMarks(){
		   int sum=0;
	    	for(int mark : marks) {
	    		sum=sum+mark;	
	    	}
	    	System.out.println(sum);
	    	return sum;	
	      }
	   
	   public int getMaxMark() {
		   int max=marks[0];
		   for(int mark:marks) {
		   if(max<mark) {
			   max=mark;
		   }
	   }
		   System.out.println(max);
	   return max;
	   }
	   
	   public int getMinMark() {
		   int min=marks[0];
		   for(int mark:marks) {
		   if(min>mark) {
			   min=mark;
		   }
	   }
		   System.out.println(min);
	   return min;
	   }
	   
	   public int avarageOfMarks() {
		   int avg=0;
		   int sum=0;
	    	for(int mark : marks) {
	    		sum=sum+mark;	
	    	}
	    	System.out.println(avg=(sum/marks.length));
	    	return avg;
	    	}

	   }

