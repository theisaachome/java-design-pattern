package com.isaachome.duck;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyingBehavior = new FlyNoWay();
		quackBehavior = new Squack();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a model duck.");
	}

}
