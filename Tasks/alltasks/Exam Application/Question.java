import java.util.Arrays;

public class Question 
{
	int qno;
	
	String questionText;
	
	String[] options;
	
	String originalAnswer;

	
	public Question(int qno, String questionText, String[] options, String originalAnswer) {
		super();
		this.qno = qno;
		this.questionText = questionText;
		this.options = options;
		this.originalAnswer = originalAnswer;
	}


	@Override
	public String toString() {
		return "Question [qno=" + qno + ", questionText=" + questionText + ", options=" + Arrays.toString(options)
				+ ", OriginalAnswer=" + originalAnswer + "]";
	}
	
	

	
}
