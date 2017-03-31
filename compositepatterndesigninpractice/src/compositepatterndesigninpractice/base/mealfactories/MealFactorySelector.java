package compositepatterndesigninpractice.base.mealfactories;

import compositepatterndesigninpractice.mealcomponents.MealBox;

public class MealFactorySelector {

	public static MealBox getMealBox(AbstractMealFactory factory) {
		return factory.createMealBox();
	}
	
}
