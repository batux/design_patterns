package commandpatterndesigninpractice.social.media.panels;

public class NewsPanel extends BasePanel {
	
	public NewsPanel() {
		super();
	}
	
	public NewsPanel(String name, String title) {
		super(name, title);
	}

	@Override
	public void like() {
		System.out.println("You liked to news panel.");
	}

	@Override
	public void share() {
		System.out.println("You shared to news panel.");
	}

	@Override
	public void comment() {
		System.out.println("You made comment to news panel.");
	}

}
