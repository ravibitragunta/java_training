package training.day2;

public class Arrays_Types {
	
	public static void main (String[] args) {
		
		
		// ------------
		
		// ------------
		// ------------
		// ------------
		int[] listOfInts = new int[] {1,2,3,4,5,6,7,8,9,10};
		                           // 1,2,3,4,5,6,7,8,9,10
								   // 0,1,2,3,4,5,6,7,8,9
		
		
		
		
		
		
		
		/*for (int i = 0; i < listOfInts.length; i++) {
			if (listOfInts[i]%2 == 0) {
				System.out.println(listOfInts[i]);
			}
				
		}*/
		
		for (int i : listOfInts) {
			if (i %2 ==0)
				System.out.println(i);
		}
		
		
int [][] twoDimensionalArray = new int[10][20];
		
		twoDimensionalArray[0] = new int[] {1,1,1,1,1,1,1};
		twoDimensionalArray[1] = new int[] {2,2,2,2,2,2,2};
		
		
		for (int i = 0; i < twoDimensionalArray.length; i++) {
			for (int j =0; j< twoDimensionalArray[i].length; j++) {
				System.out.println( "value @ the ith, jth index " + twoDimensionalArray[i][j]);
			}
		}
		
		
		/*for (int i : listOfInts) {
			System.out.println(i);
		}*/
		
		
	}

}
