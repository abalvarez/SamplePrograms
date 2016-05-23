package challenges;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckAnagram {

	@Test
	public void test() {
		assertTrue(challenges.AnagramTest.checkAnagram("word", "wrdo")); 
		assertTrue(challenges.AnagramTest.checkAnagram("boat", "btoa")); 
		assertFalse(challenges.AnagramTest.checkAnagram("pure", "in")); 
		assertFalse(challenges.AnagramTest.checkAnagram("fill", "fil")); 
		assertTrue(challenges.AnagramTest.checkAnagram("a", "a")); 
		assertFalse(challenges.AnagramTest.checkAnagram("b", "bbb")); 
		assertFalse(challenges.AnagramTest.checkAnagram("ccc", "ccccccc")); 
		assertFalse(challenges.AnagramTest.checkAnagram("sleep", "slep"));
	}

}
