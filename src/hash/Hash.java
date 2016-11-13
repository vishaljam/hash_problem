package hash;

import java.util.Scanner;

public class Hash {
	
	public static long hash(String s) {
		long h = 7;
		String letters = "acdegilmnoprstuw";
		char[] charString = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			h = (h * 37 + letters.indexOf(charString[i]));
		}
		return h;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		long hash = hash(str);
		System.out.println(hash);
		in.close();
	}

}