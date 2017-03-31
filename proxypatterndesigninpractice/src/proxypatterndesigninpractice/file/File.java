package proxypatterndesigninpractice.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import proxypatterndesigninpractice.main.UserType;

public class File implements IFile {

	private String path;
	private String text;
	private boolean append;
	private List<UserType> allowedUserTypes;
	
	public File() {
		this.setAppend(false);
		this.setPath(null);
		this.setAllowedUserTypes(new ArrayList<UserType>());
	}
	
	@Override
	public String read() {
		
		BufferedReader bufferedReader = null;
		StringBuffer stringBuffer = new StringBuffer();
		try {
			String sCurrentLine;
			bufferedReader = new BufferedReader(new FileReader(this.getPath()));
			while ((sCurrentLine = bufferedReader.readLine()) != null) {
				stringBuffer.append(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) bufferedReader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return stringBuffer.toString();
	}
	
	public String read(String path, String text, boolean append) {
		this.setPath(path);
		this.setText(text);
		this.setAppend(append);
		return read();
	}
	
	public void write(String path, String text, boolean append) {
		this.setPath(path);
		this.setText(text);
		this.setAppend(append);
		write();
	}

	@Override
	public void write() {
		
		FileWriter fileWriter = null;
		try {
			java.io.File file = new java.io.File(this.getPath());
			if (!file.exists()) {
				file.createNewFile();
			}
			fileWriter = new FileWriter(file.getAbsoluteFile(),this.isAppend());
			BufferedWriter bufferedReader = new BufferedWriter(fileWriter);
			bufferedReader.write(this.getText());
			bufferedReader.close();
			System.out.println("Text appended to >> " + this.getPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isAppend() {
		return append;
	}

	public void setAppend(boolean append) {
		this.append = append;
	}

}
