package chainofresponsibilitypatterninpractice.documents;

import java.util.List;

public class Diploma extends Document{

	public Diploma(String name, List<StaffType> staffTypes) {
		super(name,staffTypes);
	}

}
