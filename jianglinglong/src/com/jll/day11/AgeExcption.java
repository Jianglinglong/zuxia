package com.jll.day11;

public class AgeExcption extends RuntimeException {
	private static final long serialVersionUID = 772039858956092476L;
	public AgeExcption() {
		super();
	}
	public AgeExcption(String msg){
		super(msg);
	}
}
