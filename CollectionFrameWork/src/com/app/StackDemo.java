package com.app;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s); // [A, B, C]
		System.out.println(s.search("A")); // 3
		System.out.println(s.search("Z")); // -1
	}
}
