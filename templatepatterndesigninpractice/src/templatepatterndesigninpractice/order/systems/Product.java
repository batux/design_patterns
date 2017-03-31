package templatepatterndesigninpractice.order.systems;

import templatepatterndesigninpractice.main.Money;

public class Product {

	private Money productAmount;
	private String name;
	
	public Product(String name, Money amount) {
		this.setName(name);
		this.setProductAmount(amount);
	}
	
	public Money getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(Money productAmount) {
		this.productAmount = productAmount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
