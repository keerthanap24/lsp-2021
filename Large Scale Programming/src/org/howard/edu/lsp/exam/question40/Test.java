package org.howard.edu.lsp.exam.question40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;


class Test {

	@org.junit.jupiter.api.Test
	@DisplayName("Test case for speak")
	void testSpeak() {
		Animal goose_test = new Goose();
		Animal tiger_test = new Tiger();
		assertEquals("This goose speaks.", goose_test.speak());
		assertEquals("This tiger speaks.", tiger_test.speak());
		
	}

	@org.junit.jupiter.api.Test
	@DisplayName("Test case for move")
	void testMove() {
		Animal goose_test = new Goose();
		Animal tiger_test = new Tiger();
		assertEquals("This goose moves forward.", goose_test.move());
		assertEquals("This tiger moves forward.", tiger_test.move());
	}

	@org.junit.jupiter.api.Test
	@DisplayName("Test case for fly")
	void testFly() {
		Flying goose_test = new Goose();
		Flying airplane_test = new Airplane();
		assertEquals("This goose is flying South.", goose_test.fly());
		assertEquals("This airplane is flying to Washington, DC.", airplane_test.fly());
	}
}
