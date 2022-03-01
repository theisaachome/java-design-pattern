package com.isaachome.duck;

public class FlyNoWay implements FlyingBehavior {

	@Override
	public void fly() {
		System.out.println("Duck can not fly..");
	}

}
