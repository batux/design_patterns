package chainofresponsibilitypatterninpractice.documents;

import java.util.List;

public class StudentCertificate extends Document{

	public StudentCertificate(String name, List<StaffType> staffTypes) {
		super(name,staffTypes);
	}

}
