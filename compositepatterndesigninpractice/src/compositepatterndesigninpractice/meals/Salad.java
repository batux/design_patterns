package compositepatterndesigninpractice.meals;

import compositepatterndesigninpractice.foods.Food;

public class Salad extends Meal {

	private static final long serialVersionUID = 6332591284793770705L;

	public Salad() {
		super();
	}
	
	@Override
	public void add(Food food) {
		super.getFoods().add(food);
	}

}
