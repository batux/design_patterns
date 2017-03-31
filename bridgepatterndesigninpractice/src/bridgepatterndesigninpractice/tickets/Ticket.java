package bridgepatterndesigninpractice.tickets;

import java.util.ArrayList;
import java.util.List;

import bridgepatterndesigninpractice.main.Money;
import bridgepatterndesigninpractice.taxes.Tax;

public abstract class Ticket {

	protected String code;
	protected String number;
	protected Money baseFare;
	protected boolean domestic;
	protected List<Tax> taxes;
	
	public Ticket(String code, String number, Money baseFare, boolean domestic) {
		this.setCode(code);
		this.setNumber(number);
		this.setBaseFare(baseFare);
		this.setDomestic(domestic);
		this.setTaxes(new ArrayList<Tax>());
	}
	
	public boolean isDomestic() {
		return domestic;
	}

	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}
	
	public List<Tax> getTaxes() {
		return taxes;
	}

	public void setTaxes(List<Tax> taxes) {
		this.taxes = taxes;
	}

	public Money getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(Money baseFare) {
		this.baseFare = baseFare;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public void addTax(Tax tax) {
		this.getTaxes().add(tax);
	}
	
	public Tax removeTax(int index) {
		return this.getTaxes().remove(index);
	}
	
	public Tax removeTax(Tax tax) {
		this.getTaxes().remove(tax);
		return tax;
	}
	
	public abstract Money calculateTotalFare();
	protected abstract Money calculateTax();
}
