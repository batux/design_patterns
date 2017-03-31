package compositepatterndesigninpractice.base.components;

import java.io.Serializable;

public abstract class ToolComponent extends MealBoxComponent implements Serializable {

	private static final long serialVersionUID = 2481994524465217670L;

	private String name;

	public ToolComponent(String name) {
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ToolComponent [name=" + name + "]";
	}
	
}
