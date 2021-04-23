package org.howard.edu.lsp.assignment7.tollbooth;

public class AlleghenyTollBooth implements TollBooth {
	public int trucks_total;
	public int receipts_total;
	
	public AlleghenyTollBooth() {
		
	}
	
	/**
	 * returns cost of toll for truck t
	 * @param t
	 */
	@Override
	public int calculateToll(Truck t) {
		int total = (t.getAxels() * 5) + (t.getWeight()/100);
		trucks_total += 1;
		receipts_total += total;
		System.out.println(total);
		return total;
	}
	/**
	 * returns the current data
	 */
	@Override
	public int[] displayData() {
		System.out.println("Trucks: " + trucks_total + " Receipts: " + receipts_total);
		int[] n = new int[2];
		n[0] = trucks_total;
		n[1] = receipts_total;
		return n;
		
	}
	/**
	 * resets the current data and returns it
	 */
	@Override
	public int[] reset() {
		this.displayData();
		trucks_total = 0;
		receipts_total = 0;
		int[] intArray = new int[2];
		intArray [0] = trucks_total;
		intArray [1] = receipts_total;
		return intArray;
	}

}