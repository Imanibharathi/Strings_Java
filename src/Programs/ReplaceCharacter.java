package Programs;

public class ReplaceCharacter {

	public static void main(String[] args) {
		String word = "HelloWorld";
		char toReplace = 'l';
		char[] ch = word.toCharArray();
		if(word.indexOf(toReplace)==-1) {
			System.out.println("Invalid Replacement");
			return;
		}
		int count = 1;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==toReplace) {
				ch[i] = String.valueOf(count).charAt(0);
				count++;
			}
		}
		System.out.println(new String(ch));
		
		
		
		
		
		
		
		
	}
}
