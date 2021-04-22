package org.howard.edu.lsp.exam.question40;

public interface Animal {
	
	public default String speak() {
		return("This animal speaks.");
	}
	
	public default String move() {
		return("This animal moves forward.");
	}
}
