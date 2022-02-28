package com.isaachome.loan;

public class BusinessLoan extends Loan{

	@Override
	void getInterestRate(double rate) {
		super.rate=rate;
	}

}
