package Programs;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		String s = "!@Java$%%&*Co@ding!@";
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}
}
