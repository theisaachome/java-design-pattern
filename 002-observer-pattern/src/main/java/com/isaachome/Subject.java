package com.isaachome;

public interface Subject {
	public void register(Observer obs);
	public void unregister(Observer obs);
	public void notifyObserver();
}
