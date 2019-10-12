package codeFights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 First, the string is divided into the least possible number of disjoint substrings consisting of identical characters
for example, "aabbbc" is divided into ["aa", "bbb", "c"]

Next, each substring with length greater than one is replaced with a concatenation of its length and the repeating character
for example, substring "bbb" is replaced by "3b"

Finally, all the new strings are concatenated together in the same order and a new string is returned.
 */





public class LineEncoding {

	public static void main(String[] args) {
		String test1 = "aabbbc"; //"2a3bc"
		String test2 = "abbcabb"; //"a2bca2b"
		System.out.println(lineEncoding(test2));

	}//end main
	
	static String lineEncoding(String s) {
		char[] chars = s.toCharArray();
		StringBuilder builder = new StringBuilder();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		 
		   for (Character ch : chars) {
	            if (charMap.containsKey(ch)) {
	                charMap.put(ch, charMap.get(ch) + 1);
	            } else {
	                charMap.put(ch, 1);
	            }//end else
	        }//end for
		   
		   
		
		   for (Entry<Character, Integer> entry : charMap.entrySet()) {
			   if(entry.getValue()==1){
				   builder.append(entry.getKey().toString());
				   
			   }else{
			   builder.append(entry.getValue().toString()+entry.getKey().toString());
			   }//end else
			}//end for
		   String answer = builder.toString();
	//	System.out.println(answer);
		return answer;
	}//end method
	
	

}//end class
