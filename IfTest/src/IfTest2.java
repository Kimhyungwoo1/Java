import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//int age = 10;
		System.out.println("나이를 입력하세요.");

		boolean inputDrink = input.nextInt() >= 30;

		if (inputDrink) {

			System.out.println("입장이 가능합니다. ");

		} 
		
		else {

			System.out.println("입장이 불가능 합니다. ");

		}

	}

}
