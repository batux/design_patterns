package decoratorpatterndesigninpractice.accessories;

import java.util.List;

import decoratorpatterndesigninpractice.girls.Girl;

public class TShirt extends GirlDesigner{
	
	private String brandName;
	private String color;
	
	public TShirt(String brandName, String color) {
		super();
		this.setBrandName(brandName);
		this.setColor(color);
	}
	
	public TShirt(String brandName, String color, Girl girl) {
		super(girl);
		this.setBrandName(brandName);
		this.setColor(color);
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public List<Girl> createAccessory(List<Girl> girls) {
		return super.createAccessory(girls);
	}

}
