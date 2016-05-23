package arraysAndList;

public class reverseString {
	public static String reverseIt(String givenWord) {
		String res = "";
		if (givenWord != "") {
			char[] givenWordToChar = givenWord.toCharArray();

			for (int ctr = givenWord.length(); ctr > 0; ctr--) {
				res = res + givenWordToChar[ctr - 1];
			}
		}

		return res;
	}
}
