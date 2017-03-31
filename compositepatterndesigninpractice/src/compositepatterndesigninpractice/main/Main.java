package compositepatterndesigninpractice.main;

import compositepatterndesigninpractice.base.mealfactories.MealFactorySelector;
import compositepatterndesigninpractice.mealcomponents.MealBox;
import compositepatterndesigninpractice.mealfactories.EconomyMealBoxFactory;
import compositepatterndesigninpractice.mealfactories.FamilyMealBoxFactory;

/**
 * 
 * @author Batuhan Duzgun (batux) - Computer Engineer / Industrial Engineer
 * 
 *
 */

public class Main {

	public static void main(String[] args) {
		
		MealBox mealbox1 = MealFactorySelector.getMealBox(new EconomyMealBoxFactory());
		MealBox mealbox2 = MealFactorySelector.getMealBox(new FamilyMealBoxFactory());
		
		System.out.println(mealbox1);
		System.out.println(mealbox2);
		
		// we have different mealbox, we did it via Composite Design Pattern !
	}

}
