import java.util.Scanner;

public class Gugudan {
	
	Scanner input = new Scanner(System.in);
	
	void gugudan() {
		
		System.out.println("보고싶은 구구단의 단을 입력하시오.(숫자만)");
		int number1 = input.nextInt();
		
		for(int i=1; i<10; i++ ){
			
			System.out.println(number1 + "x" + i + "=" + (number1*i));
			
		}
		
	}

}
