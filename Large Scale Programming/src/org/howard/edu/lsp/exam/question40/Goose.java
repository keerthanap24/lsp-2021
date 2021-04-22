package org.howard.edu.lsp.exam.question40;

public class Goose extends Flying implements Animal {
	public Goose() {	
	}

	@Override
	public String speak() {
		return("This goose speaks.");
	}
	
	@Override
	public String move() {
		return("This goose moves forward.");
	}
	
	@Override
	public String fly() {
		return("This goose is flying South.");
	}
}
