package templatepatterndesigninpractice.main;

public class Money {

	private String currency;
	private double value;
	
	public Money(String currency, double value) {
		this.setCurrency(currency);
		this.setValue(value);
	}
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Money [currency=" + currency + ", value=" + value + "]";
	}
}
