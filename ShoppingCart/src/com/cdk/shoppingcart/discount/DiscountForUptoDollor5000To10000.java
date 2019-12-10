package com.cdk.shoppingcart.discount;

import java.util.function.Predicate;

public class DiscountForUptoDollor5000To10000 implements IDiscountRule {

	private IDiscountRule nextRule;
	
	@Override
	public void setNextRule(IDiscountRule nextRule) {
		this.nextRule = nextRule;
	}

	@Override
	public Double calcualteDiscount(Discount billing) {

		Predicate<Discount> predicate5000 = (dis) -> (dis.getAmount() >= new Double(5000) && dis.getAmount() <= new Double(10000));
		if(predicate5000.test(billing)) {
			
			Double discountInPrecentage = Discounter.getMap().get(new Discount(new Double(10000), "Regular"));
			double newBillingAmt = (billing.getAmount()*discountInPrecentage)/100;
			System.out.println("Billing Amount should be $" + (billing.getAmount() - newBillingAmt));
			return (billing.getAmount() - newBillingAmt);
		}else {
			return nextRule.calcualteDiscount(billing);
		}
	
	}

}
