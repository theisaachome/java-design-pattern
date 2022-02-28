package com.isaachome.bank;

public class YomaBank  implements Bank{

	private String name;
	public YomaBank(String name) {
		this.name=name;
	}
	@Override
	public String getBankName() {
		return name;
	}

}
