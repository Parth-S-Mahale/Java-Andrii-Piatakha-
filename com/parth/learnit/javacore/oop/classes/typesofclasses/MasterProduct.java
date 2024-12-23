package com.parth.learnit.javacore.oop.classes.typesofclasses;

public class MasterProduct extends Product{
	@SuppressWarnings("unused")
	private boolean isAvailableForLease;
	
	@Override
	public boolean isAvailableInStock() {
		return getRemainingAmountInStock() > 0;
	}
}
