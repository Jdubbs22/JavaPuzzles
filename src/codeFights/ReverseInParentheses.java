package codeFights;

import java.util.Arrays;

public class ReverseInParentheses {

	public static void main(String[] args) {
		String one = "(badcr)";
		System.out.println(reverseParentheses(one));

	}//end main

	
//	static String reverseInParentheses(String inputString) {
	/*	char[] array = inputString.toCharArray();
		int front=0;
		int back =array.length-1;
		for(int i=0;i<array.length;i++){
			if(array[i]== '('){
				front = i;
			}//end if
			if(array[i]== ')'){
				back = i;
			}//end if
		}//end for
		
	
		String r = "";
		for (int i = back-1; i>front; i--) {
         //  array[i]= answer[i];
			 r += Character.toString(array[i]);
			
	
		 /* 
	        int j = back-1; 
	        char temp = array[ back-1];
	        for (int i = front+1; i < back; i++) { 
	           array[j]= array[i]; 
	            j = j - 1; 
	        }//end for
	       array[front+1]= temp;
	      
	     //   String s = new String(array);
		}
	//	System.out.println();
		String s = new String();
	     //  s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		String temp = s.substring(front + 1, back);
        return (s.substring(0, front) + r + s.substring(back + 1));
			
	}//end method  
	*/
	static String reverseString(String inputString){
	    char[] try1 = inputString.toCharArray();
	    String r = "";
	    for (int i = try1.length-1; i>=0; i--)
	        r += Character.toString(try1[i]);

	    return r;
	}

	static String reverseParentheses(String inputString) {
	    int begin = 0;
	    int end = inputString.length() - 1;
	    for(int i = 0; i < inputString.length(); i++){
	        if(inputString.charAt(i) == '(')
	            begin = i;
	        if(inputString.charAt(i) == ')'){
	            end = i;
	            String temp = inputString.substring(begin + 1, end);
	            return reverseParentheses(inputString.substring(0, begin) + reverseString(temp) + inputString.substring(end + 1));
	         }
	    }
	    return inputString;
	}//end method
}//end class


/*
For inputString = "(bar)", the output should be
reverseInParentheses(inputString) = "rab";
For inputString = "foo(bar)baz", the output should be
reverseInParentheses(inputString) = "foorabbaz";
For inputString = "foo(bar)baz(blim)", the output should be
reverseInParentheses(inputString) = "foorabbazmilb";
For inputString = "foo(bar(baz))blim", the output should be
reverseInParentheses(inputString) = "foobazrabblim".
Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
*/