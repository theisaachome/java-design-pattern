package com.isaachome.bank;

public class AyaBank implements Bank {

	private String name;
	public AyaBank(String name) {
		this.name =name;
	}
	@Override
	public String getBankName() {
		return name;
	}

}
