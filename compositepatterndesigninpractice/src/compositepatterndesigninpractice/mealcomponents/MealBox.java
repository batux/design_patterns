package compositepatterndesigninpractice.mealcomponents;

import compositepatterndesigninpractice.base.components.MealBoxComponent;

public class MealBox extends MealBoxComponent{

	private static final long serialVersionUID = -2871006506425785970L;

	public MealBox() {
		super();
	}
	
	@Override
	public MealBoxComponent add(MealBoxComponent component) {
		super.getComponents().add(component);
		return this;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
