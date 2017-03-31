package templatepatterndesigninpractice.order.systems;

import java.util.ArrayList;
import java.util.List;

import templatepatterndesigninpractice.main.Money;

public class ECommerceOrderSystem extends OrderSystem {

	@Override
	public List<Product> selectProducts() {
		
		// Products comes from database
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("Kola", new Money("TRY",6)));
		products.add(new Product("Piskevit", new Money("TRY",3)));
		products.add(new Product("Dondurma", new Money("TRY",12)));
		products.add(new Product("Meyve Suyu", new Money("TRY",5)));
		return products;
	}

	@Override
	public List<Money> calculateTaxFares(List<Product> products) {
		
		List<Money> taxes = new ArrayList<Money>();
		for(Product product : products) {
			double value = product.getProductAmount().getValue() + (product.getProductAmount().getValue() * 0.56);
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
		
		totalFare.setValue(totalFare.getValue() + (totalFare.getValue() * 0.33));
		
		for(Product product : products) {
			totalFare.setValue(totalFare.getValue() + product.getProductAmount().getValue());
		}
		return totalFare;
		
	}

}
