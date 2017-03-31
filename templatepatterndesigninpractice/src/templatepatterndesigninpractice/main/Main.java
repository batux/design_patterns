package templatepatterndesigninpractice.main;

import templatepatterndesigninpractice.order.systems.ECommerceOrderSystem;
import templatepatterndesigninpractice.order.systems.MarketOrderSystem;
import templatepatterndesigninpractice.order.systems.OrderSystem;
import templatepatterndesigninpractice.payment.systems.IBMPaymentSystem;
import templatepatterndesigninpractice.payment.systems.NCRPaymentSystem;
import templatepatterndesigninpractice.payment.systems.PaymentType;

/**
 * 
 * @author Batuhan Duzgun (batux) - Computer Engineer / Industrial Engineer
 * 
 *
 */

public class Main {

	public static void main(String[] args) {
		
		OrderSystem orderSystem1 = new ECommerceOrderSystem();
		OrderSystem orderSystem2 = new MarketOrderSystem();
		
		orderSystem1.createOrder(
			new User.UserBuilder("Batuhan", "Duzgun").
				setEMail("b@b.com").
				setPhoneNumber("5078995959"), new IBMPaymentSystem(), PaymentType.CREDIT_CARD, true);
		
		orderSystem2.createOrder(
			new User.UserBuilder("Cansu", "Karasu").
				setEMail("c@c.com").
				setPhoneNumber("5078935959"), new NCRPaymentSystem(), PaymentType.PAYPAL, false);
	}

}
