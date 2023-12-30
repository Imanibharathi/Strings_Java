package Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {

	public static void main(String[] args) {
		longestSubString("ababacc");
	}

	private static void longestSubString(String str) {
		String longestSubString = null;
		int longestSubStringLength = 0;

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}
			if (map.size() > longestSubStringLength) {
				longestSubStringLength = map.size();
				longestSubString = map.keySet().toString();
			}
		}
		System.out.println("Longest SubString is " + longestSubString);
		System.out.println("Longest SubString Length is " + longestSubStringLength);

	}

}
