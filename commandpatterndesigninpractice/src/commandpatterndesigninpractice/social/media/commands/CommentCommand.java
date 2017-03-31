package commandpatterndesigninpractice.social.media.commands;

import commandpatterndesigninpractice.social.media.panels.BasePanel;

public class CommentCommand implements Command {

	private BasePanel panel;
	
	public CommentCommand() {
		this.panel = null;
	}
	
	public CommentCommand(BasePanel panel) {
		this.panel = panel;
	}
	
	@Override
	public void execute(BasePanel panel) {
		this.panel = panel;
		if(this.panel != null) {
			this.panel.comment();
		}
	}

}
