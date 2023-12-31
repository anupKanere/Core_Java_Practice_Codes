import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		String str = "ANup Arun KANEre";
		str = str.toLowerCase().replaceAll("\\s", "");
		HashMap<Character, Integer> hm = new HashMap<>();

		for (char ch : str.toCharArray()) {
			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			}

			else if (!hm.containsKey(ch)) {
				hm.put(ch, 1);
			}
		}

		for (Map.Entry entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
