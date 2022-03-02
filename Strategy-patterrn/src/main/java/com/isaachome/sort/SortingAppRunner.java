package com.isaachome.sort;

public class SortingAppRunner {
	public static void main(String[] args) {
		int [] inums = {10,20,30,40,50};
		Context context = new Context(new QuickSort());
		context.arrange(inums);
		
		
		 context = new Context(new BubbleSort());
		 context.arrange(inums);
	}
}
