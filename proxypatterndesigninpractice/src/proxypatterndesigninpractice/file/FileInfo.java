package proxypatterndesigninpractice.file;

import java.util.ArrayList;
import java.util.List;

import proxypatterndesigninpractice.main.UserType;

public class FileInfo {

	private String path;
	private String text;
	private boolean append;
	private List<UserType> allowedUserTypes;
	
	public FileInfo(String path, String text, boolean append) {
		super();
		this.path = path;
		this.text = text;
		this.append = append;
		this.setAllowedUserTypes(new ArrayList<UserType>());
	}
	public boolean isAppend() {
		return append;
	}
	public void setAppend(boolean append) {
		this.append = append;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public List<UserType> getAllowedUserTypes() {
		return allowedUserTypes;
	}
	public void setAllowedUserTypes(List<UserType> allowedUserTypes) {
		this.allowedUserTypes = allowedUserTypes;
	}
}
