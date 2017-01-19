
public class Calculator3Main {

	public static void main(String[] args) {
		
		Calculator3 man = new Calculator3();
//		man.calculator();
//		man.addition(100,400,3001);
//		
//		int[] number1 = new int[4];
//		number1[0] = 100;
//		number1[1] = 50;
//		number1[2] = 30;
//		number1[3] = 40;
//		
		int [] number1 = new int[] { 100,50,30,40 };
		int [] number2 = { 100,50,30,40 };
		
		man.sum(number2);
		
		String message = "안녕하세요. 제 이름은 김형우 입니다. 반갑습니다.";
		String[] splitedmessage = message.split(" ");
		System.out.println(splitedmessage[0]);
		System.out.println(splitedmessage[1]);
		System.out.println(splitedmessage[2]);
		System.out.println(splitedmessage[3]);
		System.out.println(splitedmessage[4]);
		System.out.println(splitedmessage[5]);
	
		}

}
