package compositepatterndesigninpractice.foods;

public class Tomato extends Food {

	private static final long serialVersionUID = 525336310583482575L;

	private int type;
	
	public Tomato() {
		super();
	}
	
	public Tomato(String name, double calorie, int type) {
		super(name, calorie);
		this.setType(type);
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + type;
		return result + super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tomato other = (Tomato) obj;
		if (type != other.type)
			return false;
		return true && super.equals(obj);
	}

	@Override
	public String toString() {
		return "Tomato [type=" + type + ", name=" + name + ", calorie="
				+ calorie + "]";
	}
	
}
