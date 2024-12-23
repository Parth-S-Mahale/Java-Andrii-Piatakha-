package com.parth.learnit.javacore.oop.classes.typesofclasses;

public class VariantProduct extends Product{
	
	private MasterProduct[] variants;
	
	@Override
	public boolean isAvailableInStock() {
		for(MasterProduct masterproduct : variants) {
			if(masterproduct.isAvailableInStock()) {
				return true;
			}
		}
		return false;
	}
}
