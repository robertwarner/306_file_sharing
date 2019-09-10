
public class ArchUser extends Person {

	@Override
	public void whatDoYouDo() {
		System.out.println("I am a " + this.occupation);
		System.out.println("I use Arch Linux, by the way.");
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
		super(name, occupation);
	}
}
