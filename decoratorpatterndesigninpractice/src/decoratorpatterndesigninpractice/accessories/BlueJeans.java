package decoratorpatterndesigninpractice.accessories;

import java.util.List;

import decoratorpatterndesigninpractice.girls.Girl;

public class BlueJeans extends GirlDesigner{
	
	private String brandName;
	
	public BlueJeans(String brandName) {
		super();
		this.setBrandName(brandName);
	}
	
	public BlueJeans(String brandName, Girl girl) {
		super(girl);
		this.setBrandName(brandName);
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	@Override
	public List<Girl> createAccessory(List<Girl> girls) {
		return super.createAccessory(girls);
	}
}
