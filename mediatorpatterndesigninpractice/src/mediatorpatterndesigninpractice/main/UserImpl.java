package mediatorpatterndesigninpractice.main;

public class UserImpl extends User {

	public UserImpl(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void send(String message) {
		mediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		System.out.println("Received Message to " + this.name + " : " + message);
	}

}
