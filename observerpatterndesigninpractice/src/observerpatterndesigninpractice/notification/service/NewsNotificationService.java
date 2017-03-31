package observerpatterndesigninpractice.notification.service;

import java.util.ArrayList;
import java.util.List;

import observerpatterndesigninpractice.subscriber.Subscriber;

public class NewsNotificationService implements NotificationService{

	private List<Subscriber> subscribers;
	private boolean changed;
	private final Object MUTEX = new Object();
	
	public NewsNotificationService() {
		this.changed = false;
		this.subscribers = new ArrayList<Subscriber>();
	}
	
	@Override
	public void register(Subscriber subscriber) {
		
		if(subscriber == null) throw new NullPointerException("You can not add empty subscriber!");
		synchronized (MUTEX) {
			this.subscribers.add(subscriber);
		}
	}

	@Override
	public void unregister(Subscriber subscriber) {
		synchronized (MUTEX) {
			this.subscribers.remove(subscriber);
		}
	}

	@Override
	public void notifySubscribers(String message) {
		
		List<Subscriber> subscribersLocal = null;
		synchronized (MUTEX) {
			if(!this.changed) return;
			subscribersLocal = new ArrayList<Subscriber>(this.subscribers);
			this.changed = false;
		}
		
		if(subscribersLocal != null) {
			for(Subscriber subscriber : subscribersLocal) {
				subscriber.receiveMessage(message);
			}
		}
	}

	@Override
	public void postMessage(String message) {
		this.changed = true;
		notifySubscribers(message);
	}

}
