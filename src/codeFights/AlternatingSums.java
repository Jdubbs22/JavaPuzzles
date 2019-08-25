package codeFights;

public class AlternatingSums {

	public static void main(String[] args) {
		int[] test = {50, 60, 60, 45, 70};
	printArray(alternatingSums(test));
	}//end main

	
	
	static int[] alternatingSums(int[] a) {
	/*	int[] answer = new int[2];
		int first = a[0];
		int second = a[1];
		   if(a[1]==0){
	            second =0;
	        }
		for(int i=2; i< a.length;i++){
			if(i%2 !=0){
				first += a[i];
			}
			if(i%2 ==0){
				second += a[i];
			}
		}//end for
		
		answer[0]= first;
		answer[1]= second;
		return new int[]{first, second};
		*/
		  int sum1 = 0, sum2 = 0;
	        for (int i = 0; i < a.length; i++) {
	            if (i % 2 == 0) {
	                sum1 += a[i];
	            } else {
	                sum2 += a[i];
	            }
	        }
	        return new int[]{sum1, sum2};
		
	}//end method

	public static void printArray(int[] ias){  //changed from String[] for testing
		
		for(int i=0;i<ias.length;i++){
			System.out.print(ias[i]+ " ");
		}
		System.out.println();
	}
	
}//end class
