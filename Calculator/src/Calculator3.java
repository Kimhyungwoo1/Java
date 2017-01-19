import java.util.Scanner;

public class Calculator3 {

	Scanner input = new Scanner(System.in);

	int[] number1 = new int[4];

	int resulte1, resulte2 = 0;

	void calculator() {

		Scanner input = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		number1[0] = input.nextInt();

		System.out.println("숫자를 입력하세요.");
		number1[1] = input.nextInt();

		resulte1 = number1[0] + number1[1];
		System.out.println("두 숫자를 더한 값은" + resulte1 + "입니다.");

		resulte2 = number1[0] - number1[1];
		System.out.println("두 숫자를 뺀 값은 " + resulte2 + "입니다.");

	}

	void addition(int number1, int number2, int number3) {

		// Scanner input = new Scanner(System.in);
		//
		// System.out.println("숫자를 입력하세요.");
		// number1 = input.nextInt();
		//
		// System.out.println("숫자를 입력하세요.");
		// number2 = input.nextInt();
		//
		// System.out.println("숫자를 입력하세요.");
		// number3 = input.nextInt();

		resulte1 = number1 + number2 + number3;
		System.out.println("세개의 숫자를 더한 값은" + resulte1 + "입니다.");
	}

	void sum(int[] number1) {

		int resulte1 = number1[0] + number1[1] + number1[2] + number1[3];
		System.out.println("네개의 숫자를 더한 값은" + resulte1 + "입니다.");

		
		double resulte2 = (number1[0] + number1[1] + number1[2] + number1[3]) / (double) number1.length;
		System.out.println("네개의 숫자에 평균은" + resulte2 + "입니다.");

	}

	void gugudan(int[] number1) {

		for (int i = 1; i < 10; i++) {
			System.out.println(number1[0] + "x" + i + "=" + (number1[0] * i));

		}

		for (int i = 1; i < 10; i++) {
			System.out.println(number1[1] + "x" + i + "=" + (number1[1] * i));

		}

	}

	void temperature(double[] number1) {

		final double num1 = 1.8;
		final double num2 = 32;

		// System.out.println("화씨 온도를 입력하세요.");
		// number1 = input.nextInt();
		double resulte1 = ((number1[0] * num1) + num2);
		System.out.println("섭씨 온도는" + resulte1 + "입니다.");

		// System.out.println("섭씨 온도를 입력하세요.");
		// number2 = input.nextInt();
		double resulte2 = ((number1[1] - num2) / num1);
		System.out.println("화씨 온도는" + resulte2 + "입니다.");
	}

}
