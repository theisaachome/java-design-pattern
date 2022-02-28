package com.isaachome.bank;

public class KBZBank implements Bank {

	private String name;
	public KBZBank(String name) {
		this.name=name;
	}
	@Override
	public String getBankName() {
		return name;
	}

}
