/*
 * Creating our own generic class
 */

public class Pair<T, U> {
	private T first;
	private U second;

	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public U getSecond() {
		return second;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public void setSecond(U second) {
		this.second = second;
	}

	public void displayPair() {
		System.out.println("First: " + first + ", Second: " + second);
	}

	public static void main(String[] args) {
		Pair<String, Integer> personAge = new Pair<>("Alice", 25);
		Pair<Double, String> coordinates = new Pair<>(3.14, "latitude");

		personAge.displayPair();
		coordinates.displayPair();

		// You can also modify the values in the Pair
		personAge.setFirst("Bob");
		personAge.setSecond(30);
		personAge.displayPair();
	}
}
