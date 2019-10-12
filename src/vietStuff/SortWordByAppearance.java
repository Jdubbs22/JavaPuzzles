package vietStuff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;


public class SortWordByAppearance {

	public static void main(String[] args) {
		String test1 = "h e l l o";  //lheo
		String test2 = "Yesterday I ate an apple. Today I eat an apple. Tomorrow, like today I will eat another one.";
		//  ^^^  i an apple today eat yesterday ect....
		sortWordByAppearance(test2);
	
		
	}//end main

	
	static List<String> sortWordByAppearance(String paragraph) {
		String replaced =paragraph.replaceAll("[\\.$|,|;|']", "");  //remove special char's
		String theString = replaced.toLowerCase();  //avoids cap in the beginning of sentences
		
		String[] arrOfStr = theString.split(" ");  //creates and array of the various words
		

		 HashMap<String, WordPriority> map  = new HashMap<>();  //use hashmap so the value can contain multiple pieces of info in th form of a class or object
		 // key - value : word - WordPriority
		

		for (int i = 0; i <  arrOfStr.length; ++i) { 
			String word = arrOfStr[i];  
		
			WordPriority wordPriority = map.get(word);// how many times it appears

			if (wordPriority == null) {
				// i is position the word appears the first time
				wordPriority  = new WordPriority(); //manually set the values below instead of using a set constructor
				wordPriority.numbOfOccurs = 1;
				wordPriority.firstOccur = i;
				wordPriority.word = word;
				map.put(word,wordPriority );
			} else {
				wordPriority.numbOfOccurs  += 1;
				//map.put(word, wordPriority); //else its already been there an increase count (the value)
										//keys do not change but values do/can
			}//end else

		}//end for
	
//		map.forEach((k, v) -> {  //Lambda implementation used for testing
//			System.out.println("word: " + k + ", occurs: " +  v.numbOfOccurs);
//			
//		});
		
		
		List<WordPriority> priorityList = new ArrayList<>();
		map.forEach((k, v) -> {  //Lambda implementation		
			priorityList.add(v);	
		});
		
//		for (Map.Entry<String, WordPriority> entry: map.entrySet()) {
//			priorityList.add(entry.getValue());
//		}
		
		Collections.sort(priorityList);
		
		List<String> answer = new ArrayList<String>();
		for(int i = 0; i< priorityList.size(); i++){
			String w = priorityList.get(i).word;
			answer.add(w);
		}
		
		for (WordPriority wp : priorityList) {  //could also use a forEach
			
		}
		
		
		answer.forEach(word -> System.out.print(" " + word));
		
	
	    return answer;
	  }//end method
	
	
}//end class

/*
 * the below helper class is used to store all the info needed.  I contains the word itself, the number of occurrences 
 * and the position where the word first appears.  Thus we can use the hashmap to store all these values using this as 
 * an object and taking what info from it that we need for the final Arraylist that is the required solution.
 */

class WordPriority implements Comparable<WordPriority> {  
	String word;
	int numbOfOccurs; 
	int firstOccur;


	@Override
	public int compareTo(WordPriority other) {
		// first sort by numberOfOcurrs
		//if a tie sort by firstOccur
		//int result = this.numbOfOccurs.compareTo(other.numbOfOccurs);
		
		if (this.numbOfOccurs < other.numbOfOccurs) {
			return 1; //put this way because we need from highest to lowest
		} else if  (this.numbOfOccurs > other.numbOfOccurs) {
			return -1;
		}
		return this.firstOccur - other.firstOccur;  //if equal then sort by first occurrence
		
			
	}
	
}//end class	
	
	
	//unneeded code of what I did before
	
//	for(int j=0;j<arrOfStr.length;j++){
//	//	System.out.println("external loop j: "+ arrOfStr[j]);
//		//String word = arrOfStr[i];
//		if(s.equals(arrOfStr[j]) ){
//			count++;
//		}//end if
//		
//	}//end internal for
//	answer.add(s);
//	stringAndCount= s+ Integer.toString(count);
//	map.put(s, count);
//	count =0;
//	answer.add(stringAndCount);
//	word="";
