
public class Answer 
{
		String questionText;
		String originalAnswer;
		String submittedAnswer;
		
		public Answer(String questionText, String originalAnswer, String submittedAnswer) {
			super();
			this.questionText = questionText;
			this.originalAnswer = originalAnswer;
			this.submittedAnswer = submittedAnswer;
		}

		@Override
		public String toString() {
			return "Answer [questionText=" + questionText + ", originalAnswer=" + originalAnswer + ", submittedAnswer="
					+ submittedAnswer + "]";
		}
		
		
		
}
