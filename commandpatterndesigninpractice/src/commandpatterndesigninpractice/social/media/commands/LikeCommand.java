package commandpatterndesigninpractice.social.media.commands;

import commandpatterndesigninpractice.social.media.panels.BasePanel;

public class LikeCommand implements Command {

	private BasePanel panel;
	
	public LikeCommand() {
		this.panel = null;
	}
	
	public LikeCommand(BasePanel panel) {
		this.panel = panel;
	}
	
	@Override
	public void execute(BasePanel panel) {
		this.panel = panel;
		if(this.panel != null) {
			this.panel.like();
		}
	}

}
