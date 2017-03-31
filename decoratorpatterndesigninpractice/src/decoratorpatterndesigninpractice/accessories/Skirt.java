package decoratorpatterndesigninpractice.accessories;

import java.util.List;

import decoratorpatterndesigninpractice.girls.Girl;

public class Skirt extends GirlDesigner{

	private String brandName;
	private String color;
	private int length;
	
	public Skirt(String brandName, String color, int length) {
		super();
		this.setBrandName(brandName);
		this.setColor(color);
		this.setLength(length);
	}
	
	public Skirt(String brandName, String color, int length, Girl girl) {
		super(girl);
		this.setBrandName(brandName);
		this.setColor(color);
		this.setLength(length);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
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

	@Override
	public String toString() {
		return "Skirt [brandName=" + brandName + ", color=" + color
				+ ", length=" + length + "]";
	}
}
