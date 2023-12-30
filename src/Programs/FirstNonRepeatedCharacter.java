package Programs;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String word = "AABCDDEBEF";
		char nonRepeated = '\0';

		char[] ch = word.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			boolean flag = false;
			for (int j = 0; j < ch.length; j++) {
				if (i!=j && ch[i] == ch[j]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				nonRepeated = ch[i];
				break;
			}
		}
		if (nonRepeated != '\0') {
			System.out.println("Non-Repeated character is " + nonRepeated);
		} else {
			System.out.println("There is no non-repeating character present.");
		}

	}

}
