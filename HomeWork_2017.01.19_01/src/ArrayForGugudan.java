
public class ArrayForGugudan {
	
	void gugudan1() {
		
		int[][] gugudan1={ 
			{ 2, 4, 6, 8, 10, 12, 14, 16, 18 }, 
			{ 3, 6, 9, 12, 15, 18, 21, 24, 27 },
			{ 4, 8, 12, 16, 20, 24, 28, 32, 36 }, 
			{ 5, 10, 15, 20, 25, 30, 35, 40, 45 },
			{ 6, 12, 18, 24, 30, 36, 42, 48, 54 }, 
			{ 7, 14, 21, 28, 35, 42, 49, 56, 63 },
			{ 8, 16, 24, 32, 40, 48, 56, 64, 72 }, 
			{ 9, 18, 27, 36, 45, 54, 63, 72, 81 }
			};
		
		for(int i = 0; i < gugudan1.length; i++ ) {
			
			for(int j = 0; j<gugudan1[i].length; j++) {
				
				System.out.print(gugudan1[i][j] + " ");
				
			}
			System.out.println(" ");
			
		}
		
	}

}