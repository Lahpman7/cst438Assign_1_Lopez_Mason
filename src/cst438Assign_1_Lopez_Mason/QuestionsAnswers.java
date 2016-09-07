package cst438Assign_1_Lopez_Mason;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
*	A half-secretive map of	questions	to	answers	(at	most one answer	per	question).
*	Gives out random	questions(keys)	from the map, and
*	can	be	queried	to	test if	a	given	question maps	to	a	given	answer.
*/

public class QuestionsAnswers {
	private HashMap<String, String> queAn = new HashMap<String, String>();
	public QuestionsAnswers(){
		queAn.put("How many days are there in a (normal) year?", "365");
		queAn.put("What is the name of our school?","CSUMB");
		queAn.put("How many states are there in the Untited States?", "50");
	}
	/**
	*	Maps	question	to	answer.
	*/
	void put(String	question, String answer){
		
		if(!question.isEmpty()||!answer.isEmpty()){
			queAn.put(question, answer);
		}
		else{
			System.out.println("error");
		}
	}
	/**
	*	Queries	if	question	maps	to	answer.
	*/
	boolean	testAnswer(String question,	String answer)	{
		if(queAn.containsKey(question) && queAn.containsValue(answer))
		{
			return true;
		}
		return false;
	}
	/**
	* Gives out a random question from the key set.
	*/
	String getRandomQuestion(){
		/*int max = queAn.size(),min = 0;
		Random x = new Random();
		int y = x.nextInt(max - min + 1) + min;
		return "";
		*/
		Random r = new Random();
		List<String> keys = new ArrayList<String>(queAn.keySet());
		String randomQuest = keys.get(r.nextInt(keys.size()));
		return randomQuest;
		//borrowed above sorting from Stackoverflow..
	}

	/*public static void main() {
		QuestionsAnswers queAn = new QuestionsAnswers();
		System.out.println(queAn.getRandomQuestion());
		//System.out.println("asdfasdfadfa");
		
    }*/
}
