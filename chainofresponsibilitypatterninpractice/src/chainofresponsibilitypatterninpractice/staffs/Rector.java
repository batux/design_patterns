package chainofresponsibilitypatterninpractice.staffs;

import chainofresponsibilitypatterninpractice.documents.Document;
import chainofresponsibilitypatterninpractice.documents.StaffType;

public class Rector extends Staff{

	public Rector(String name, String surname, StaffType type) {
		super(name, surname, type);
	}

	@Override
	public void sign(Document document) {
		System.out.println("Signed document from " + this + " : " + document);
		this.signedDocuments.add(document);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
