package com.isaachome.duck;

public class MutedDuck implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Duck is Silent.");
	}

}
