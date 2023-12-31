package com.app;

import java.util.Enumeration;
import java.util.Iterator;
/*
 * The Most Powerful Cursor is ListIterator. But its Limitation is, it is Applicable Only for
List Objects.
 */
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorDemo {
	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<>();
		link.add("Baala");
		link.add("Venki");
		link.add("Chiru");
		link.add("Naag");
		System.out.println(link);

		ListIterator<String> ltr = link.listIterator();
		while (ltr.hasNext()) {
			String s = (String) ltr.next();
			if (s.equals("Venki"))
				ltr.remove();
			if (s.equals("Naag"))
				ltr.add("Chaitu");
			if (s.equals("Chiru"))
				ltr.add("Charan");
		}
		System.out.println(link);

	}
}
