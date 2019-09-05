import java.util.Random;

public class Computer extends Person {

	private static Queue<String> answers = new Queue<String>();
	private static Queue<String> questions = new Queue<String>();
	
	private String sayAnswer(Queue<String> responses){
		String tmp = this.responses.remove();
		System.out.println(tmp);
		this.responses.add(tmp);
	}

	@Override
	public void whatDoYouDo(){
		sayAnswer();
	}

	@Override
	void answerQuestion() {
		sayAnswer();
	}

	public Computer(String name, String occupation){
		super(name, occupation);
		String[] answerList = {"I am me.",
							   "This is the JVM.",
							   "Who are you?",
							   "I don't understand.",
							   "I can't do that."
								};
		this.answers.addAll(answerList);
		this.answers.add(name);

}
