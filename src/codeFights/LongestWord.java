package codeFights;

public class LongestWord {

	public static void main(String[] args) {
		String test1  = "Ready, steady, go!";
		String test2 = "A!! AA[]z";
		String test3 = " ss ";
		String test4 = "Ready[[[, steady, go!";
		System.out.println(longestWord(test4));

	}//end main

	
	static String longestWord(String text) {
	text =text.replaceAll("[\\.$|,|;|'|!|]", "");  //remove special char's
	text = text.replaceAll("[\\[|\\]]", " ");
	String[] str =text.split(" ");
	
	
	for(String st : str){
		System.out.println(st);
	}
	
	if(str.length <=1){
		return text;
	}
	for(int i=0; i< str.length-1; i++){
		String word = str[i];
		int wordLength = str[i].length();  //the length of current word
		if(str[i+1].length() > wordLength){  //if the next is larger than the current
		//	wordLength = str[i].length();
			word = str[i+1];
		}
		return word; 
	}//end for
		 
	return "woops";
	}//end method
	
	
	
}//end class
