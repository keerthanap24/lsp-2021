package org.howard.edu.lsp.exam.question40;

public class Goose extends Flying implements Animal {
	public Goose() {	
	}

	/**
	 * @Override speak method
	 * @return new speak string for goose
	 */
	public String speak() {
		return("This goose speaks.");
	}
	
	/**
	 * @Override move method
	 * @return new move string for goose
	 */
	public String move() {
		return("This goose moves forward.");
	}
	
	/**
	 * @Override fly method
	 * @return new fly string for goose
	 */
	public String fly() {
		return("This goose is flying South.");
	}
}
