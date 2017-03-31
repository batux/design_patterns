package templatepatterndesigninpractice.payment.systems;

import templatepatterndesigninpractice.main.Money;

public abstract class PaymentSystem {

	public final Money makePayment(Money money, PaymentType paymentType) {
		
		if(PaymentType.CREDIT_CARD == paymentType) {
			makeCreditCardPayment(money);
		}
		else if(PaymentType.SOFORT == paymentType) {
			makeSofortPayment(money);
		}
		else if(PaymentType.EFT == paymentType) {
			makeEftPayment(money);
		}
		else if(PaymentType.PAYPAL == paymentType) {
			makePaypalPayment(money);
		}
		else if(PaymentType.AMEX == paymentType) {
			makeAmexPayment(money);
		}
		
		return money;
	}
	
	private void makeCreditCardPayment(Money money) {
		System.out.println(money);
	}
	
	private void makeSofortPayment(Money money) {
		System.out.println(money);
	}

	private void makeEftPayment(Money money) {
		System.out.println(money);
	}
	
	private void makePaypalPayment(Money money) {
		System.out.println(money);
	}
	
	private void makeAmexPayment(Money money) {
		System.out.println(money);
	}
}
