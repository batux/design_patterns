package compositepatterndesigninpractice.foods;

import java.io.Serializable;

public abstract class Food implements Serializable {

	private static final long serialVersionUID = -1981365429372178604L;
	protected String name;
	protected double calorie;
	
	public Food() {
		this.setCalorie(0.0);
		this.setName(null);
	}
	
	public Food(String name, double calorie) {
		this.setCalorie(calorie);
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCalorie() {
		return calorie;
	}
	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(calorie);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		if (Double.doubleToLongBits(calorie) != Double
				.doubleToLongBits(other.calorie))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", calorie=" + calorie + "]";
	}
}
