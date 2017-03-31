package compositepatterndesigninpractice.toolcomponents;

import compositepatterndesigninpractice.base.components.MealBoxComponent;
import compositepatterndesigninpractice.base.components.ToolComponent;

public class DinnerFork extends ToolComponent{

	private static final long serialVersionUID = -4557563092642890175L;

	public DinnerFork(String name) {
		super(name);
	}
	
	@Override
	public MealBoxComponent add(MealBoxComponent component) {
		super.getComponents().add(component);
		return this;
	}

}
