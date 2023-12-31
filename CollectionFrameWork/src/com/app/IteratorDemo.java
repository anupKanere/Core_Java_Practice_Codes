package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(15);
		list.add(20);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			if (integer % 2 == 0)
				System.out.println(integer);
			else
				itr.remove();

		}
		System.out.println(list);

	}
}
