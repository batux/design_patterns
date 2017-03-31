package bridgepatterndesigninpractice.main;

import bridgepatterndesigninpractice.taxes.KDVTax;
import bridgepatterndesigninpractice.taxes.OTVTax;
import bridgepatterndesigninpractice.taxes.ServiceTax;
import bridgepatterndesigninpractice.tickets.BusTicket;
import bridgepatterndesigninpractice.tickets.CinemaTicket;

/**
 * 
 * @author Batuhan Duzgun (batux) - Computer Engineer / Industrial Engineer
 * 
 *
 */

public class Main {

	public static void main(String[] args) {
		
		BusTicket busTicket = new BusTicket(
									"BUS", 
									"AD2SN1N6A99", 
									new Money(250, "EURO"), true);
		
		busTicket.addTax(new KDVTax(new Money(1.5,"EURO")));
		busTicket.addTax(new OTVTax(new Money(3.2,"EURO")));
		busTicket.addTax(new ServiceTax(new Money(1.0,"EURO")));
		
		///////////////////////////////////////////////////////////////
		
		CinemaTicket cinemaTicket = new CinemaTicket(
									"CNM", 
									"TC2SS1ASA89", 
									new Money(20, "TRY"), false);
		
		cinemaTicket.addTax(new KDVTax(new Money(0.7,"TRY")));
		cinemaTicket.addTax(new OTVTax(new Money(2.2,"TRY")));
		cinemaTicket.addTax(new ServiceTax(new Money(0.9,"TRY")));
		
		
		System.out.println("Bus Ticket Total Fare : " + busTicket.calculateTotalFare());
		System.out.println("Cinema Ticket Total Fare : " + cinemaTicket.calculateTotalFare());
	}

}
