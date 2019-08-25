package codeFights;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class IsLucky {

	public static void main(String[] args) {
	/*	int one= 1230;
		int two = 239017;
		System.out.println(isLucky(one));
		System.out.println(isLucky(two));
		*/
		
		int [] test = {-1, 150, 190, 170, -1, -1, 160, 180};
		printArray(sortByHeight(test));
	}//end main

	
	
	static boolean isLucky(int n) {
		
		int temp =0;
		int temp2=0;
		String str1 = Integer.toString(n);
		char[] array = str1.toCharArray();
		
		for(int i=0;i<array.length/2;i++){
			temp+=(int)array[i];
		}
		for(int j =array.length/2;j<array.length;j++){
			temp2+=(int)array[j];
		}
		if(temp == temp2)
		return true;
		else
			return false;
	}//end method
	
	 //-1 is the trees...they always stay in the same position everything else goes from
	//lowest to highest  vvv
	
	static int[] sortByHeight(int[] a) {  

		
		 List b = new Vector();  //vector is a resizable array type
		    for(int i:a) {
		    	if(i > -1){
		    		b.add(i);
		    	}//end if
		    }//end for
		    Collections.sort(b);  //is used to sort the elements present in the specified list of Collection in ascending order.
		    Iterator it = b.iterator();  //itterates through b
		    for(int i = 0, j = 0;i < a.length;i++){
		        if(a[i] > -1) a[i] = (Integer)it.next();//if it isn't -1 replace with the sorted array
		        j++;
		    }
		    return a;

	}//end method
	
	public static void printArray(int[] ias){  //changed from String[] for testing
		
		for(int i=0;i<ias.length;i++){
			System.out.print(ias[i]+ " ");
		}
		System.out.println();
	}
}//end class
