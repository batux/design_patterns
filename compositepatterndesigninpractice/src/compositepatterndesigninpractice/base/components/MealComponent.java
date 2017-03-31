package compositepatterndesigninpractice.base.components;

import java.io.Serializable;

import compositepatterndesigninpractice.meals.Meal;

public abstract class MealComponent extends MealBoxComponent implements Serializable {

	private static final long serialVersionUID = -6809788504651440852L;

	private Meal meal;
	
	public MealComponent() {
		super();
	}
	
	public MealComponent(Meal meal) {
		super();
		this.setMeal(meal);
	}
	
	public Meal getMeal() {
		return meal;
	}

	public void setMeal(Meal meal) {
		this.meal = meal;
	}

	@Override
	public String toString() {
		return "MealComponent [meal=" + meal + "]";
	}
	
}
