
public class VietTests {

	public static void main(String[] args) {
		String paragraph = "i have 2 pets ,  a cat  and a dog .        the cat's name,is Milo. the dog's name is Ricky";
	    String correctedParagraph = correctParagraph(paragraph);
	    String article = "Business Insider teamed up with Zillow's rental site, HotPads, to find the "
	    		+ "median rent for a one-bedroom apartment in each of the 49 US metro areas with the largest"
	    		+ "populations (as determined by Zillow). We also used Data USA to find the median household"
	    		+ "income in each of these areas."
	    		+ "The data was compiled using HotPad's Repeat Rent Index. Each of the one-bedroom apartments"
	    		+ "analyzed in the study has been listed for rent on HotPads for longer than a month.";
	    	System.out.println(countAppearances(article,"one-bedroom" ));
	    	String test = "I I I";
	    	System.out.println(countAppearances(test,"I" ));
	    		 
	}//end main
	
	// taken from vvv
	//https://stackoverflow.com/questions/767759/occurrences-of-substring-in-a-string
	  static int countAppearances(String article, String keyword) {
		  int lastIndex = 0; //the index to start the search from
		  int count = 0;

		  while(lastIndex != -1){  //-1, because when you add lastIndex += keyword.length() after the last occurrence , indexOf == -1

		      lastIndex = article.indexOf(keyword,lastIndex);

		      if(lastIndex != -1){
		          count ++;
		          lastIndex += keyword.length();
		          System.out.println("last index = "+lastIndex);
		      }
		      System.out.println(" very last index = "+lastIndex);
		  }
			return count;
	  }
	

	static String correctParagraph(String paragraph) {
	
	//	System.out.println(removeSpaces(paragraph));
	System.out.println(removeSpaceBeforePeriod(
			removeSpaceBeforeComma(
					capFirstLetter(
							removeSpaces(
									addPeriodIfNotFound(paragraph))))));
		
			return "";
	}
	
	public static String addPeriodIfNotFound(String s){
		if(s.endsWith(".")){
			return s;
		}
		else return s.concat(".");
		
	}
	
	public static String removeSpaces(String s){
		String after = s.trim().replaceAll(" +", " ");
		return after;
	}//end method
	
	public static String removeSpaceBeforePeriod(String s){
		String after = s.trim().replaceAll(" \\. ","\\. ");
		return after;
	}
	
	public static String removeSpaceBeforeComma(String s){
		String after = s.trim().replaceAll(" , ",", ");
		return after;
	}
	public static String addSpaceAfterComma(String s){  //this interfers with the above
		
		String after = s.trim().replaceAll(",", ", ");
		return after;
	}
	
	 static String capFirstLetter(String str){ //taken from vvv
	  //https://stackoverflow.com/questions/32249723/how-to-capitalize-first-letter-after-period-in-each-sentence-using-java
		 StringBuilder result = new StringBuilder(str.length());
	        //First one is capital!
	        boolean capitalize = true;

	        //Go through all the characters in the sentence.
	        for(int i = 0; i < str.length(); i++) {
	            //Get current char
	            char c = str.charAt(i);

	            //If it's period then set next one to capital
	            if(c == '.') {
	                capitalize = true;
	            }
	            //If it's alphabetic character...
	            else if(capitalize && Character.isAlphabetic(c)) {
	                //...we turn it to uppercase
	                c = Character.toUpperCase(c);
	                //Don't capitalize next characters
	                capitalize = false;
	            }

	            //Accumulate in result
	            result.append(c);
	        }
		 	
		 	
	      return result.toString();
	    } 
	
	public static void printString(String[] stArr){
		for(int i=0;i<stArr.length;i++){
			System.out.print(stArr[i]+ " ");
		}
	}
	
}//end class
