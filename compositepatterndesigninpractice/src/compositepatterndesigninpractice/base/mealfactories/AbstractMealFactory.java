package compositepatterndesigninpractice.base.mealfactories;

import java.io.Serializable;

import compositepatterndesigninpractice.mealcomponents.MealBox;

public abstract class AbstractMealFactory implements Serializable {

	private static final long serialVersionUID = -8366690948466275104L;

	public abstract MealBox createMealBox();
}
