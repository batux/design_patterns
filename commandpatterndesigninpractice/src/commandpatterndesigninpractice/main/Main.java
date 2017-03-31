package commandpatterndesigninpractice.main;

import commandpatterndesigninpractice.social.media.commands.CommentCommand;
import commandpatterndesigninpractice.social.media.commands.LikeCommand;
import commandpatterndesigninpractice.social.media.commands.ShareCommand;
import commandpatterndesigninpractice.social.media.panels.BasePanel;
import commandpatterndesigninpractice.social.media.panels.ImagePanel;
import commandpatterndesigninpractice.social.media.panels.NewsPanel;

/**
 * 
 * @author Batuhan Duzgun (batux) - Computer Engineer / Industrial Engineer
 * 
 *
 */

public class Main {

	public static void main(String[] args) {
		
		BasePanel imagePanel = new ImagePanel();
		BasePanel newsPanel = new NewsPanel();

		LikeCommand likeCommand = new LikeCommand();
		ShareCommand shareCommand = new ShareCommand();
		CommentCommand commentCommand = new CommentCommand();
		
		// Execute commands for Image Panel
		CommandExecutor.execute(likeCommand, imagePanel);
		CommandExecutor.execute(shareCommand, imagePanel);
		CommandExecutor.execute(commentCommand, imagePanel);
		
		// Execute commands for News Panel
		CommandExecutor.execute(likeCommand, newsPanel);
		CommandExecutor.execute(shareCommand, newsPanel);
		CommandExecutor.execute(commentCommand, newsPanel);
	}

}
