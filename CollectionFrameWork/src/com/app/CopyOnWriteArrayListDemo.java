package com.app;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		Iterator<Integer> itr = list.iterator();
		System.out.println("Printing list before iterating");
		while(itr.hasNext())
		{
			Integer integer = itr.next();
			System.out.println(integer);
			list.add(999);
			if(integer == 20)
				list.remove(0);//we can remove elements from list by using collections remove method
//				itr.remove();// This line will throw UnsupportedOperationException
		}
		System.out.println("Print modified list");
		System.out.println(list);
		
	}

}
