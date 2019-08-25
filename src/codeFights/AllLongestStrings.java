package codeFights;

import java.util.Arrays;
import java.util.Objects;

public class AllLongestStrings {
	
	
	
	public static void main(String[]args){
		String[] inputArray =  {"aba", 
		             "aa", 
		             "ad", 
		             "vcd", 
		             "aba"};
		String[] testArray = {"abacaba", 
				 "abacab", 
				 "abac", 
				 "xxxxxx"};
		
		String one = "aabcc";
		String two =  "adcaa";
		String three = "abaca";
		String four ="abaac";
/*		int[]ias = new int[4];
		int[]as = new int[5];
		
		 for (int i = 0; i < as.length; i++) {
			System.out.println(  ias[(int)as[i]]++);
		 }
		printArray(ias);;
		printArray( allLongestStrings(inputArray));
		printArray(allLongestStrings(testArray));
		System.out.println(one);
		System.out.println(two);
		System.out.println(commonCharacterCount(one,two));
	System.out.println(commonCharacterCount2(one,two));
		System.out.println(commonCharacterCount(three, four)); 
		System.out.println("expected of above is 5");
		System.out.println(commonCharacterCount2(three, four));
	 * */
	 
	}
	
	static String[] allLongestStrings(String[] inputArray) {
	    
	    int longest = inputArray[0].length();
	    String [] answer = new String[inputArray.length];
	    for(int i=1; i<inputArray.length; i++){
	        if(inputArray[i].length()> inputArray[i-1].length() && inputArray[i].length() >= longest)
	            longest = inputArray[i].length();
	        
	    }//end for
	    
	    for(int j=0;j<inputArray.length;j++){
	    	if(inputArray[j].length() == longest){
	    		answer[j] = inputArray[j];
	    	}
	    }
	    String[] cleanedArray = Arrays.stream(answer).filter(Objects::nonNull).toArray(String[]::new);
		return cleanedArray;

	}
	
	
	/*
	 * Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".
	 */
	
	static int commonCharacterCount(String s1, String s2) {
	//	char[] st1 = new char[s1.length()];
	//	char[] st2 = new char[s2.length()];
	//	st1 =  s1.toCharArray();
	//	st2 =  s2.toCharArray();
		int count = 0;
		int count2 =0;
		for(int i =0; i<s1.length();i++){
			char temp = s1.charAt(i);
			for(int j=1; j<s2.length();j++){
				
				if(temp == s2.charAt(j)){
					count++;
					break;
				}//end if
			}//end internal for
		}//end for
		
		//reversed the order to let the second array be checked
		for(int i =1; i<s2.length();i++){
			char temp2 = s2.charAt(i);
			for(int j=0; j<s1.length();j++){
				
				if(temp2 == s1.charAt(j)){
					count2++;
					break;
				}//end if
			}//end internal for
		}//end for
	/*	if(count > count2){
			return count2;
		}else
			
		
		return count;*/
		return Math.min(count, count2);

	}//end method
	
	
	public static int commonCharacterCount2(String s1, String s2) {
		  int sum = 0;
		  
		  char[] as= s1.toCharArray();
		  char[] bs= s2.toCharArray();
		  
		  int[] ias = new int[126];
		  int[] ibs = new int[126];
		  
	
		  
		  for (int i = 0; i < as.length; i++) {
		   ias[(int)as[i]]++;
		  }
		  
		  for (int i = 0; i < bs.length; i++) {
		   ibs[(int)bs[i]]++;  //this represents the position of the array
		  }
		  
		  for (int i = 0; i < ibs.length; i++) {
		   sum += Math.min(ias[i], ibs[i]);
		  }
		  return sum;
		 }//end method
	
	int commonCharacterCount3(String s1, String s2) {  //viets solution
	    int[] a = new int[26], 
	        b = new int[26];
	    for (char c: s1.toCharArray())
	        a[c - 'a']++;
	    for (char c: s2.toCharArray())
	        b[c - 'a']++;
	    int s = 0;
	    for (int i = 0; i < 26; ++i) 
	        s +=Math.min(a[i],b[i]);
	    return s;
	        
	}//end method

	public static void printArray(int[] ias){  //changed from String[] for testing
		
		for(int i=0;i<ias.length;i++){
			System.out.print(ias[i]+ " ");
		}
		System.out.println();
	}
}
