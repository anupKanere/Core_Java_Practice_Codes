package com.app;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		LinkedList<Integer> link = new LinkedList<Integer>();

		link.add(10);
		link.add(20);

		System.out.println(link);

		link.addFirst(5);//add the element at 1st position
		link.add(2, 6);//add the element at 2nd position
		
		System.out.println(link);
		
		link.remove();//removes first element from the linked List 
		System.out.println( link + "  After using remove() ");
		
		link.removeFirst();
		System.out.println(link + "  after using removeFirst() ");
	}

}
