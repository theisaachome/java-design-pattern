package com.isaachome;

public class StockObserver implements Observer {

	private double imbPrice;
	private double aaplPrice;
	private double googPrice;
	private static int observerIDTracker =0;
	private int observerID = 0;
	
	private Subject stockGrabber;
	
	
	
	public StockObserver(Subject stockGrabber) {
		super();
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer " + this.observerID);
		stockGrabber.register(this);
	}



	@Override
	public void update(double imbPrice, double aaplePrice, double googPrice) {
		this.imbPrice = imbPrice;
		this.aaplPrice = aaplePrice;
		this.googPrice =googPrice;
		printThePrices();
	}
	
	public void printThePrices() {
		System.out.println(String.format(
				"%d \nIMB: %d\nAAPL: %d\nGOOG: %d", observerID,imbPrice,aaplPrice,googPrice));
	}

}
