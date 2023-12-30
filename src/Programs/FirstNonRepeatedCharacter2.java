package Programs;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter2 {

	public static void main(String[] args) {
		String word = "AABBCDEEF";
		char[] ch = word.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if(!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			}else {
				map.put(ch[i],map.get(ch[i])+1);
			}
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
