package Programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {

		String str = "Java programming";

		// By using distinct() method present in java 8
		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(x -> sb1.append((char) x));
//		System.out.println(sb1);

		// By using indexOf() method
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int index = str.indexOf(ch, i + 1);
			if (index == -1) {
				sb2.append(ch);
			}
		}
//		System.out.println(sb2);

		// By using toCharArray() method
		StringBuilder sb3 = new StringBuilder();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					flag = true;
					break;
				}
			}
			if (!flag)
				sb3.append(ch[i]);
		}
//		System.out.println(sb3);

		// By using set interface
		StringBuilder sb4 = new StringBuilder();
		Set<Character> s = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			s.add(str.charAt(i));
		}
		for (Character c : s) {
			sb4.append(c);
		}
		System.out.println(sb4);
	}

}
