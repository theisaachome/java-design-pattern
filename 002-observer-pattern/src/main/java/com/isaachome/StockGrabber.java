package com.isaachome;

import java.util.ArrayList;

public class StockGrabber  implements Subject{
	
	private ArrayList<Observer> observers;
	private double imbPrice;
	private double aaplPrice;
	private double googPrice;
	
	

	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		System.out.println("Observer " + (observerIndex+1) + " deleted.");
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(imbPrice, aaplPrice, googPrice);
			
		}
	}

	public void setImbPrice(double imbPrice) {
		this.imbPrice = imbPrice;
		notifyObserver();
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}
	
	

	
}
