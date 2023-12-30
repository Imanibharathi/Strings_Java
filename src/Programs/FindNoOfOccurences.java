package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindNoOfOccurences {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		char[] ch = str.toCharArray();
		Map<Character, Integer> m = new HashMap<>();
		for (char c : ch) {
			if (!m.containsKey(c)) {
				m.put(c, 1);
			} else {
				m.put(c, m.get(c)+1);
			}
		}
		System.out.println(m);

		sc.close();
	}
}
