package bridgepatterndesigninpractice.taxes;

import bridgepatterndesigninpractice.main.Money;

public class OTVTax extends Tax {

	public OTVTax(Money amount) {
		super(amount);
	}

	@Override
	public Money calculateTax(boolean domestic) {
		
		double value = this.getAmount().getValue();
		if(!domestic) {
			value = value + (value * (0.213));
			this.getAmount().setValue(value);
		}
		return this.getAmount();
	}

}
