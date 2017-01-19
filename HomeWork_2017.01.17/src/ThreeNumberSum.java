import java.util.Scanner;

public class ThreeNumberSum {
	
	Scanner input = new Scanner(System.in);
	
	void threeNumberSum() {
		
		System.out.println("세 개의 숫자를 더하는 계산기 입니다.");
		System.out.println("첫번째 숫자를 입력하시오.");
		int number1 = input.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int number2 = input.nextInt();
		
		System.out.println("세번째 숫자를 입력하세요.");
		int number3 = input.nextInt();
		
		int resulte = number1 + number2 + number3;
		System.out.println("세 숫자를 더한 값은" + resulte + "입니다.");
		
	}

}
