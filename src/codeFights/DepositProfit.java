package codeFights;

public class DepositProfit {

	public static void main(String[] args) {
		System.out.println(depositProfit(100, 20, 170));

	}
	
	
	static int depositProfit(int deposit, int rate, int threshold) {
		double currentTotal= deposit;
		int year =0;
		double percent = rate;
		percent = percent/100;
		
		while(currentTotal < threshold){
			currentTotal= (currentTotal*percent) + currentTotal;
			
			year++;
		
		}
		
		return year;
	
	}


}
