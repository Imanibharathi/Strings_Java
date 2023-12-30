package Programs;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String words = sc.nextLine();
		String[] str = words.split(" ");
		String rev1 = "";
		for (String word : str) {
			String rev2 = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				rev2 = rev2 + word.charAt(i);
			}
			rev1 = rev1 + rev2 + " ";
		}
		System.out.println(rev1);

		sc.close();
	}

}
