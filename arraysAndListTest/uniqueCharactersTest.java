package arraysAndListTest;

import static org.junit.Assert.*;

import org.junit.Test;

import arraysAndList.uniqueCharacters;

public class uniqueCharactersTest {

	@Test
	public void test() {
		assertTrue(uniqueCharacters.checkUniqueChar("Back")); 
		assertTrue(uniqueCharacters.checkUniqueChar("Golf"));  
		assertFalse(uniqueCharacters.checkUniqueChar("Wood")); 
		assertFalse(uniqueCharacters.checkUniqueChar("Pool")); 
		assertFalse(uniqueCharacters.checkUniqueChar("1Pool")); 
		assertFalse(uniqueCharacters.checkUniqueChar("12231"));  
	}

}
