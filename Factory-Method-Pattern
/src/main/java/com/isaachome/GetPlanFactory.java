package com.isaachome;

public class GetPlanFactory {
	public Plan getPlan(String planType) {

		return switch (planType.toLowerCase()) {
		case "d" -> new DomesticPlan();
		case "c" -> new CommercialPlan();
		case "i" -> new InstitutionalPlan();
		default -> null;
		};
	}
}
