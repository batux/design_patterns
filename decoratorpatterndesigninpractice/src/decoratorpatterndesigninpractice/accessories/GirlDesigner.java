package decoratorpatterndesigninpractice.accessories;

import java.util.List;

import decoratorpatterndesigninpractice.girls.Girl;

public class GirlDesigner extends Girl{

	protected Girl girl;
	protected Girl baseGirl;
	
	public GirlDesigner() {
		super();
	}
	
	public GirlDesigner(Girl girl) {
		super();
		this.girl = girl;
	}
	
	public void setBaseGirl(Girl baseGirl) {
		this.baseGirl = baseGirl;
	}
	
	@Override
	public List<Girl> createAccessory(List<Girl> girls) {
		girls.add(this);
		return this.girl.createAccessory(girls);
	}

}
