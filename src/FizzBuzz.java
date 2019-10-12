
public class FizzBuzz {
	/*
	 * Write a program that prints the numbers from 1 to 100 and for multiples of '3'
	print "Fizz" instead of the number and for the multiples of '5' print "Buzz". 
	*/
	public static void main(String[] args) {
		FizzBuzz();
	//	printTriangle(5);
	}//end main

	public static void FizzBuzz(){
		
		for(int i=1;i<=100;i++){
		 if( i % 15==0){
				System.out.print(" FizzBuzz");
			}//end if
		 else if(i %3==0){
				System.out.print(" Fizz ");
			}//end else
			
			else if(i % 5 ==0){
				System.out.print(" Buzz ");
				
			}//end else
			
			else{
				System.out.print(" "+i+" ");
			}//end else
		}//end for
		
	}//end method
	
	public static void printTriangle (int n){
		for (int i =1; i<=n;i++){
			triHelper(i);
			System.out.println();
		}
			
		
		
	}//end method
	
	public static void triHelper(int k){
		for(int i =1;i<=k;i++)
			System.out.print(k + " ");
	}//end method
	
}//end class
