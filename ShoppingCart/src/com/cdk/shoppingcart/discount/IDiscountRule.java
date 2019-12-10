package com.cdk.shoppingcart.discount;

public interface IDiscountRule {
	public void setNextRule(IDiscountRule nextRule);
	public Double calcualteDiscount( Discount currency );
}
