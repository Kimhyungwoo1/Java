import java.util.Scanner;

public class FourNumberSumAverage {
	
	Scanner input = new Scanner(System.in);
	
	void fourNumberSumAverage() {
		
		System.out.println("네 개의 숫자를 더하고 평균을 내는 계산기 입니다.");
		System.out.println("첫번째 숫자를 입력하세요.");
		int number1 = input.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요.");
		int number2 = input.nextInt();
		
		System.out.println("세번째 숫자를 입력하세요.");
		int number3 = input.nextInt();
		
		System.out.println("네번째 숫자를 입력하세요.");
		int number4 = input.nextInt();
		
		int resulteSum = number1 + number2 + number3 + number4;
		double resulteAverage = (number1 + number2 + number3 + number4) / 4; 
		
		System.out.println("더한값은" + resulteSum + "입니다.");
		System.out.println("평균값은" + resulteAverage + "입니다.");
		
	}

}
