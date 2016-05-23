package challenges;

import java.util.Arrays;

public class AnagramTest {
	public static boolean checkAnagram(String word1, String word2){
		
		char[] check1 = word1.toCharArray();
		char[] check2 = word2.toCharArray();
		
		Arrays.sort(check1);
		Arrays.sort(check2);
		boolean res = false;
		if(Arrays.equals(check1, check2)){
			res = true;
		}else{
			res = false;
		}
		return res;
	}
}
