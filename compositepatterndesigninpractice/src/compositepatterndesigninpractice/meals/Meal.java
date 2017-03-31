package compositepatterndesigninpractice.meals;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import compositepatterndesigninpractice.foods.Food;

public abstract class Meal extends Food implements Serializable {

	private static final long serialVersionUID = 8679242160795729491L;

	private int count;
	private List<Food> foods;
	
	public Meal() {
		this.setFoods(new ArrayList<Food>());
	}
	
	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}
	
	public Food remove(int index) {
		return this.getFoods().remove(index);
	}

	public Food remove(Food food) {
		this.getFoods().remove(food);
		return food;
	}
	
	public abstract void add(Food food);

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Meal [count=" + count + ", foods=" + foods + "]";
	}
	
}
