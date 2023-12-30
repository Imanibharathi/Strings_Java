package Programs;

public class ReplaceCharacter2 {

	public static void main(String[] args) {
		String word = "HelloWorld";
		char toReplace = 'l';
		int count = 1;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if(ch==toReplace) {
				word = word.replaceFirst(String.valueOf(toReplace),String.valueOf(count));
				count++;
			}
		}
		System.out.println(word);
		
		
		
		
		
		
		
		
		
		
	}
}
