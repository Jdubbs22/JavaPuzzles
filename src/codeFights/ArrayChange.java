package codeFights;
/*
 * You are given an array of integers. On each move you are allowed to increase exactly 
 * one of its element by one. Find the minimal number of moves required to obtain a 
 * strictly increasing sequence from the input.
 * exp: For inputArray = [1, 1, 1], the output should be
	arrayChange(inputArray) = 3

	inputArray: [-1000, 0, -2, 0]
	Expected Output:
	5

	inputArray: [2, 1, 10, 1]
	Expected Output:
	12
 */
public class ArrayChange {

	public static void main(String[] args) {
	int[] test1 = {-1000, 0, -2, 0};
	int[] test2 = {1,1,1};
	int[] test3 = {2,1,10,1};
	System.out.println(arrayChange(test1));
	}//end main

	
	
	
static	int arrayChange(int[] inputArray) {
		int temp=0;
		
		for(int i=0; i<inputArray.length-1;i++){
			int temp2=inputArray[i];
			if(inputArray[i]> inputArray[i+1]){
				temp2+=1;
				inputArray[i]=temp2;
				temp+= (temp2- inputArray[i+1]);
			}//end if
			if(inputArray[i]==inputArray[i+1]){
				temp++;
			}
		}//end for

		
		
		return temp;
	}//end method
	
	
public static void printArray(int[] ias){  //changed from String[] for testing
		
		for(int i=0;i<ias.length;i++){
			System.out.print(ias[i]+ " ");
		}
		System.out.println();
	}
	
	
}//end class
