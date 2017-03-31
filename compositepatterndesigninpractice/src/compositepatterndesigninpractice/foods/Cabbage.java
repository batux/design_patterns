package compositepatterndesigninpractice.foods;

public class Cabbage extends Food {

	private static final long serialVersionUID = 5413293947671939903L;

	private String type;

	public Cabbage() {
		super();
	}
	
	public Cabbage(String name, double calorie, String type) {
		super(name, calorie);
		this.setType(type);
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Cabbage other = (Cabbage) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true && super.equals(obj);
	}

	@Override
	public String toString() {
		return "Cabbage [type=" + type + ", name=" + name + ", calorie="
				+ calorie + "]";
	}
	
}
