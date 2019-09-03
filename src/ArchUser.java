
public class ArchUser extends Person {

	private void iUseArchBTW(){
		System.out.println("I use Arch Linux, by the way.");
	}

	@Override
	public void whatDoYouDo() {
		System.out.println("I use Arch Linux.");
	}

	@Override
	public void askQuestion() {
		System.out.println("Do you like Linux?");
		iUseArchBTW();
	}

	@Override
	public void answerQuestion() {
		System.out.println("I use Arch Linux.");
	}
}
