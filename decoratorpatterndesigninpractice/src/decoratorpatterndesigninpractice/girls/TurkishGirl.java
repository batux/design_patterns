package decoratorpatterndesigninpractice.girls;

import java.util.List;

public class TurkishGirl extends Girl{

	public TurkishGirl(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}

	@Override
	public List<Girl> createAccessory(List<Girl> girls) {
		this.setAccessories(girls);
		return this.getAccessories();
	}

}
