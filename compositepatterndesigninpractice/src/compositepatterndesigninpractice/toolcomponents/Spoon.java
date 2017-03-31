package compositepatterndesigninpractice.toolcomponents;

import compositepatterndesigninpractice.base.components.MealBoxComponent;
import compositepatterndesigninpractice.base.components.ToolComponent;

public class Spoon extends ToolComponent{

	private static final long serialVersionUID = 3732227691835649736L;
	
	public Spoon(String name) {
		super(name);
	}

	@Override
	public MealBoxComponent add(MealBoxComponent component) {
		super.getComponents().add(component);
		return this;
	}

}
