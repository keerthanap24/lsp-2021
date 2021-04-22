package org.howard.edu.lsp.exam.question41;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class RemoveZerosTest {

	@Test
	void testRemoveZeros() {
		ArrayList<Integer> test_list = new ArrayList<>(Arrays.asList(0, 7, 2, 0, 0, 4, 0));
		ArrayList<Integer> new_list = new ArrayList<>(Arrays.asList(7, 2, 4));
		assertEquals(new_list, RemoveZeros.removeZeros(test_list));
	}

}
