package observerpatterndesigninpractice.notification.service;

import observerpatterndesigninpractice.subscriber.Subscriber;

public interface NotificationService {

	public void register(Subscriber subscriber);
	public void unregister(Subscriber subscriber);
	
	public void notifySubscribers(String message);
	
	public void postMessage(String message);
}
