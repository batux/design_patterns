package compositepatterndesigninpractice.foods;

public class Meat extends Food {

	private static final long serialVersionUID = 3244925363727574640L;

	public Meat() {
		super();
	}
	
	public Meat(String name, double calorie) {
		super(name, calorie);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
