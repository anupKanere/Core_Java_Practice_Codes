package com.app;

import java.util.Iterator;

public enum Colors {
	RED, WHITE, BLACK, BROWN, VIOLET;

	private Colors() {
		System.out.println("COnstructor called : " + this.toString());
	}

	public static void main(String[] args) {

		for (Colors c : Colors.values()) {
			System.out.println(c + " index at " + c.ordinal());

		}
	}

}
