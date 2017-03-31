package compositepatterndesigninpractice.mealcomponents;

import compositepatterndesigninpractice.base.components.MealBoxComponent;
import compositepatterndesigninpractice.base.components.MealComponent;
import compositepatterndesigninpractice.meals.Meal;

public class MeatBox extends MealComponent {

	private static final long serialVersionUID = -2536578978354785702L;

	public MeatBox() {
		super();
	}
	
	public MeatBox(Meal meal) {
		super(meal);
	}
	
	@Override
	public MealBoxComponent add(MealBoxComponent component) {
		super.getComponents().add(component);
		return this;
	}
	
}
