import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		ArrayList<?> list = new ArrayList<>();
//		list.add(10);//Compile time error
//		list.add("Anup");//Compile time error
//		list.add(true);//Compile time error
		list.add(null);


/*
 * Generics concept is applicable only at compile time, at runtime there is no such type of concept.
 * Please see below example	
 */
		ArrayList al = new ArrayList<String>();							
		al.add(10);
		al.add(true);
		al.add(null);
		al.add("Anup");
		System.out.println(al);
	}

}
