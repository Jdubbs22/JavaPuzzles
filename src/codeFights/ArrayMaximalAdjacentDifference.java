package codeFights;

public class ArrayMaximalAdjacentDifference {

	public static void main(String[] args) {
		int[] test1 = {2, 4, 1, 0};
		System.out.println(arrayMaximalAdjacentDifference(test1));

	}//end main

	
	public static int arrayMaximalAdjacentDifference(int[] inputArray) {
		
		int temp=0;
		int largest =0;
		
		for(int i=0; i<inputArray.length -1; i++){
			if(inputArray[i] > inputArray[i+1])
			temp = inputArray[i] - inputArray[i+1];
			if(inputArray[i] < inputArray[i+1])
				temp = inputArray[i+1] - inputArray[i];
			if (temp > largest)
				largest = temp;
		}//end for
		
		return largest;
	}
	
}//end class
