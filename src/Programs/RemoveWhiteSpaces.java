package Programs;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String s = "    Ja  va    Co  d i  n  g    ";
		String s1 = s.replaceAll("\\s", "");
		System.out.println(s1);
		
		
	}
}
