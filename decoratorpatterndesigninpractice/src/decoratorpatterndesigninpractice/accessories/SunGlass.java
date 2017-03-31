package decoratorpatterndesigninpractice.accessories;

import java.util.List;

import decoratorpatterndesigninpractice.girls.Girl;

public class SunGlass extends GirlDesigner{

	private String brandName;
	
	public SunGlass(String brandName) {
		super();
		this.setBrandName(brandName);
	}
	
	public SunGlass(String brandName, Girl girl) {
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
