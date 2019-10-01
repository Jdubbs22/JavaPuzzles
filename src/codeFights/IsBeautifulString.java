package codeFights;

public class IsBeautifulString {
	
/*
 * A string is said to be beautiful if each letter of the alphabet appears 
 * at most as many times as than the previous letter;
 *  ie: b occurs no more times than a; c occurs no more times than b; etc.
 *  
 *  For inputString = "bbbaacdafe", the output should be
 *	isBeautifulString(inputString) = true;
 */
	

	public static void main(String[] args) {
		String test1 = "bbbaacdafe";  //true
		String test2 = "aabbb"; //false

	}//end main

	//char character = 'a';    
	//int ascii = (int) character;
	static boolean isBeautifulString(String inputString) {
		String[] letters = new String [ inputString.length()];
		final int SIZE = 26;
		int currentAscii =0;
		int oldAscii =0;
		int oldCount=0;
		int currentCount=0;
		int n = inputString.length();
		int[] freqency = new int[SIZE];
		
		for (int i = 0; i < n; i++) {
            freqency[inputString.charAt(i) - 'a']++; 
		
		
			
		 if (freqency[inputString.charAt(i) - 'a'] != 0) { 
			  
             // print the character along with its 
             // frequency 
     //       letters[i] = (String)inputString.charAt(i)+ (String) freqency); 
     //        System.out.print(freq[str.charAt(i) - 'a'] + " ");  
		 }//end if
             // update frequency of str.charAt(i) to  
             // 0 so that the same character is not 
             // printed again 
         //    freq[str.charAt(i) - 'a'] = 0; 
		 }//end for
		
		return false;
	}//end method

	
	
}//end class
