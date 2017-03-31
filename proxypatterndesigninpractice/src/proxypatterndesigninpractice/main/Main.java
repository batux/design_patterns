package proxypatterndesigninpractice.main;

import java.util.ArrayList;
import java.util.List;

import proxypatterndesigninpractice.file.FileInfo;
import proxypatterndesigninpractice.file.FileProxy;

/**
 * 
 * @author Batuhan Duzgun (batux) - Computer Engineer / Industrial Engineer
 * 
 *
 */

public class Main {

	public static void main(String[] args) {
		
		User user = new User.UserBuilder("Batuhan", "Düzgün", UserType.EVERYBODY)
							.setHasReadAccess(true)
							.setHasWriteAccess(true)
							.build();
		
		
		UserType systemUserType = UserType.SYSTEM_USER;
		UserType superUserType = UserType.SUPER_USER;
		UserType everybodyUserType = UserType.EVERYBODY;
		
		FileInfo file1 = new FileInfo("/home/batuhan/Documents/dosya1.txt","SAMPIYON FENERBAHCE",true);
		file1.getAllowedUserTypes().add(superUserType);
		
		FileInfo file2 = new FileInfo("/home/batuhan/Documents/dosya2.txt","SAMPIYON FENERBAHCE",true);
		file2.getAllowedUserTypes().add(superUserType);
		file2.getAllowedUserTypes().add(everybodyUserType);
		
		FileInfo file3 = new FileInfo("/home/batuhan/Documents/dosya3.txt","SAMPIYON FENERBAHCE",true);
		file3.getAllowedUserTypes().add(superUserType);
		file3.getAllowedUserTypes().add(everybodyUserType);
		file3.getAllowedUserTypes().add(systemUserType);
		
		FileInfo file4 = new FileInfo("/home/batuhan/Documents/dosya4.txt","SAMPIYON FENERBAHCE",true);
		file4.getAllowedUserTypes().add(superUserType);
		file4.getAllowedUserTypes().add(systemUserType);
		
		FileInfo file5 = new FileInfo("/home/batuhan/Documents/dosya5.txt","SAMPIYON FENERBAHCE",true);
		file5.getAllowedUserTypes().add(systemUserType);
		
		List<FileInfo> files = new ArrayList<FileInfo>();
		files.add(file1);
		files.add(file2);
		files.add(file3);
		files.add(file4);
		files.add(file5);
		
		FileProxy folderProxy = new FileProxy(user, files);
		folderProxy.write();
		folderProxy.read();
	}

}
