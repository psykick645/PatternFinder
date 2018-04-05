package org.test.strings;


import java.util.HashMap;
import java.util.Map;

public class StringPatternFinder {
	
	/**
	 * This Method returns a Map which contains the word as the key and the length of the word as value 
	 * @param sentence
	 * @return
	 */
	public static Map<String,Integer> getLongestWordWithLength(String sentence){
		
		String[] extractedWords = sentence.substring(0,sentence.length()-1).split(" ")  ;    //assuming that the sentence ends with either a single (.,!,?)
		Map<String,Integer> longestWordsWithLength = new HashMap<String,Integer>();        //using the string as the key so that our Map does not contain duplicate words
		
		longestWordsWithLength.put(extractedWords[0],extractedWords[0].length());
		for(int i = 1; i< extractedWords.length ; i++ ){
			if(extractedWords[i].length() > (Integer)longestWordsWithLength.values().toArray()[0]){
				longestWordsWithLength.clear();
				longestWordsWithLength.put(extractedWords[i], extractedWords[i].length());
			}
			else if(extractedWords[i].length() == (Integer)longestWordsWithLength.values().toArray()[0]){
				longestWordsWithLength.put(extractedWords[i], extractedWords[i].length());
			}
		}
		System.out.println("longest word  ==>?"+longestWordsWithLength);
		return longestWordsWithLength;
	}
	

}
