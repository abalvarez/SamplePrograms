package arraysAndList;

public class uniqueCharacters {

	public static boolean checkUniqueChar(String checkString){
		boolean[] res = new boolean[256];
		String convString = checkString.toUpperCase();
		
		for(int ctr=0; ctr<convString.length(); ctr++){
			int getChar = convString.charAt(ctr);
			if(res[getChar]){
				return false;
			}else{
				res[getChar] = true;
			}
		}
		return true;
	}
}
