package org.test.strings.test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.test.strings.StringPatternFinder;
import org.junit.Test;

public class StringPatternFinderTest {

	@Test
	public void testGetLongestWordOneOccurance() {
		Map<String,Integer> expectedResult = new HashMap<String,Integer>();
		expectedResult.put("jumped", "jumped".length());
		Map<String,Integer> result = StringPatternFinder.getLongestWordWithLength("The cow jumped over the moon.");
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testGetLongestWordMultipleOccurance() {
		Map<String,Integer> expectedResult = new HashMap<String,Integer>();
		expectedResult.put("jumped", "jumped".length());
		expectedResult.put("ducked", "ducked".length());
		Map<String,Integer> result = StringPatternFinder.getLongestWordWithLength("The cow jumped ducked over the moon?");
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testGetLongestWordMultipleOccuranceOfSameWord() {
		Map<String,Integer> expectedResult = new HashMap<String,Integer>();
		expectedResult.put("jumped", "jumped".length());
		Map<String,Integer> result = StringPatternFinder.getLongestWordWithLength("The cow jumped and jumped over the moon!");
		assertEquals(expectedResult, result);
	}

}
