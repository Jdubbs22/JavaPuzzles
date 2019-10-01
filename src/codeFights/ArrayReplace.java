package codeFights;

public class ArrayReplace {

	public static void main(String[] args) {
		int[] test1 = {1,2,1};
		printArray(arrayReplace(test1, 1, 3));
		printArray(test1);
	}//end main

	
	static int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {

		for (int i=0; i<inputArray.length;i++){
			if(inputArray[i]==elemToReplace){
				inputArray[i]= substitutionElem;
			}
		}
		
		return inputArray;
	}
	
	static void printArray(int[] A){
		for(int i: A){
			System.out.print(i+ " ");
		}
	}
	
	
}//end class
