package com.jll.day11;

public class PassWordExcption extends RuntimeException {
	private static final long serialVersionUID = 7840557292819116959L;
	public PassWordExcption() {
		super();
	}
	public PassWordExcption(String msg) {
		super(msg);
	}
}
