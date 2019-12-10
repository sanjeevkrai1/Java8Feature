package com.cdk.shoppingcart.discount;

public class Discount {

	private Double amount;
	private String customerType;

	public Discount(Double amount, String customerType) {
		super();
		this.amount = amount;
		this.customerType = customerType;
	}

	public Double getAmount() {
		return amount;
	}

	public String getCustomerType() {
		return customerType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((customerType == null) ? 0 : customerType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discount other = (Discount) obj;
		if (amount == null) {
			if (other.amount != null)
				return false;
		} else if (!amount.equals(other.amount))
			return false;
		if (customerType == null) {
			if (other.customerType != null)
				return false;
		} else if (!customerType.equals(other.customerType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("BillingAmount [amount=%s, customerType=%s]", amount, customerType);
	}

}
