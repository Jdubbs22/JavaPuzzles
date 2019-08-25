import java.io.*;
// taken from http://candidjava.com/tutorial/program-to-search-word-in-a-file/
public class ReadingFromFile {
	
	public static void main(String[]args) throws IOException{
		 
	//	File file = new File("C:\\Users\\durfm\\Documents\\temp\\testDoc.txt");
		File file = new File("C:\\Users\\durfm\\Documents\\theOldManAndTheSea.txt");
		  String[] words=null;  //Intialize the word Array
	      FileReader fr = new FileReader(file);  //Creation of File Reader object
	      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
	      String s;     
	      String input="man";   // Input word to be searched
	      int count=0;   //Intialize the word to zero
	      while((s=br.readLine())!=null)   //Reading Content from the file
	      {
	    	// System.out.println(s); //prints the contents of the document
	         words=s.split(" ");  //Split the word using space
	          for (String word : words) //enhanced for loop
	          {
	                 if (word.equals(input))   //Search for the given word
	                 {
	                   count++;    //If Present increase the count by one
	                 }//end if
	          }//end for
	      }//end while
	      if(count!=0)  //Check for count not equal to zero
	      {
	         System.out.println("In the above file the given word("+input+") is present "+count+ " Time(s)");
	      }//end if
	      else
	      {
	         System.out.println("The given word is not present in the file");
	      }//end else
	      
	      
	         fr.close();
	   

	}//end main
	

	

}//end class
