package templatepatterndesigninpractice.order.systems;

import java.util.List;

import templatepatterndesigninpractice.main.Money;
import templatepatterndesigninpractice.main.User;
import templatepatterndesigninpractice.payment.systems.PaymentSystem;
import templatepatterndesigninpractice.payment.systems.PaymentType;

public abstract class OrderSystem {

	public final void createOrder(User user, PaymentSystem paymentSystem, PaymentType paymentType, boolean smsOrEmail) {
		
		Money totalFare = makePayment(
								calculateTotalFare(
										selectProducts(), 
										calculateTaxFares(selectProducts())), paymentSystem, paymentType);
		
		if(smsOrEmail) {
			sendSms(user);
		}
		else {
			sendMail(user);
		}
		
		printInvoice(totalFare);
	}
	
	public abstract List<Product> selectProducts();
	
	public abstract List<Money> calculateTaxFares(List<Product> products);
	
	public abstract Money calculateTotalFare(List<Product> products, List<Money> taxes);
	
	public Money makePayment(Money totalFare, PaymentSystem paymentSystem, PaymentType paymentType) {
		return paymentSystem.makePayment(totalFare, paymentType);
	}
	
	public void sendSms(User user) {
		System.out.println("Message sended to : " + user);
	}
	
	public void sendMail(User user) {
		System.out.println("Mail sended to : " + user);
	}
	
	public void printInvoice(Money totalFare) {
		System.out.println("Total Amount : " + totalFare);
	}
}
