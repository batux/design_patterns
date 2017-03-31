package commandpatterndesigninpractice.social.media.panels;

public abstract class BasePanel {

	protected String name;
	protected String title;
	
	public BasePanel() {
		this.name = null;
		this.title = null;
	}
	
	public BasePanel(String name, String title) {
		this.name = name;
		this.title = title;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public abstract void like();
	public abstract void share();
	public abstract void comment();
}
