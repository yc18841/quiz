package com.example.demo.quiz;

import java.io.Serializable;

public class EnhancedPerson extends Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EnhancedPerson(String s) {
	    super(s);
	    if (s == null || s.length() == 0) {
	      throw new IllegalArgumentException("Invalid name");
	    }
	  }
}
