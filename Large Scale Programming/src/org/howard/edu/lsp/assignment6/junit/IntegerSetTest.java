package org.howard.edu.lsp.assignment6.junit;


import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class IntegerSetTest {

	@Test
	@DisplayName("Test for clear method")
	void testClear() {
		IntegerSet test = new IntegerSet();
		test.add(1);
		int value = test.length();
		test.clear();
		value = test.length();
		//test array after cleared
		assertEquals(0, value);
	}

	@Test
	@DisplayName("Test for length method")
	void testLength() {
		IntegerSet test = new IntegerSet();
		test.add(1);
		test.add(3);
		test.add(7);
		test.add(8);
		int value = test.length();
		assertEquals(4, value);
	}

	@Test
	@DisplayName("Test for equals method")
	void testEqualsIntegerSet() {
		IntegerSet test = new IntegerSet();
		test.add(1);
		test.add(3);
		test.add(7);
		test.add(8);
		IntegerSet test2 = new IntegerSet();
		test2.add(1);
		test2.add(3);
		test2.add(7);
		test2.add(8);
		Boolean value = test.equals(test2);
		assertEquals(true, value);
		
		
	}

	@Test
	@DisplayName("Test for contains method")
	void testContains() {
		IntegerSet test = new IntegerSet();
		test.add(1);
		test.add(3);
		test.add(7);
		test.add(8);
		boolean value = test.contains(7);
		assertEquals(true, value);
		value = test.contains(5);
		assertEquals(false, value);
	}

	@Test
	@DisplayName("Test for largest method")
	void testLargest() {
		IntegerSet test = new IntegerSet();
		test.add(1);
		test.add(3);
		test.add(7);
		test.add(8);
		int value = 0;
		try {
			value = test.largest();
		}catch (IntegerSetException e) {
			e.printStackTrace();
			fail("Empty Array");
		}
		assertEquals(8, value);
	}

	@Test
	@DisplayName("Test for smallest method")
	void testSmallest() {
		IntegerSet test = new IntegerSet();
		test.add(1);
		test.add(3);
		test.add(7);
		test.add(8);
		int value = 0;
		try {
			value = test.smallest();
		}catch (IntegerSetException e) {
			e.printStackTrace();
			fail("Empty Array");
		}
		assertEquals(1, value);
	}

	@Test
	@DisplayName("Test for add method")
	void testAdd() {
		IntegerSet test = new IntegerSet();
		test.add(5);
		test.add(5);
		test.add(6);
		test.add(6);
		test.add(7);
		test.add(7);
		test.add(8);
		test.add(8);
		IntegerSet value = test;
		IntegerSet expected = new IntegerSet();
		expected.add(5);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		assertTrue(expected.equals(value));
	}

	@Test
	@DisplayName("Test for remove method")
	void testRemove() {
		IntegerSet test = new IntegerSet();
		test.add(5);
		test.add(6);
		test.add(7);
		test.add(8);
		test.remove(8);
		IntegerSet value = test;
		IntegerSet expected = new IntegerSet();
		expected.add(5);
		expected.add(6);
		expected.add(7);
		assertTrue(expected.equals(value));
	}

	@Test
	@DisplayName("Test for union method")
	void testUnion() {
		IntegerSet test = new IntegerSet();
		test.add(1);
		test.add(3);
		test.add(5);
		IntegerSet test2 = new IntegerSet();
		test2.add(2);
		test2.add(4);
		test2.add(6);
		test.union(test2);
		IntegerSet value = test;
		IntegerSet expected = new IntegerSet();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		expected.add(6);
		assertTrue(expected.equals(value));
	}

	@Test
	@DisplayName("Test for intersect method")
	void testIntersect() {
		IntegerSet test = new IntegerSet();
		test.add(1);
		test.add(3);
		test.add(5);
		IntegerSet test2 = new IntegerSet();
		test2.add(3);
		test2.add(5);
		test.intersect(test2);
		IntegerSet value = test;
		IntegerSet expected = new IntegerSet();
		expected.add(3);
		expected.add(5);
		assertTrue(expected.equals(value));
	}

	@Test
	@DisplayName("Test for diff method")
	void testDiff() {
		IntegerSet test = new IntegerSet();
		test.add(1);
		test.add(3);
		test.add(5);
		IntegerSet test2 = new IntegerSet();
		test2.add(3);
		test2.add(5);
		test.diff(test2);
		IntegerSet value = test;
		IntegerSet expected = new IntegerSet();
		expected.add(1);
		assertTrue(expected.equals(value));
	}

	@Test
	@DisplayName("Test for isEmpty method")
	void testIsEmpty() {
		IntegerSet test = new IntegerSet();
		Boolean value = test.isEmpty();
		assertEquals(true, value);
		
	}

	@Test
	@DisplayName("Test for toString method")
	void testToString() {
		IntegerSet test = new IntegerSet();
		test.add(1);
		test.add(3);
		test.add(5);
		String value = test.toString();
		assertEquals("[1, 3, 5]", value);
	}

}
