package com.cdk.shoppingcart.discount;

import java.util.HashMap;
import java.util.Map;

public class Discounter {
	
	private static Map<Discount, Double> map = new HashMap<>();
	
	public static void addDiscounter(Discount discount , Double discountInPercent) {
		map.put(discount, discountInPercent);
	}
	
	public static void removeDiscounter(Discount discount , Double discountInPercent) {
		map.remove(discount);
	}

	public static Map<Discount, Double> getMap() {
		return map;
	}

}
