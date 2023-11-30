import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(7);
		list.add(8);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(6);
		System.out.println(list + " Printing original List");
		
		//filter
		List<Integer> al1 = list.stream().filter(s -> s%2 == 0).collect(Collectors.toList());
		System.out.println(al1 + " Finding even numbers using filter()");
		
		//map
		List<Integer> al2 = list.stream().map( s -> s+10).collect(Collectors.toList());
		System.out.println(al2 + " Adding 10 to each Object of List using map()");
		
		//sorted
		List<Integer> al3 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(al3 + " Sorting list as per natural ordering using sorted()");
		
		int min = list.stream().min((s1,s2) -> s1.compareTo(s2)).get();
		System.out.println(min + "  printing min number from List using min()");
		
		Integer max = list.stream().max((s1,s2) -> s1.compareTo(s2)).get();
		System.out.println(max + "  printing min number from List using max()");
		

	}

}
