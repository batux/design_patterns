package bridgepatterndesigninpractice.main;

public class Money {

	private double value;
	private String currency;
	
	public Money() {
		this.setValue(0.0);
		this.setCurrency(null);
	}
	
	public Money(double value, String currency) {
		this.setValue(value);
		this.setCurrency(currency);
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public Money add(Money money) {
		
		if(money != null) {
			if(this.getCurrency().equals(money.getCurrency())) {
				this.setValue(this.getValue() + money.getValue());
			}
		}
		return this;
	}
	
	public Money remove(Money money) {
		
		if(money != null) {
			if(this.getCurrency().equals(money.getCurrency())) {
				this.setValue(this.getValue() - money.getValue());
			}
		}
		return this;
	}

	@Override
	public String toString() {
		return "Money [value=" + value + ", currency=" + currency + "]";
	}
}
