package org.howard.edu.lsp.exam.question40;

public interface Animal {
	
	/**
	 * 
	 * @return default string for speak
	 */
	public default String speak() {
		return("This animal speaks.");
	}
	
	/**
	 * 
	 * @return default string for move
	 */
	public default String move() {
		return("This animal moves forward.");
	}
}
