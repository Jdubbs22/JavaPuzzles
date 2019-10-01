package codeFights;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExtractEachKth {

	
	/*
	 * For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
	 *	extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].
	 */
	
	public static void main(String[] args) {
		int[] test1 = {1,2,3,4,5,6,7,8,9,10};
		printArray(test1);
		printArray(extractEachKth(test1, 3));

	}//end main

	
	
	static int[] extractEachKth(int[] inputArray, int k) {
		 List<Integer> arrayList = IntStream.of(inputArray) 
                 .boxed() 
                 .collect(Collectors.toList());
		 
		 arrayList.remove(k-1);
		 arrayList.remove(k+1);
		 arrayList.remove(k+3);
		 
		 
		
		return arrayList.stream() 
	            .mapToInt(Integer::intValue) 
	            .toArray();
	}
	
	
	public static void printArray(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
}//end class
