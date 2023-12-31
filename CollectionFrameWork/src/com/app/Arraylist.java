package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(10);
		al.add(null);
		al.add(20);
		al.add("Anup");
		al.add(true);
//		String name = al.get(1);//will get class cast exception..to avoid this generics are introduced.
//		System.out.println(name);
		System.out.println("size of the arraylist is : " + al.size());
		System.out.println("element at 1st index is : " + al.get(1));
		System.out.println(al);

		System.out.println("-------------------------------");
		
		List<Integer> list = new ArrayList<>();
		List<Integer> sync = Collections.synchronizedList(list);//to make list synchronize
		List<Integer> unmodify = Collections.unmodifiableList(list);// to make List read-only

		list.add(10);
		list.add(20);
		list.add(null);

		sync.add(35);
		sync.add(45);
//		unmodify.add(55);// this line will throw UnsupportedOperationException at runtime
		System.out.println(unmodify);
		System.out.println(list);
	

	}

}
