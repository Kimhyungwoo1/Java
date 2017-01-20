import java.util.Scanner;

public class IfTest5 {

	public static void main(String[] args) {
		
		/*
		 * 프로그램, 경영, 수학, 알고리즘의 점수를 받아서
		 * 총점과 평균을 계산하고 출력한다. 
		 * 만약 90점 이상이라면 "참잘했어요!" 그 이하라면 "노력하세요!"를 출력한다.
		 */

		Scanner input = new Scanner(System.in);
		
		System.out.println("학점을 입력하세요");
		
		System.out.print("프로그래밍 : ");
		int programing = input.nextInt();

		System.out.print("경영 : ");
		int management = input.nextInt();

		System.out.print("수학 : ");
		int meth = input.nextInt();

		System.out.print("알고리즘 : ");
		int algorithm = input.nextInt();

		int sum = programing + management + meth + algorithm;
		double average = sum / 4.0;

		String message = String.format("총점은 %d , 평균은 %.2f점 입니다.", sum, average);
		System.out.println(message);

		if (average >= 90) {
			System.out.println("참 잘했어요!");
		}
		
		else {
			System.out.println("노력하세요!");
		}

	}

}
