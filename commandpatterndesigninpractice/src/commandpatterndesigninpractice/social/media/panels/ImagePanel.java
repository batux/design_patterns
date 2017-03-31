package commandpatterndesigninpractice.social.media.panels;

public class ImagePanel extends BasePanel {

	public ImagePanel() {
		super();
	}
	
	public ImagePanel(String name, String title) {
		super(name, title);
	}

	@Override
	public void like() {
		System.out.println("You liked to image panel.");
	}

	@Override
	public void share() {
		System.out.println("You shared to image panel.");
	}

	@Override
	public void comment() {
		System.out.println("You made comment to image panel.");
	}
	
}
