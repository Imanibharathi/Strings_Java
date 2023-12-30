package Programs;


public class ReverseTheString {

	public static void main(String[] args) {

		String name = "hello123";
		// By using charAt() method:
		String rev1 = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev1 = rev1 + name.charAt(i);
		}
		System.out.println(rev1);

		// By using toCharArray() method
		String rev2 = "";
		char[] ch = name.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			rev2 = rev2 + ch[i];
		}
		System.out.println(rev2);

		// By using StringBuffer || StringBuilder
		StringBuffer sb1 = new StringBuffer(name);
		System.out.println(sb1.reverse());

		StringBuilder sb2 = new StringBuilder(name);
		System.out.println(sb2.reverse());

	}

}
