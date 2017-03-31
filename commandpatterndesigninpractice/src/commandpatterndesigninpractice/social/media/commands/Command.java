package commandpatterndesigninpractice.social.media.commands;

import commandpatterndesigninpractice.social.media.panels.BasePanel;

public interface Command {

	public void execute(BasePanel panel);
	
}
