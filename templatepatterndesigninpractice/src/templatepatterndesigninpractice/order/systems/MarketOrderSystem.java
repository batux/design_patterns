package templatepatterndesigninpractice.order.systems;

import java.util.ArrayList;
import java.util.List;

import templatepatterndesigninpractice.main.Money;

public class MarketOrderSystem extends OrderSystem {

	@Override
	public List<Product> selectProducts() {
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("Kola", new Money("TRY",6)));
		products.add(new Product("Meyve Suyu", new Money("TRY",5)));
		return products;
	}

	@Override
	public List<Money> calculateTaxFares(List<Product> products) {
		
		List<Money> taxes = new ArrayList<Money>();
		for(Product product : products) {
			double value = product.getProductAmount().getValue() + (product.getProductAmount().getValue() * 0.36);
			String currency = product.getProductAmount().getCurrency();
			Money taxAmount = new Money(currency, value);
			taxes.add(taxAmount);
		}
		return taxes;
	}

	@Override
	public Money calculateTotalFare(List<Product> products, List<Money> taxes) {
		
		Money totalFare = new Money(taxes.get(0).getCurrency(), 0);
		for(Money tax : taxes) {
			totalFare.setValue(totalFare.getValue() + tax.getValue());
		}
		
		totalFare.setValue(totalFare.getValue() + (totalFare.getValue() * 0.12));
		
		for(Product product : products) {
			totalFare.setValue(totalFare.getValue() + product.getProductAmount().getValue());
		}
		return totalFare;
	}

}
