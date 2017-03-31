package compositepatterndesigninpractice.mealcomponents;

import compositepatterndesigninpractice.base.components.MealBoxComponent;
import compositepatterndesigninpractice.base.components.MealComponent;
import compositepatterndesigninpractice.meals.Meal;

public class LemonBox extends MealComponent {

	private static final long serialVersionUID = 2733585219387314220L;

	public LemonBox() {
		super();
	}
	
	public LemonBox(Meal meal) {
		super(meal);
	}
	
	@Override
	public MealBoxComponent add(MealBoxComponent component) {
		super.getComponents().add(component);
		return this;
	}

}
