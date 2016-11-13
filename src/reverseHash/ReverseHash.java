package reverseHash;

import java.util.Scanner;

public class ReverseHash {
	
	public static String getReverseHashString (long hashValue, String str) {
		if (hashValue < 37) {
			return str;
		}
		String letters = "acdegilmnoprstuw";
		char[] charString = letters.toCharArray();
		int h = (int) (hashValue % 37);
		long remainingHash = hashValue / 37;
		char c = charString[h];
		str = c + str;
		return (getReverseHashString (remainingHash, str));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long hash = in.nextLong();
		String reverseHash = getReverseHashString (hash, "");
		System.out.println(reverseHash);
		in.close();
	}
}