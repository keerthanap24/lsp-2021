package org.howard.edu.lsp.assignment6.integerset;

/**
 * class for IntegerSetException that returns error message if set is empty
 * @author keerthana
 * 
 */
public class IntegerSetException extends Exception {
	/**
	 * sets exception message
	 * @param message
	 */
	public IntegerSetException(String error) {
		super(error);
	}
};
