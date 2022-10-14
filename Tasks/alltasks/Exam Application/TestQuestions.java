import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class TestQuestions 
{

	public static void main(String[] args) {
		
		//System.out.println("1.true".split("\\.")[1]);
		
		Scanner scanner = new Scanner(System.in);
		
		HashMap<Integer,Answer>  hashmap = new HashMap<Integer,Answer>();
		
		ArrayList<Question>  arrayList = new ArrayList<Question>();
		String[] options= {"1.true" , "2.false"};
		
		System.out.println(options);
		
		arrayList.add(new Question(1,"what is default value of boolean variable?",options,"2.false"));
		arrayList.add(new Question(2,"what is default value of  reference variable?",new String[]{"1.zero" , "2.null"},"2.null"));
		
		//System.out.println(arrayList);
		
	    for(int i=0;i<arrayList.size();i++)
	    {
	    	Question question=arrayList.get(i);
	    	
	    	System.out.println("\n" + question.qno + " " + question.questionText + " " + question.options[0] + " " + question.options[1] + "\n");
	    	
	    	System.out.println("submit your answer :-  ");
	    	int position=scanner.nextInt();//2
	    	
	    	String submittedAnswer = question.options[position-1];
	    	
	    	hashmap.put(question.qno,new Answer(question.questionText,question.originalAnswer,submittedAnswer));
	    }
	    
	    // HashMap<Integer,String> map = new HashMap<>();
	    // 
	    // map.put(1,"2.false");
	    // Integer    Answer
	  
	    // qno   	  answer
	    
	    // 1    	  Answer Object   Entry object 1
	  
	    // 2          Answer object   Entry object 2
	  
	    // 3          Answer object   Entry object 3
	    //  HashMap object
	   // System.out.println(hashmap);	
	   
	    Set<Entry<Integer,Answer>>  entries = hashmap.entrySet();
	    
	    int score = 0;
	    
	    System.out.println("\n\n");
	    
	    System.out.println("qno" + "\t\t question\t\t\t" + "correct answer " + "submittedAnswer\n\n");
	    
	    for(Entry<Integer,Answer> entry : entries)
	    {
	    	int qno= entry.getKey();
	    	Answer answer = entry.getValue();                           // 1.true                                            // 2.false
	    
	    	System.out.println(qno + " " + answer.questionText + "    " + answer.originalAnswer.split("\\.")[1] + "     " + answer.submittedAnswer.split("\\.")[1]);
	    	
	    	if(answer.originalAnswer.equals(answer.submittedAnswer))
	    	{
	    		score = score + 1;
	    		
	    	}
	    }
	    
	    System.out.println("\n\n");
	    
	    System.out.println(" Your score is " + score);
	      
	    
	    
	}
}
