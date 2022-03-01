package com.isaachome.duck;

public abstract class Duck {
	
	FlyingBehavior flyingBehavior;
	QuackBehavior quackBehavior;
	public void  performQuack() {
		quackBehavior.quack();
	}

	public abstract void display();
	
	public void setFlyingBehavior(FlyingBehavior flyingBehavior) {
		this.flyingBehavior = flyingBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void performFly() {
		flyingBehavior.fly();
	}
	public void swim() {
		System.out.println("Duck is Swiming..");
	}
}
