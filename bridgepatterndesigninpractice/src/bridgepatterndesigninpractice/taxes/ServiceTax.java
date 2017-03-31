package bridgepatterndesigninpractice.taxes;

import bridgepatterndesigninpractice.main.Money;

public class ServiceTax extends Tax {

	public ServiceTax(Money amount) {
		super(amount);
	}

	@Override
	public Money calculateTax(boolean domestic) {
		
		double value = this.getAmount().getValue();
		if(!domestic) {
			value = value + (value * 0.11);
			this.getAmount().setValue(value);
		}
		return this.getAmount();
	}

}
