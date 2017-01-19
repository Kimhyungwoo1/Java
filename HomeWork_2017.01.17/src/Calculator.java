import java.util.Scanner;

public class Calculator {
	
	Scanner input = new Scanner(System.in);
	
	void calculatorSum() {
		
		System.out.println("계산기 덧셈입니다.");
		System.out.println("첫번째 숫자를 입력하세요");
		int number1 = input.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요");
		int number2 = input.nextInt();
		
		int resulte1 = number1 + number2;
		System.out.println("값은" + resulte1 + "입니다.");
		
	}
	
	void calculatorSub() {
		
		System.out.println("계산기 뺄셈입니다.");
		System.out.println("첫번째 숫자를 입력하세요");
		int number3 = input.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요");
		int number4 = input.nextInt();
		
		int resulte2 = number3 - number4;
		System.out.println("값은" + resulte2 + "입니다.");
		
	}
}
