package challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringPermutations {
	public static ArrayList<String> result;
	static int index = 0;
	static int finIndex;
	static char lastChar;
	static int lastIndexStr = 0;
	private static Scanner inputString;

	public static void main(String args[]) {
		//Insert string to permutate
		//System.out.println("Enter string to permutate:");
		//inputString = new Scanner(System.in);

		//String givenString = inputString.nextLine();
		
		String givenString = args[0];
		//Get the last index of String character
		lastIndexStr = givenString.length() - 1;
		//Get last character of the String
		lastChar = givenString.charAt(lastIndexStr);

		//Initialize result Arraylist
		result = new ArrayList<String>();
		
		//Get final Index for string recursion
		finIndex = givenString.length() - 1;
		
		//Get string to permutate
		String permThis = givenString.substring(0, lastIndexStr);
		
		//If given string length is equal to 1; Add the initial string formation to result arraylist
		if (permThis.length() == 1) {
			result.add(givenString);
		}
		
		//Start permutation
		getPermutation(permThis);
		
		//Sort result
		Collections.sort(result);
		System.out.println(result);
	}

	public static void getPermutation(String givenStr) {

		//If index is equal to final index; Stop recursion.
		if (index == finIndex) {
			return;
		}

		//For loop to retrieve possible combinations for the string
		for (int x = 0; x < lastIndexStr; x++) {
			String res = new StringBuffer(givenStr).insert(x, lastChar).toString();
			if (!result.contains(res)) {
				result.add(res);
			}
		}
		
		//Add Index
		index++;

		//Execute recursion after generating new String
		getPermutation(generateNewString(givenStr));
	}

	public static String generateNewString(String oldStr) {
		//Get last character of old string
		char lastChar = oldStr.charAt(oldStr.length() - 1);
		//Get last index of last character
		int lastIndex = oldStr.lastIndexOf(lastChar);
		//Generate new String combination
		String newStr = oldStr.charAt(lastIndex) + oldStr.substring(0, lastIndex);
		return newStr;
	}
}
