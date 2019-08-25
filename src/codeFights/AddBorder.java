package codeFights;
import java.lang.Object;
import java.util.List;
public class AddBorder {

	public static void main(String[] args) {
	String[] test = {"abc", "ded"};
	String[] test2 = {"a"};
	/*addBorder(test) = ["*****",
                      	 "*abc*",
                         "*ded*",
                         "*****"]
                      */
	printArray(addBorder(test));
	printArray(addBorder(test2));

	}//end main

	
	static String[] addBorder(String[] picture) {
		
		String[] answer = new String[picture.length+2];//changed from 3
	
		int length = picture[0].length()+2;
		String star= "*";
		String temp = String.format("%0" + length + "d", 0).replace("0", star);
		answer[0]= temp;
		answer[picture.length+1]= temp;//breaks on first test not second
		for(int i=1; i<=picture.length;i++){
			answer[i]= "*"+picture[i-1]+"*";
		}

		
		return answer;
	}
	
	public static void printArray(String[] ias){  //changed from String[] for testing
		
		for(int i=0;i<ias.length;i++){
			System.out.print(ias[i]);
			System.out.println();
		}
		System.out.println();
	}
	
	
}//end class
