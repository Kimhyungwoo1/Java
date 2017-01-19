
public class TypeCasting {
	
	public static void main(String[] args) {
		
		/* 
		 * int    4byte
		 * long   8byte
		 * float   4byte
		 * double 8byte
		 * 
		 * 4byte + 4byte = 4byte
		 * 8byte + 4byte = 8byte
		 * 4byte + 8byte = 8byte
		 * 8byte + 8byte = 8byte
		 * 
		 */
		
		// 4byte + 4byte
		int numberOne = 10;
		int numberTwo = 30;
		
		//4byte = 4byte + 4byte;
		int resulte = numberOne + numberTwo;
		
		float resulte2 = 50 + 50.0F;
		
		//---------------------------------------
		
		//명시적 캐스팅
		int number2 = (int) (10 + 10.6);
		double floatingNumber = 50.1233;
		int number3 = 1000;
		
		int number4 = number3 + (int) floatingNumber;
		
	}

}
