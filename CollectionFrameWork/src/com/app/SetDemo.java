package com.app;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(5);
		hs.add(20);
		hs.add(1);
		hs.add(50);
		System.out.println("Printing HashSet");
		System.out.println(hs);
		System.out.println("--------");

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(5);
		lhs.add(20);
		lhs.add(1);
		lhs.add(50);
		lhs.add(10);// duplicates will be not added
		System.out.println("Printing Linked HashSet");
		System.out.println(lhs);
		System.out.println("--------");
		
		TreeSet<Integer> sortedSet = new TreeSet<>();
		sortedSet.add(10);
		sortedSet.add(5);
		sortedSet.add(20);
		sortedSet.add(1);
		sortedSet.add(50);
		sortedSet.add(10);
		System.out.println("Printing TreeSet");
		System.out.println(sortedSet);
		System.out.println("--------");

	}

}
