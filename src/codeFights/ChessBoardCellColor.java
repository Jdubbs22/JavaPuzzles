package codeFights;

public class ChessBoardCellColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c1 ="A1", c2 = "C3", c3 = "H3";
		System.out.println(chessBoardCellColor(c1,c2));//true
		System.out.println(chessBoardCellColor(c1,c3));//false
	}//end main

	
	
	static boolean chessBoardCellColor(String cell1, String cell2) {
  		char[] c1 = cell1.toCharArray();
		char[] c2 = cell2.toCharArray();
		boolean isShaded=false;
		boolean IsShadedC1 = false;
		boolean IsShadedC2 = false;
		
		if(((c1[0]=='A' || c1[0] =='C' || c1[0] =='E' || c1[0] =='G') && c1[1] %2 !=0)
			|| ((c1[0] =='B' || c1[0] =='D' || c1[0] =='F' || c1[0] =='H') && c1[1] %2 ==0)){
			isShaded = true;
			IsShadedC1 = isShaded;
		}

		
			if(((c2[0]=='A' || c2[0] =='C' || c2[0] =='E' || c2[0] =='G') && c2[1] %2 !=0)
					|| ((c2[0] =='B' || c2[0] =='D' || c2[0] =='F' || c2[0] =='H') && c2[1] %2 ==0)){
			isShaded = true;
			IsShadedC2 = isShaded;
			}

		
		if(IsShadedC1 == IsShadedC2)
			return true;
			
		
		return false;
	}
	
	
}//end class
