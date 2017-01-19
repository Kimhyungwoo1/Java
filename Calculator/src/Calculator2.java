import java.util.Scanner;

public class Calculator2 {
	
	public static void main(String[] agrs) {
		
		//사용자에게 입력받을수 있는 객체를 만든다.
		Scanner input = new Scanner(System.in);
		
		//사용자에게 숫자를 입력받는다.
		System.out.println("숫자를 입력하세요.");
		int number = input.nextInt();
		
		//사용자에게 입력받은 숫자를 출력한다.
		System.out.println("사용자가 입력한 숫자는" + number + "입니다.");
	}

}
