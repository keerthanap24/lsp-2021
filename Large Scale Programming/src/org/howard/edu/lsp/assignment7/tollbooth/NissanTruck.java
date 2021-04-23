package org.howard.edu.lsp.assignment7.tollbooth;

public class NissanTruck implements Truck {
	int axels;
	int weight;
	
	/**
	 * Constructs a Nissan Truck object
	 * @param axels
	 * @param weight
	 */
	public NissanTruck(int axels, int weight) {
		this.axels = axels;
		this.weight = weight;
		
	}
	
	/**
	 * returns the number of axles on the car
	 */
	@Override
	public int getAxels() {
		return axels;
	}
	
	/**
	 * returns the weight of the car
	 */
	@Override
	public int getWeight() {
		return weight;
	}
	
}