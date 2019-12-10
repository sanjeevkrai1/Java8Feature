package com.cdk.shoppingcart.discount;

import java.util.function.Predicate;

public class DiscountForUptoDollor10000Above implements IDiscountRule {

	private IDiscountRule nextRule;

	@Override
	public void setNextRule(IDiscountRule nextRule) {
		this.nextRule = nextRule;
	}

	@Override
	public Double calcualteDiscount(Discount billing) {
		Predicate<Discount> predicate10000Above = (dis) -> (dis.getAmount() > new Double(10000));
		if(predicate10000Above.test(billing)) {
			
			Double discountInPrecentage = Discounter.getMap().get(new Discount(new Double(10001), "Regular"));
			double newBillingAmt = (billing.getAmount()*discountInPrecentage)/100;
			System.out.println("Billing Amount should be $" + newBillingAmt);
			return (billing.getAmount() - newBillingAmt);
		}else {
			return nextRule.calcualteDiscount(billing);
		}
	
	}

}
