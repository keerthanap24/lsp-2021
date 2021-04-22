package org.howard.edu.lsp.exam.question41;

import java.util.*;

public class RemoveZeros {
	
	public static ArrayList<Integer> removeZeros(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
		    if (list.get(i) == 0) {
		        list.remove(i);
		        i--;
		    }
		}
		return(list);
	}
}