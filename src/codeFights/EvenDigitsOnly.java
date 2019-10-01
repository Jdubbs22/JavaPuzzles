package codeFights;

public class EvenDigitsOnly {

	public static void main(String[] args) {
		

	}//end main

	
	
	boolean evenDigitsOnly(int n) {
		boolean meetsCriteria= false;
	String numAsString = Integer.toString(n);
	int[] numArray = new int[numAsString.length()];
	for(int i=0;i<numArray.length;i++){
		numArray[i] = numAsString.charAt(i) - '0';
		if(numArray[i] %2 ==0){
			meetsCriteria =true;
		}else{
			meetsCriteria= false;
		}
		if(meetsCriteria ==false)
			return false;
	}

		return true;
	}
	
}//end class

