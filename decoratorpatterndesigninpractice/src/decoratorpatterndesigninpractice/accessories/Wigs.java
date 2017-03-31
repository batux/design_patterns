package decoratorpatterndesigninpractice.accessories;

import java.util.List;

import decoratorpatterndesigninpractice.girls.Girl;

public class Wigs extends GirlDesigner{

	private String color;
	
	public Wigs(String color) {
		super();
		this.setColor(color);
	}
	
	public Wigs(String color, Girl girl) {
		super(girl);
		this.setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String brandName) {
		this.color = brandName;
	}
	
	@Override
	public List<Girl> createAccessory(List<Girl> girls) {
		return super.createAccessory(girls);
	}
}
