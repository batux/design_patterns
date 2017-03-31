package compositepatterndesigninpractice.mealcomponents;

import compositepatterndesigninpractice.base.components.MealBoxComponent;
import compositepatterndesigninpractice.base.components.MealComponent;
import compositepatterndesigninpractice.meals.Meal;

public class SaladBox extends MealComponent {

	private static final long serialVersionUID = -4388742896012000835L;
	
	public SaladBox() {
		super();
	}
	
	public SaladBox(Meal meal) {
		super(meal);
	}

	@Override
	public MealBoxComponent add(MealBoxComponent component) {
		super.getComponents().add(component);
		return this;
	}
}
