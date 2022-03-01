package com.isaachome.duck;

public class DuckFactoryAppRunner {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.performQuack();
		modelDuck.setFlyingBehavior(new FlyRocketPowered());
		modelDuck.performFly();
		
		
	}
}
