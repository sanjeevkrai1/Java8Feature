package com.cdk.shoppingcart.discount;

import java.util.function.Predicate;

public class DiscountForUptoDollor5000 implements IDiscountRule {

	private IDiscountRule nextRule;

	@Override
	public void setNextRule(IDiscountRule nextRule) {
		this.nextRule = nextRule;
	}

	@Override
	public Double calcualteDiscount(Discount billing) {
		Predicate<Discount> predicate5000 = (dis) -> dis.getAmount() <= new Double(5000);
		if(predicate5000.test(billing)) {
			System.out.println("Billing Amount should be $" + billing.getAmount());
			return billing.getAmount();
		}else {
			return nextRule.calcualteDiscount(billing);
		}

	}

}
