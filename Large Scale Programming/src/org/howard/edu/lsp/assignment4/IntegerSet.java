package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * 
 * @author keerthana
 *
 */
public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	ArrayList<Integer> set = new ArrayList<Integer>();

	/**
	 * Clears the internal representation of the set
	 */
	public void clear() {
		set.removeAll(set);
	};
	
	/**
	 * 
	 * @return the length of the set
	 */
	public int length() {
		return set.size();
	}; 
	
	/**
	 * 
	 * @return the set of the IntegerSet object
	 */
	public ArrayList<Integer> getSet() {
		return this.set;
	};

	/**
	 * 
	 * @param b
	 * @return true if the 2 sets are equal, regardless of order, false otherwise
	 */
	public <T> boolean equals(IntegerSet b) {
		ArrayList<Integer> b2 = b.getSet();
		return new HashSet<>(set).equals(new HashSet<>(b2));
	}; 
	
	
	/**
	 * Returns true if the set contains the value, otherwise false
	 * @param value
	 * @return flag, which is a boolean variable that stores whether the set contains the value
	 */
	public boolean contains(int value) {
		if(set.contains(value)) {
			return true;
		}
		return false;
	};    
	
	 
	/**
	 * Returns the largest item in the set; Throws a IntegerSetException if the set is empty
	 * @return the largest item in the set
	 * @throws IntegerSetException
	 */
	public int largest() throws IntegerSetException {
		if(set.size() == 0) {
			throw new IntegerSetException("Empty set, cannot return largest");
		}else {
			return Collections.max(set);
		}
	};
	
	/**
	 * 
	 * @return the smallest item in the set; Throws a IntegerSetException if the set is empty
	 * @throws IntegerSetException
	 */
	public int smallest() throws IntegerSetException{
		if(set.size() == 0) {
			throw new IntegerSetException("Empty set, cannot return smallest");
		}else {
			int min = set.get(0);
			for(int i = 0; i < set.size(); i++) {
				if(set.get(i) <= min) {
					min = set.get(i);
				}
			}
			return min;
		}
	};
	
	/**
	 * Adds an item to the set or does nothing it already there	
	 * @param item
	 */
	public void add(int item) {
		if(set.contains(item)) {
			;
		}else {
			set.add(item);
		}
		
	}; 
	
	/**
	 * Removes an item from the set or does nothing if not there
	 * @param item
	 */
	public void remove(int item) {
		for(int i = 0; i < set.size(); i++) {
			if(set.get(i) == item) {
				set.remove(i);
			}
		}
	};
	
	/**
	 * Set union
	 * @param intSetb
	 */
	public void union(IntegerSet intSetb) {
		ArrayList<Integer> b = intSetb.getSet();
		set.addAll(b);
	};
	
	/**
	 * Set intersection
	 * @param intSetb
	 * @return
	 */
	public ArrayList<Integer> intersect(IntegerSet intSetb) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> b = intSetb.getSet();
        for (int i : set) {
            if(b.contains(i)) {
                list.add(i);
            }
        }
        return list;
	}; 
	
	/**
	 * Set difference, i.e., s1 –s2
	 * @param intSetb
	 */
	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> b = intSetb.getSet();
		set.removeAll(b);
	};
	
	/**
	 * Returns true if the set is empty, false otherwise
	 * @return
	 */
	public boolean isEmpty() {
		if(set.size() == 0) {
			return true;
		}else {
			return false;
		}
	}; 
	
	/**
	 * Return String representation of your set
	 */
	public String toString() {
		return set.toString();
	};
}

