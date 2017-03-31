package chainofresponsibilitypatterninpractice.documents;

import java.util.List;

public class Transcripts extends Document{

	public Transcripts(String name, List<StaffType> staffTypes) {
		super(name,staffTypes);
	}

}
