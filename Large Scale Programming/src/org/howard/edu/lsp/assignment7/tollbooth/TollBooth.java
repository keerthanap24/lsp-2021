package org.howard.edu.lsp.assignment7.tollbooth;

public interface TollBooth {
	
	/**
	 * returns toll of truck t
	 * @param t
	 * @return
	 */
	public int calculateToll(Truck t);
	
	/**
	 * returns data
	 * @return
	 */
	public int[] displayData();
	
	/**
	 * resets data and returns it
	 * @return
	 */
	public int[] reset();
	
	
	

}