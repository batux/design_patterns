package chainofresponsibilitypatterninpractice.main;

import java.util.ArrayList;
import java.util.List;

import chainofresponsibilitypatterninpractice.documents.Diploma;
import chainofresponsibilitypatterninpractice.documents.StaffType;
import chainofresponsibilitypatterninpractice.documents.StudentCertificate;
import chainofresponsibilitypatterninpractice.documents.Transcripts;
import chainofresponsibilitypatterninpractice.staffs.Academician;
import chainofresponsibilitypatterninpractice.staffs.HeadOfDepartment;
import chainofresponsibilitypatterninpractice.staffs.Rector;
import chainofresponsibilitypatterninpractice.staffs.Secretary;
import chainofresponsibilitypatterninpractice.staffs.Staff;

/**
 * 
 * @author Batuhan Duzgun (batux) - Computer Engineer / Industrial Engineer
 * 
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Staff rector = new Rector("Batuhan", "Duzgun", StaffType.RECTOR);
		Staff headOfDepartment = new HeadOfDepartment("Batuhan", "Duzgun", StaffType.HEAD_OF_DEPARTMENT);
		Staff academician = new Academician("Pelin", "Kavraz", StaffType.ACADEMICIAN);
		Staff secretary = new Secretary("Ayse", "Yilmaz", StaffType.SECRETARY);
		
		secretary.setNextStaff(rector);
		rector.setNextStaff(headOfDepartment);
		headOfDepartment.setNextStaff(academician);
		
		List<StaffType> documentStaffTypes = new ArrayList<StaffType>();
		documentStaffTypes.add(StaffType.RECTOR);
		documentStaffTypes.add(StaffType.HEAD_OF_DEPARTMENT);
		secretary.assignDocument(new Diploma("Sakarya University Computer Engineering Diploma", documentStaffTypes));
	
		documentStaffTypes = new ArrayList<StaffType>();
		documentStaffTypes.add(StaffType.SECRETARY);
		secretary.assignDocument(new StudentCertificate("Sakarya University Computer Engineering Student Certificate", documentStaffTypes));
	
		documentStaffTypes = new ArrayList<StaffType>();
		documentStaffTypes.add(StaffType.HEAD_OF_DEPARTMENT);
		documentStaffTypes.add(StaffType.SECRETARY);
		secretary.assignDocument(new Transcripts("Sakarya University Computer Engineering Student Transcripts", documentStaffTypes));
		
		// Show signed documents !
		rector.showSignedDocuments();
		headOfDepartment.showSignedDocuments();
		academician.showSignedDocuments();
		secretary.showSignedDocuments();
	}

}
