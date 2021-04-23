package org.howard.edu.lsp.assignment7.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment7.tollbooth.AlleghenyTollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.FordTruck;
import org.howard.edu.lsp.assignment7.tollbooth.NissanTruck;
import org.howard.edu.lsp.assignment7.tollbooth.TollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.Truck;
import org.junit.jupiter.api.Test;

class AlleghenyTollBoothTest {

	@Test
	void testCalculateToll() {
		TollBooth booth = new AlleghenyTollBooth();
		Truck ford = new FordTruck(5, 12000); 
		int value = booth.calculateToll(ford);
		assertEquals(145,value);
	}

	@Test
	void testDisplayData() {
		TollBooth booth = new AlleghenyTollBooth();
		Truck ford = new FordTruck(5, 12000);
		Truck nissan = new NissanTruck(2, 5000);
		booth.calculateToll(ford);
		booth.calculateToll(nissan);
		int[] list = booth.displayData();
		if (list[0] == 2 && list[1] == 205) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
	}

	@Test
	void testReset() {
		TollBooth booth = new AlleghenyTollBooth();
		Truck ford = new FordTruck(5, 12000);
		Truck nissan = new NissanTruck(2, 5000);
		booth.calculateToll(ford);
		booth.calculateToll(nissan);
		int[] list = booth.reset();
		if (list[0] == 0 && list[1] == 0) {
			assertTrue(true);
		}
		else {
			assertTrue(false);
		
		}
	}

}
