package org.howard.edu.lsp.exam.question40;

public class Tiger implements Animal {
	public Tiger() {
		
	}

	/**
	 * @Override speak method
	 * @return new speak string for tiger
	 */
	public String speak() {
		return("This tiger speaks.");
	}
	
	/**
	 * @Override move method
	 * @return new move string for tiger
	 */
	public String move() {
		return("This tiger moves forward.");
	}
}
