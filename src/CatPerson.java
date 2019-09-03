import java.util.Random;
public class CatPerson extends Person {
	
	private String[] questionList = {"Do you like cats?",
									  "How many cats do you have?",
									  "Can you pet my cat?",
									  "Have you ever seen a more precious animal?"
									};
	
	private String[] answerList = { "Swweet, sweet, Essie is my favorite kitty",
									"I like to pet behind their ears",
									"I think Dogs are the worst",
									"I like to sample the cat food sometimes"
								};
	

	public CatPerson() {
		super();
	}
	
	
	@Override
	void askQuestion() {
		Random random = new Random();
		System.out.println(questionList[random.nextInt(4)]);
	}

	@Override
	void answerQuestion() {
		Random random = new Random();
		System.out.println(answerList[random.nextInt(4)]);
	}

	@Override
	public void whatDoYouDo() {
		System.out.println("I care for cats");	
	}
	
}
