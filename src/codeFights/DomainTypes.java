package codeFights;

import java.util.Arrays;
import java.util.List;

public class DomainTypes {

	public static void main(String[] args) {
		String[] test = {"en.wiki.org", "codesignal.com", "happy.net", "code.info"};
		
		String[] test2 = {
				"com.net.info", 
				 "org.com.net", 
				 "net.com.org", 
				 "info.net.com", 
				 "net.net.com", 
				 "com.com.org", 
				 "info.info.net", 
				 "org.org.info"};
		printArray(domainType(test));
		printArray(domainType(test2));

	}//end main

	
	static String[] domainType(String[] domains) {
	    
	    String org = ".org";
	    String com = ".com";
	    String net = ".net";
	    String info = "info";//took out the .
	    String[] answer = new String[domains.length];
	    // lastFourDigits = input.substring(input.length() - 4);
	     for(int i =0;i<answer.length;i++){  
	    	String lastFourDigits = domains[i].substring(domains[i].length() - 4);
	        if(lastFourDigits.contains(org)){
	         answer[i]="organization";
	      
	        }//end if
	        if(lastFourDigits.contains(com)){
		         answer[i]="commercial";
		      
		        }//end if
	        if(lastFourDigits.contains(net)){
		         answer[i]="network";
		        
		        }//end if
	        if(lastFourDigits.contains(info)){
		         answer[i]="information";
		        
		        }//end if
	       
	    
	     }//end for
	  return answer;

	}//end method
	
public static void printArray(String[] ias){  
		
		for(int i=0;i<ias.length;i++){
			System.out.print(ias[i]+ " ");
		}
		System.out.println();
	}
public static void printArray2(List<String> list){  
	
	for(String element : list){
		System.out.print(element+ ", ");
	}
	System.out.println();
}
	
	
}//end class
