package org.howard.edu.lsp.assignment2.test;

import java.util.ArrayList;
import java.util.Arrays;

import org.howard.edu.lsp.assignment2.Combinations;


public class CombinationsDriver{
	/**
	 * 
	 * @param args
	 */
	  public static void main(String args[]) {
		  Combinations comb = new Combinations();
		  Integer[] nums = {3, 9, 8, 4, 5, 7, 10};
		  int sum = 15;
		  comb.findCombinations(new ArrayList<Integer>(Arrays.asList(nums)), sum);
		  
		  Combinations comb2 = new Combinations();
		  Integer[] nums2 = {5, 10, 3, 17, 2};
		  int sum2 = 27;
		  comb2.findCombinations(new ArrayList<Integer>(Arrays.asList(nums2)), sum2);
		  
		  Combinations comb3 = new Combinations();
		  Integer[] nums3 = {-3, 2, 5};
		  int sum3 = 2;
		  comb3.findCombinations(new ArrayList<Integer>(Arrays.asList(nums3)), sum3);
		  
		  Combinations comb4 = new Combinations();
		  Integer[] nums4 = {0};
		  int sum4 = 2;
		  comb4.findCombinations(new ArrayList<Integer>(Arrays.asList(nums4)), sum4);
	  }
}
