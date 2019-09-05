
public class ArchUser extends Person {

	@Override
	public void whatDoYouDo() {
		System.out.println("I use Arch Linux.");
	}

	@Override
	public void askQuestion() {
		System.out.println("What Linux distro do you use?");
		System.out.println("I use Arch Linux, by the way.");
	}

	@Override
	public void answerQuestion() {
		System.out.println("I use Arch Linux.");
	}

	public ArchUser(String name, String occupation) {
		// user input for occupation doesn't matter
		super(name, "Arch Linux user");
	}
}
