package bridgepatterndesigninpractice.tickets;

import bridgepatterndesigninpractice.main.Money;
import bridgepatterndesigninpractice.taxes.Tax;

public class CinemaTicket extends Ticket {

	public CinemaTicket(String code, String number, Money baseFare, boolean domestic) {
		super(code, number, baseFare, domestic);
	}

	@Override
	public Money calculateTotalFare() {
		
		Money totalTaxAmount = calculateTax();
		if(!this.isDomestic()) {
			this.getBaseFare().setValue((this.getBaseFare().getValue() + (this.getBaseFare().getValue() * 0.1)));
		}
		Money totalFareAmount = this.getBaseFare().add(totalTaxAmount);
		return totalFareAmount;
	}

	@Override
	protected Money calculateTax() {
		
		String currency = this.getTaxes().get(0).getAmount().getCurrency();
		Money totalTaxAmount = new Money(0,currency);
		for(Tax tax : this.getTaxes()) {
			totalTaxAmount.add(tax.calculateTax(domestic));
		}
		
		if(!this.isDomestic()) {
			totalTaxAmount.setValue((totalTaxAmount.getValue() * 0.1));
		}
		return totalTaxAmount;
	}

}
