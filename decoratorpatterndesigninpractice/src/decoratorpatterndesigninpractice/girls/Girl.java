package decoratorpatterndesigninpractice.girls;

import java.util.ArrayList;
import java.util.List;

public abstract class Girl {

	protected String name;
	protected String surname;
	protected int age;
	protected List<Girl> accessories;
	
	public Girl() {
		this.accessories = new ArrayList<Girl>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAccessories(List<Girl> girls) {
		this.accessories = girls;
	}
	
	public List<Girl> getAccessories() {
		return this.accessories;
	}
	
	public abstract List<Girl> createAccessory(List<Girl> girls);
}
