package com.app;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Map {

	public static void main(String[] args) throws InterruptedException {
		HashMap<Integer, String> hm = new HashMap<>();
//		Integer i1 = new Integer(10);
		Integer i1 = 128;
		Integer i2 = 128;
//		Integer i2 = new Integer(10);
		hm.put(i1, "Anup");
		hm.put(i2, "Kanere");
		System.out.println("Printing HashMap");
		System.out.println(hm);
		System.out.println("-------------------------");

		IdentityHashMap<Integer, String> ihm = new IdentityHashMap<Integer, String>();
		ihm.put(i1, "Anup");
		ihm.put(i2, "Kanere");
		System.out.println("Printing Identity HashMap");
		System.out.println(ihm);

		System.out.println("-------------------------");

	}

}
