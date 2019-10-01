package codeFights;


/*IPv4 address is a string with the following structure: a.b.c.d, 
 * where a, b, c and d are integers in range [0, 255]. For example, 
 * 0.0.0.0, 255.255.255.255 or 252.0.128.32 are correct IPv4 addresses, 
 * and 0.0.0.256, -1.1.1.1, 0.0.0.0.0 are incorrect.
 * a.b is named network part and c.d is named host part.
 */



public class IsIPv4Address {

	public static void main(String[] args) {
		String test1 = "172.16.254.1";  //true
		String test2 = "172.316.254.1";  //false
		String test3 = ".254.255.0";  // false
		String test4= "1.1.1.1.1"; //false
		String test5 = "1";//false
		printArray(test2.split("\\."));
		System.out.println(isIPv4Address(test1));
		System.out.println(isIPv4Address(test2));
		System.out.println(isIPv4Address(test3));
		System.out.println(isIPv4Address(test4));
		System.out.println(isIPv4Address(test5));
	}//end main

	
	
	 static boolean isIPv4Address(String inputString) {

		String[] variables = inputString.split("\\.");
		int temp =-1;
		boolean meetsCriteria = false;
		

		if(variables.length!=4)return false;
		
		for(int i=0;i<variables.length;i++){
		try{
		temp = Integer.parseInt(variables[i]);	}  //if it's empty of null it will also throw this
		catch(Exception e){
			return false;
		}
		if(temp >=0 && temp <=255){
			meetsCriteria = true;}
		else{
			meetsCriteria=false;
		}
		
		if(meetsCriteria == false){
				return false;
		}
			
			
				
		}//end for
	return true;
				
		
	
	}//end method
	
	 public static void printArray(String[] s){
		 for(int i=0; i<s.length; i++){
			 System.out.println(s[i]);
		 }
			 
	 }
	
}//end class
