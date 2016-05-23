package challenges;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PermutationTest {

	private ArrayList<String> result;
	
	@Test
	public void test() {
		String[] sample = {"acb", "bca", "cab", "cba"};
		List<String> genTestArray = Arrays.asList(sample);
		result = new ArrayList<String>();
		result.addAll(genTestArray);
		
		String[] genPerm = {"abc"};
		StringPermutations.main(genPerm);
		assertTrue(result.equals(StringPermutations.result));
	}
	
}
