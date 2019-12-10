package com.cdk.shoppingcart.discount;

import java.util.Scanner;

public class GenerateDiscount {

	public static void main(String args[]) {

		Discount discount5000 = new Discount(new Double(5000), "Regular");
		Discounter.addDiscounter(discount5000, new Double(1));

		Discount discountMoreThan5000AndLessThan10000 = new Discount(new Double(10000), "Regular");
		Discounter.addDiscounter(discountMoreThan5000AndLessThan10000, new Double(10));

		Discount discountMoreThan10000 = new Discount(new Double(10001), "Regular");
		Discounter.addDiscounter(discountMoreThan10000, new Double(20));

		IDiscountRule discountRuleForUpTo5000 = new DiscountForUptoDollor5000();
		IDiscountRule discountRuleMoreThan5000AndLessThan10000 = new DiscountForUptoDollor5000To10000();
		IDiscountRule discountRuleMoreThan10000 = new DiscountForUptoDollor10000Above();

		discountRuleMoreThan10000.setNextRule(discountRuleMoreThan5000AndLessThan10000);
		discountRuleMoreThan5000AndLessThan10000.setNextRule(discountRuleForUpTo5000);

		while (true) {
			int amount = 0;
			System.out.println("Enter Bill to check discount");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			
			double billiedAmt = discountRuleMoreThan10000
					.calcualteDiscount(new Discount(new Double(amount), "Regular"));
			System.out.println("Billin Amount need to be paid : "+billiedAmt);
		}
	}

}
