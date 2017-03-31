package bridgepatterndesigninpractice.taxes;

import bridgepatterndesigninpractice.main.Money;

public class KDVTax extends Tax {

	public KDVTax(Money amount) {
		super(amount);
	}

	@Override
	public Money calculateTax(boolean domestic) {
		
		double value = this.getAmount().getValue();
		if(!domestic) {
			value = value + (value * 0.178);
			this.getAmount().setValue(value);
		}
		return this.getAmount();
	}

}
