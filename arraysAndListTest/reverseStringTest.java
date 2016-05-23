package arraysAndListTest;

import static org.junit.Assert.*;

import org.junit.Test;

import arraysAndList.reverseString;

public class reverseStringTest {

	@Test
	public void test() {
		assertTrue("elpmas".equals(reverseString.reverseIt("sample")));
		assertTrue("doow".equals(reverseString.reverseIt("wood")));
		assertFalse("khche".equals(reverseString.reverseIt("check")));
		//assertNull(reverseString.reverseIt(null));
	}

}
