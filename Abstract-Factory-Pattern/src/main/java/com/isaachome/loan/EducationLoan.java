package com.isaachome.loan;

public class EducationLoan extends Loan {

	@Override
	void getInterestRate(double rate) {
		super.rate = rate;
	}

}
