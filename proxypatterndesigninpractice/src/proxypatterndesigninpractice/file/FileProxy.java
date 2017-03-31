package proxypatterndesigninpractice.file;

import java.util.ArrayList;
import java.util.List;

import proxypatterndesigninpractice.main.User;

public class FileProxy implements IFile {

	private List<FileInfo> files;
	private User user;
	private File file;
	
	public FileProxy() {
		this.setUser(null);
		this.setFiles(new ArrayList<FileInfo>());
		this.file = new File();
	}
	
	public FileProxy(User user, List<FileInfo> files) {
		this();
		this.setFiles(files);
		this.setUser(user);
	}
	
	@Override
	public void write() {
		
		for(FileInfo fileInfo : this.getFiles()) {
			if(fileInfo.getAllowedUserTypes().contains(this.getUser().getUserType()) && this.getUser().isHasWriteAccess()) {
				this.file.write(fileInfo.getPath(), fileInfo.getText(), fileInfo.isAppend());
			}
			else {
				System.out.println("You dont have write access for this file >> " + fileInfo.getPath());
			}
		}
	}

	@Override
	public String read() {
		
		StringBuffer stringBuffer = new StringBuffer();
		for(FileInfo fileInfo : this.getFiles()) {
			if(fileInfo.getAllowedUserTypes().contains(this.getUser().getUserType()) && this.getUser().isHasWriteAccess()) {
				stringBuffer.append(this.file.read(fileInfo.getPath(), fileInfo.getText(), fileInfo.isAppend()));
			}
			else {
				System.out.println("You dont have read access for this file >> " + fileInfo.getPath());
			}
		}
		return stringBuffer.toString();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<FileInfo> getFiles() {
		return files;
	}

	public void setFiles(List<FileInfo> files) {
		this.files = files;
	}

}
