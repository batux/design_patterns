package compositepatterndesigninpractice.foods;

public class Rice extends Food{

	private static final long serialVersionUID = 732563518632282966L;

	public Rice() {
		super();
	}
	
	public Rice(String name, double calorie) {
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
