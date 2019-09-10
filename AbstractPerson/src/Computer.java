import java.util.Random;
import java.util.Queue;
import java.util.LinkedList;

public class Computer extends Person {
	// Cycles through a list of questions and a list of responses

	private Queue<String> answers;
	private Queue<String> questions;
	
	private void sayAnswer(Queue<String> responses){
		String tmp = responses.remove();
		System.out.println(tmp);
		responses.add(tmp);
	}

	@Override
	public void whatDoYouDo(){
		System.out.println("I am " + this.myName + " and I am being " + this.occupation);
	}

	@Override
	public void askQuestion(){
		sayAnswer(this.questions);
	}

	@Override
	void answerQuestion() {
		sayAnswer(this.answers);
	}

	public Computer(String name, String occupation){
		super(name, occupation);

		String[] answerList = {"I am me. Who are you?",
							   "This is the JVM.",
							   "I don't understand.",
							   "I won't tell you.",
							   "I am working hard."
								};
		this.answers = new LinkedList<String>();
		for (String element : answerList){
			this.answers.add(element);
		}

		String[] questionList = {"Are you me?",
								"Who are you?",
								"Are you asking me a question?",
								"What do you want?"
								};
		this.questions = new LinkedList<String>();
		for (String element : questionList){
			this.questions.add(element);
		}
	}
}
