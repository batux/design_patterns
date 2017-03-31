package observerpatterndesigninpractice.subscriber;

public class NewsFollower implements Subscriber{

	private String name;
	
	public NewsFollower(String name) {
		this.name = name;
	}
	
	@Override
	public void receiveMessage(String message) {
		System.out.println(message + " is gotten by " + this.name);
	}

}
