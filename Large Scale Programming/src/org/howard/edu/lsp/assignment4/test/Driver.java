package org.howard.edu.lsp.assignment4.test;

import java.util.ArrayList;
import java.util.List;

import org.howard.edu.lsp.assignment4.IntegerSet;
import org.howard.edu.lsp.assignment4.IntegerSetException;

public class Driver {
	
	public static void main(String args[]) {
		IntegerSet s = new IntegerSet();
		s.add(2);
		s.add(4);
		s.add(7);
		s.add(1);
		
		IntegerSet a = new IntegerSet();
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(2);
		System.out.println(s.intersect(a));
		s.union(a);
		System.out.println(s);
		
		IntegerSet s2 = new IntegerSet();
		s2.add(1);
		s2.add(4);
		s2.add(5);
		s2.add(9);
		try {
			System.out.println(s2.largest());
		}catch(IntegerSetException e) {
			e.printStackTrace();
		}
		
		IntegerSet s3 = new IntegerSet();
		s3.add(5);
		s3.add(2);
		s3.add(9);
		s3.add(1);
		IntegerSet b = new IntegerSet();
		b.add(2);
		b.add(9);
		b.add(6);
		b.add(1);
		System.out.println(s3.equals(b));
		

		IntegerSet s4 = new IntegerSet();
		s4.add(10);
		s4.add(7);
		s4.add(8);
		s4.add(2);
		s4.add(20);
		System.out.println(s4);
		s4.clear();
		System.out.println(s4);
		

		IntegerSet s5 = new IntegerSet();
		s5.add(10);
		s5.add(7);
		s5.add(8);
		s5.add(2);
		s5.add(20);
		System.out.println(s5.contains(8));
		

		IntegerSet s6 = new IntegerSet();
		s6.add(11);
		s6.add(42);
		s6.add(3);
		s6.add(9);
		try {
			System.out.println(s6.smallest());
		}catch(IntegerSetException e) {
			e.printStackTrace();
		}

		
		IntegerSet s7 = new IntegerSet();
		s7.add(10);
		s7.add(7);
		s7.add(8);
		s7.add(2);
		s7.add(20);
		System.out.println(s7.length());
		

		IntegerSet s8 = new IntegerSet();
		System.out.println(s8.isEmpty());
		

		IntegerSet s9 = new IntegerSet();
		s9.add(5);
		s9.add(2);
		s9.add(9);
		s9.add(1);
		IntegerSet c = new IntegerSet();
		c.add(2);
		c.add(8);
		c.add(6);
		c.add(1);
		s9.diff(c);;
		System.out.println(s9);
	}

}
