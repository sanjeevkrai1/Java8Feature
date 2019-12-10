package com.cdk.shoppingcart.discount.test.cases;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cdk.shoppingcart.discount.Discount;
import com.cdk.shoppingcart.discount.DiscountForUptoDollor10000Above;
import com.cdk.shoppingcart.discount.DiscountForUptoDollor5000;
import com.cdk.shoppingcart.discount.DiscountForUptoDollor5000To10000;
import com.cdk.shoppingcart.discount.Discounter;
import com.cdk.shoppingcart.discount.IDiscountRule;

class DiscountForUptoDollor5000To10000Test {

	
	private static Map<Discount, Double> map = new HashMap<>();
	private IDiscountRule discountRuleForUpTo5000;
	private IDiscountRule discountRuleMoreThan5000AndLessThan10000;
	private IDiscountRule discountRuleMoreThan10000;
	private Discount  discountPositive;
	private Discount  discountNegative;
	private Discount discountNegativeMinus;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Discount discount5000 = new Discount(new Double(5000), "Regular");
		Discounter.addDiscounter(discount5000, new Double(1));

		Discount discountMoreThan5000AndLessThan10000 = new Discount(new Double(10000), "Regular");
		Discounter.addDiscounter(discountMoreThan5000AndLessThan10000, new Double(10));

		Discount discountMoreThan10000 = new Discount(new Double(10001), "Regular");
		Discounter.addDiscounter(discountMoreThan10000, new Double(20));
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		map.clear();
	}

	@BeforeEach
	void setUp() throws Exception {
		discountRuleForUpTo5000 = new DiscountForUptoDollor5000();
		discountRuleMoreThan5000AndLessThan10000 = new DiscountForUptoDollor5000To10000();
		discountRuleMoreThan10000 = new DiscountForUptoDollor10000Above();
		
		discountRuleMoreThan10000.setNextRule(discountRuleMoreThan5000AndLessThan10000);
		discountRuleMoreThan5000AndLessThan10000.setNextRule(discountRuleForUpTo5000);
		discountPositive = new Discount(new Double(5500), "REGULAR");
		discountNegative = new Discount(new Double(0), "REGULAR");
		discountNegativeMinus = new Discount(new Double(-1), "REGULAR");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuccess() {
		Double calcualteDiscount = discountRuleMoreThan10000.calcualteDiscount(discountPositive);
		assertEquals(calcualteDiscount != null && calcualteDiscount > 0, true);
	}
	
	@Test
	void testNegative() {
		Double calcualteDiscount = discountRuleMoreThan10000.calcualteDiscount(discountNegative);
		assertEquals(calcualteDiscount != null && calcualteDiscount == 0, true);
	}
	
	@Test
	void testNegative1() {
		Double calcualteDiscount = discountRuleMoreThan10000.calcualteDiscount(discountNegativeMinus);
		assertEquals(calcualteDiscount != null && calcualteDiscount <= 0, true);
	}


}
