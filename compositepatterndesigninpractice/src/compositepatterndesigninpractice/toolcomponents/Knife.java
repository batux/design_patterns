package compositepatterndesigninpractice.toolcomponents;

import compositepatterndesigninpractice.base.components.MealBoxComponent;
import compositepatterndesigninpractice.base.components.ToolComponent;

public class Knife extends ToolComponent{
	
	private static final long serialVersionUID = -1691451900892476492L;

	public Knife(String name) {
		super(name);
	}

	@Override
	public MealBoxComponent add(MealBoxComponent component) {
		super.getComponents().add(component);
		return this;
	}
}
