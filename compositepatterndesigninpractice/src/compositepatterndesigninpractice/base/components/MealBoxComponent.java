package compositepatterndesigninpractice.base.components;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class MealBoxComponent implements Serializable {
	
	private static final long serialVersionUID = 6347181514275513815L;
	
	private List<MealBoxComponent> components;
	
	public MealBoxComponent() {
		this.setComponents(new ArrayList<MealBoxComponent>());
	}
	
	public List<MealBoxComponent> getComponents() {
		return components;
	}

	public void setComponents(List<MealBoxComponent> components) {
		this.components = components;
	}
	
	@Override
	public String toString() {
		return "MealBoxComponent [components=" + components + "]";
	}

	public abstract MealBoxComponent add(MealBoxComponent component);
}
