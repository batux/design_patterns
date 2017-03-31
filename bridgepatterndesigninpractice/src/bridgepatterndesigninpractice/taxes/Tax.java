package bridgepatterndesigninpractice.taxes;

import bridgepatterndesigninpractice.main.Money;

public abstract class Tax {

	protected Money amount;
	
	public Money getAmount() {
		return amount;
	}

	public void setAmount(Money amount) {
		this.amount = amount;
	}

	public Tax(Money amount) {
		this.amount = amount;
	}
	
	public abstract Money calculateTax(boolean domestic);
}