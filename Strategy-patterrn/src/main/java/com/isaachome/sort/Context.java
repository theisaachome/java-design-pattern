package com.isaachome.sort;

public class Context {
	private Strategy strategy;
	public Context(Strategy strategy) {
		this.strategy=strategy;
	}
	
	public void arrange(int[] inputs) {
		this.strategy.sort(inputs);
	}
}
