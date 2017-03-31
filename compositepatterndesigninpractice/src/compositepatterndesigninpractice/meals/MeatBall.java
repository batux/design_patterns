package compositepatterndesigninpractice.meals;

import compositepatterndesigninpractice.foods.Food;

public class MeatBall extends Meal {

	private static final long serialVersionUID = 3107403385273995398L;

	public MeatBall() {
		super();
	}
	
	@Override
	public void add(Food food) {
		super.getFoods().add(food);
	}

}
