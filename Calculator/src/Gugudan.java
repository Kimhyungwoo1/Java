import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Calculator3 min = new Calculator3();

		int[] number1 = new int[4];

		System.out.println("숫자를 입력하세요.");
		number1[0] = input.nextInt();

		System.out.println("숫자를 입력하세요.");
		number1[1] = input.nextInt();

		min.gugudan(number1);

	}

}
