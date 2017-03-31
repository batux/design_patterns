package commandpatterndesigninpractice.social.media.commands;

import commandpatterndesigninpractice.social.media.panels.BasePanel;

public class ShareCommand implements Command {
	
	private BasePanel panel;
	
	public ShareCommand() {
		this.panel = null;
	}
	
	public ShareCommand(BasePanel panel) {
		this.panel = panel;
	}
	
	@Override
	public void execute(BasePanel panel) {
		this.panel = panel;
		if(this.panel != null) {
			this.panel.share();
		}
	}

}
