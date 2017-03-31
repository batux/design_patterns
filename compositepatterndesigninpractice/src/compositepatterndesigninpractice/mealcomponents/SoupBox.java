package compositepatterndesigninpractice.mealcomponents;

import compositepatterndesigninpractice.base.components.MealBoxComponent;
import compositepatterndesigninpractice.base.components.MealComponent;
import compositepatterndesigninpractice.meals.Meal;

public class SoupBox extends MealComponent {

	private static final long serialVersionUID = 6917934466732134131L;
	
	public SoupBox() {
		super();
	}
	
	public SoupBox(Meal meal) {
		super(meal);
	}

	@Override
	public MealBoxComponent add(MealBoxComponent component) {
		super.getComponents().add(component);
		return this;
	}

}
