import java.util.Scanner;

public class Gugudan {

	Scanner input = new Scanner(System.in);

	void gugudan() {

		int number, number2;

		System.out.println("======구구단 프로그램======");
		System.out.println("원하시는 구구단을 입력하세요. (입력범위 : 2~9)");
		System.out.print("원하는 구구단 : ");
		number = input.nextInt();
		System.out.println("========================");
		System.out.println("원하는 구구단을 출력합니다.");

		int i = 0;
		while (i < 9) {

			i++;
			System.out.println(number + "x" + i + "=" + (i * number));

		}

	}

}
