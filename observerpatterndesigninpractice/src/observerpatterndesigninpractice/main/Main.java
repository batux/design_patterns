package observerpatterndesigninpractice.main;

import observerpatterndesigninpractice.notification.service.NewsNotificationService;
import observerpatterndesigninpractice.subscriber.NewsFollower;
import observerpatterndesigninpractice.subscriber.Subscriber;

/**
 * 
 * @author Batuhan Duzgun (batux) - Computer Engineer / Industrial Engineer
 * 
 *
 */

public class Main {

	public static void main(String[] args) {

		NewsNotificationService notificationService = new NewsNotificationService();
		
		Subscriber subscriber1 = new NewsFollower("Batuhan Duzgun");
		Subscriber subscriber2 = new NewsFollower("Zeynep Pelin");
		Subscriber subscriber3 = new NewsFollower("Cansu Peyrek");
		Subscriber subscriber4 = new NewsFollower("Mehmet Cavus");
		
		notificationService.register(subscriber1);
		notificationService.register(subscriber2);
		notificationService.register(subscriber3);
		notificationService.register(subscriber4);
		
		notificationService.postMessage("Champion Fenerbahce !");
		
		notificationService.unregister(subscriber3);
		
		notificationService.postMessage("Champion Akhisar !");
	}

}
