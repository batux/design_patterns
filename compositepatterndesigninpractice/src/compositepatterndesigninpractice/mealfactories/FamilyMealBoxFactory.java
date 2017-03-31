package compositepatterndesigninpractice.mealfactories;

import compositepatterndesigninpractice.base.mealfactories.AbstractMealFactory;
import compositepatterndesigninpractice.foods.Cabbage;
import compositepatterndesigninpractice.foods.Meat;
import compositepatterndesigninpractice.foods.Rice;
import compositepatterndesigninpractice.foods.Tomato;
import compositepatterndesigninpractice.mealcomponents.MealBox;
import compositepatterndesigninpractice.mealcomponents.MeatBox;
import compositepatterndesigninpractice.mealcomponents.SaladBox;
import compositepatterndesigninpractice.mealcomponents.SoupBox;
import compositepatterndesigninpractice.meals.MeatBall;
import compositepatterndesigninpractice.meals.Salad;
import compositepatterndesigninpractice.meals.Soup;
import compositepatterndesigninpractice.toolcomponents.DinnerFork;
import compositepatterndesigninpractice.toolcomponents.Knife;
import compositepatterndesigninpractice.toolcomponents.Spoon;

public class FamilyMealBoxFactory extends AbstractMealFactory{

	private static final long serialVersionUID = 4862222618717405862L;

	@Override
	public MealBox createMealBox() {
		
		MealBox mealBox = new MealBox();
		
		MeatBall meatBall = new MeatBall();
		meatBall.add(new Rice());
		meatBall.add(new Tomato());
		meatBall.add(new Meat());
		meatBall.setCount(4);
		
		Salad salad = new Salad();
		salad.add(new Tomato("İzmir Domates", 200.0, 1));
		salad.add(new Cabbage("Trabzon Lahana", 100, "Kara"));
		salad.add(new Rice("Baldo Pirinc", 500.1));
		salad.setCount(4);
		
		Soup soup = new Soup();
		soup.add(new Tomato("İzmir Domates", 200.0, 1));
		soup.setCount(4);
		
		mealBox.add(new SoupBox(soup));
		mealBox.add(new SaladBox(salad));
		mealBox.add(new MeatBox(meatBall));
		mealBox.add(new Knife("Plastik Yemek Bıçağı"));
		mealBox.add(new DinnerFork("Plastik Çatal"));
		mealBox.add(new Spoon("Plastik Kaşık"));
		
		return mealBox;
	}

}
