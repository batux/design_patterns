package compositepatterndesigninpractice.meals;

import compositepatterndesigninpractice.foods.Food;

public class Soup extends Meal {

	private static final long serialVersionUID = -4562827177175913878L;
	
	public Soup() {
		super();
	}
	
	@Override
	public void add(Food food) {
		super.getFoods().add(food);
	}

}
