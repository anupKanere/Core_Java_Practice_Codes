import java.util.HashSet;
import java.util.Set;

public class CodingQuestion {

	public static void main(String[] args) {
		String check = "a,1,2,2,3,3,3,10,12,@,&, ,,1250,";
		int sum = findSum(check);
		System.out.println("Sum of Distinct numbers in the String : " + sum);

	}
	
	private static int findSum(String check) {
		int sum = 0;
		Set<Integer> hs = new HashSet<>();
		String[] str = check.split(",");

		for (String num : str) {
			if (num.matches("\\d+")) {
				int number = Integer.parseInt(num);
				if (!hs.contains(number)) {
					sum += number;
					hs.add(number);
				}
			}
		}
		return sum;
	}
}