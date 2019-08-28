package codeFights;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {

	public static void main(String[] args) {
		String test1 = "aabb";
		String test2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
		System.out.println(palindromeRearranging(test2));

	}// end main

	/*
	 * Given a string, find out if its characters can be rearranged to form a
	 * palindrome. A palindrome is a string that reads the same left-to-right
	 * and right-to-left.
	 */

	static boolean palindromeRearranging(String inputString) {  //this passes 18/20 tests...unsure what the failing 2 are
		int allowedOne = 0;
		char[] array = inputString.toCharArray();

		for (int i = 0; i < array.length; i++) {
			char current = array[i];
			boolean isEven = false;
			int temp = 0;
			for (int j = 0; j < inputString.length(); j++) {
				if (inputString.charAt(j) == current) {
					temp++;
				} // end if
			} // end internal for
			if (temp % 2 == 0) {
				isEven = true;
			} // end if
			else {
				isEven = false;
				allowedOne++;
			} // end else
		} // end for

		if (allowedOne < 2) {
			return true;
		}

		return false;
	}// end method

}// end class
