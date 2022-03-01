package com.isaachome.duck;

public class MallardDuck extends Duck {
	public MallardDuck() {
		flyingBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	@Override
	public void display() {
		System.out.println("Mallard duck display...");
	}
}
