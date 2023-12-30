package Programs;

import java.util.Arrays;

//By using sort() method
public class SortingString2 {

	public static void main(String[] args) {
		String s = "lion";
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		System.out.println(new String(ch));
	}
}
