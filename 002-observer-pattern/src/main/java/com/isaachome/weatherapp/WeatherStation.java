package com.isaachome.weatherapp;

import java.util.List;

public class WeatherStation implements Subject {

	private List<Observer> observers;
	@Override
	public void registerObserver(Observer o) {
		
	}

	@Override
	public void removeObserver(Observer o) {
	}

	@Override
	public void notifyObservers() {		
	}

}
