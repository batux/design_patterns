package chainofresponsibilitypatterninpractice.staffs;

import java.util.ArrayList;
import java.util.List;

import chainofresponsibilitypatterninpractice.documents.Document;
import chainofresponsibilitypatterninpractice.documents.StaffType;

public abstract class Staff {

	protected String name;
	protected String surname;
	protected StaffType type;
	
	protected Staff nextStaff;
	
	protected List<Document> signedDocuments;
	
	public Staff(String name, String surname, StaffType type) {
		this.name = name;
		this.surname = surname;
		this.type = type;
		this.signedDocuments = new ArrayList<Document>();
	}
	
	public void setNextStaff(Staff staff) {
		this.nextStaff = staff;
	}
	
	public void assignDocument(Document document) {
		if(document.getStaffTypes().contains(this.type)) {
			sign(document);
		}
		if(this.nextStaff != null) {
			this.nextStaff.assignDocument(document);
		}
	}
	
	@Override
	public String toString() {
		return "Staff [name=" + name + ", surname=" + surname + ", type="
				+ type + "]";
	}
	
	public void showSignedDocuments() {
		for(Document document : this.signedDocuments) {
			System.out.println(this.toString() + document.toString());
		}
	}
	
	public abstract void sign(Document document);
}
