
public abstract class Person {
	
	private String myName;
	private String occupation;
	
	public void askName() {
		System.out.println("What is your name?");
	}
	
	public void giveName() {
		System.out.println("My name is " + myName);
	}
	
	public void whatDoYouDo() {
		System.out.println("I am a " + occupation);
		
	}
	
	abstract void askQuestion();
	
	abstract void answerQuestion();
	
	@Override
	public String toString() {
		return "Person [myName=" + myName + ", occupation=" + occupation + "]";
	}
}
