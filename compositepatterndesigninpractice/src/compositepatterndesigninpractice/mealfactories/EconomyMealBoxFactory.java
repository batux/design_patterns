package compositepatterndesigninpractice.mealfactories;

import compositepatterndesigninpractice.base.mealfactories.AbstractMealFactory;
import compositepatterndesigninpractice.foods.Cabbage;
import compositepatterndesigninpractice.foods.Rice;
import compositepatterndesigninpractice.foods.Tomato;
import compositepatterndesigninpractice.mealcomponents.LemonBox;
import compositepatterndesigninpractice.mealcomponents.MealBox;
import compositepatterndesigninpractice.mealcomponents.OilBox;
import compositepatterndesigninpractice.mealcomponents.SaladBox;
import compositepatterndesigninpractice.meals.Salad;
import compositepatterndesigninpractice.toolcomponents.DinnerFork;
import compositepatterndesigninpractice.toolcomponents.Knife;

public class EconomyMealBoxFactory extends AbstractMealFactory {

	private static final long serialVersionUID = 5425308923605007704L;

	@Override
	public MealBox createMealBox() {
		
		MealBox mealbox = new MealBox();
		mealbox.add(new Knife("Plastik Yemek Bıçağı"));
		mealbox.add(new DinnerFork("Plastik Çatal"));
		
		Salad salad = new Salad();
		salad.add(new Tomato("İzmir Domates", 200.0, 1));
		salad.add(new Cabbage("Trabzon Lahana", 100, "Kara"));
		salad.add(new Rice("Baldo Pirinc", 500.1));
		salad.setCount(1);
		
		mealbox.add(new SaladBox(salad)
						.add(new OilBox())
						.add(new LemonBox()));
		return mealbox;
	}

}
