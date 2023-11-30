/*
 * (Island of Isolation all references are internal references )
 */
public class IslandOfIsolation {

	IslandOfIsolation i;

	public static void main(String[] args) {

		IslandOfIsolation obj1 = new IslandOfIsolation();
		IslandOfIsolation obj2 = new IslandOfIsolation();
		IslandOfIsolation obj3 = new IslandOfIsolation();

		obj1.i = obj2;
		obj2.i = obj3;
		obj3.i = obj1;

		obj1 = null;// No any Object Marked for GC
		obj2 = null;// No any Object Marked for GC
		obj3 = null;// after this line all the 3 objects will be marked for GC

		System.out.println("------------------------------------");
		Runtime r = Runtime.getRuntime();
		r.gc();// 1st way to request JVM for GC
		System.gc();// 2nd way to request JVM for GC
		System.out.println(r.freeMemory());// unit - bytes
		System.out.println(r.totalMemory());// unit - bytes
		System.out.println(r.maxMemory());// unit - bytes

	}

}
