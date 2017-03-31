package chainofresponsibilitypatterninpractice.documents;

public enum StaffType {

	RECTOR(4),
	SECRETARY(1),
	ACADEMICIAN(2),
	HEAD_OF_DEPARTMENT(3);
	
	int priority;
	StaffType(int priority) {
		this.priority = priority;
	}
	
	public int getPriority() {
		return this.priority;
	}
}
