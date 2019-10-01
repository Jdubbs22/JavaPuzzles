package codeFights;


/*
 * Correct variable names consist only of English letters, 
 * digits and underscores and they can't start with a digit.
	Check if the given string is a correct variable name.
 */

public class VariableName {

	public static void main(String[] args) {
	String test1 = "qq-q"; //false
	String test2 = "var_1__Int";  //true
	System.out.println(variableName(test1));
	System.out.println(variableName(test2));
	}//end main

	
	static boolean variableName(String name) {
	
		char[] c = name.toCharArray();
		boolean isDigit =Character.isDigit(c[0]);
		boolean meetsCriteria= false;
		if(isDigit== true){
			return false;
		}
		
		for(int i=0;i<c.length;i++){
			int ascii = (int) c[i];
			isDigit =Character.isDigit(c[i]);
			if((ascii >= 65 && ascii<= 90) || ascii== 95 || (ascii >= 97 && ascii<= 122)|| isDigit==true){
			meetsCriteria = true;
			}
			else{
				meetsCriteria= false;
			}
			
			if (meetsCriteria== false){
				return false;
			}
			
		}

		return true;
	}
	
	
}//end class
