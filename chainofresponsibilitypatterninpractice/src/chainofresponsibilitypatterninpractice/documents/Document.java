package chainofresponsibilitypatterninpractice.documents;

import java.util.List;

public abstract class Document {

	protected String name;
	protected List<StaffType> staffTypes;
	
	public Document(String name, List<StaffType> staffTypes) {
		this.name = name;
		this.staffTypes = staffTypes;
	}
	
	public void addStaff(StaffType staff) {
		this.staffTypes.add(staff);
	}
	
	public StaffType removeStaff(StaffType staff) {
		boolean result = this.staffTypes.remove(staff);
		if(result) {
			return staff;
		}
		return null;
	}
	
	public StaffType removeStaff(int index) {
		return this.staffTypes.remove(index);
	}
	
	public List<StaffType> getStaffTypes() {
		return this.staffTypes;
	}

	@Override
	public String toString() {
		return "Document [name=" + name + "]";
	}
	
}
