package org.howard.edu.lsp.assignment7.tollbooth;

public class FordTruck implements Truck {
	int axels;
	int weight;
	
	/**
	 * Creates a Ford Truck object
	 * @param axels
	 * @param weight
	 */
	public FordTruck(int axels, int weight) {
		this.axels = axels;
		this.weight = weight;
		
	}
	
	/**
	 * returns number of axles
	 */
	@Override
	public int getAxels() {
		return axels;
	}
	/**
	 * returns weight
	 */
	@Override
	public int getWeight() {
		return weight;
	}

}