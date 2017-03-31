package commandpatterndesigninpractice.main;

import commandpatterndesigninpractice.social.media.commands.Command;
import commandpatterndesigninpractice.social.media.panels.BasePanel;

public class CommandExecutor {

	public static void execute(Command command, BasePanel panel) {
		if(command != null) {
			command.execute(panel);
		}
	}
}
