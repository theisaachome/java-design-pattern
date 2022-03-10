package com.isaachome.youtube;

import java.util.ArrayList;
import java.util.List;

// Subject
public class Channel {

	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	private String title;
	
//	register the event
	public void subscribe(Subscriber sub) {
		this.subscribers.add(sub);
	}
//	unregister 
	public void unsubscribe(Subscriber sub) {
		this.subscribers.remove(sub);
	}
	public void notifySubscribers() {
		for (Subscriber subscriber : subscribers) {
			subscriber.update();
		}
	}
	public void uploadVideo(String title) {
		
	}
}
