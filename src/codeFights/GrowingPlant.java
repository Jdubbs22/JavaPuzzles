package codeFights;

public class GrowingPlant {

	public static void main(String[] args) {
		
		
	//	System.out.println(growingPlant(100, 10, 910));  //answer is 10 (days)
	//	System.out.println(growingPlant(10, 9, 4)); // 1
	//	System.out.println(growingPlant(5, 2, 7)); //2
		System.out.println(growingPlant(6, 5, 10)); //5
		
	}//end main

	
	
	static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
		int firstHeight =0;
		int height =upSpeed - downSpeed;
		int count=0;
		int day =0;
		
		if(upSpeed>=desiredHeight){
			return 1;
		}//end if
		else{
			while(height < desiredHeight){
				height+= upSpeed;
				day++;
				height -= downSpeed;
			}//end while
		}//end else
		
		
		
		/*while(firstHeight < desiredHeight){
			height += upSpeed - downSpeed;
			count++;
			firstHeight = height+ upSpeed;
			if(firstHeight>=desiredHeight){
				break;
			}
		}//end while  */
		
		return day;
	}

	
	
}//end class
