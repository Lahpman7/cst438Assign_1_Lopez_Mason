package cst438Assign_1_Lopez_Mason;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuestionsAnswersTest {

	@Test
	public void handlingWeirdInputsForTestAnswerMethod() {
		//fail("Not yet implemented");
		QuestionsAnswers implementQuestions = new QuestionsAnswers();
		assertFalse(implementQuestions.testAnswer("42","Randomness here!"));
	}
	@Test 
	public void main() {
		QuestionsAnswers queAn = new QuestionsAnswers();
		//System.out.println(queAn.getRandomQuestion());
		//System.out.println("asdfasdfadfa");
		
    }

}
