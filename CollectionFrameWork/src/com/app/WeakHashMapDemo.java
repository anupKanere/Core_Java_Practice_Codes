package com.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {

		HashMap<Temp, String> hm = new HashMap();
		Temp t1 = new Temp();
		System.out.println("HASH-MAP");
		hm.put(t1, "Durga");
		System.out.println(hm);
		t1 = null;
		System.gc();

		Thread.sleep(1000);
		System.out.println(hm);

		System.out.println("-----------------------");

		WeakHashMap<Temp, String> whm = new WeakHashMap<>();
		Temp t2 = new Temp();
		whm.put(t2, "Durga");
		System.out.println("WEEK HASH-MAP");
		System.out.println(whm);
		t2 = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(whm);
		
		System.out.println("-----------------");
		System.out.println("CONCURRENT HASHMAP");

		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<Integer, String>();
		chm.put(1, "Anup");
		chm.put(2, "Adarsh");
		chm.put(3, "Pranal");

		Iterator<Entry<Integer, String>> itr = chm.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry);

			if (entry.getKey() == 3)
				chm.put(4, "Raj");

		}

		System.out.println(chm);

	}
}

class Temp {
	public String toString() {
		return "temp";
	}

	public void finalize() {
		System.out.println("finalize() Called");
	}
}
