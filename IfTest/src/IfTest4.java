import java.util.Scanner;

public class IfTest4 {

	public static void main(String[] args) {

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
		
		//String.format 사용법 숙지하기
		String message = String.format("총점은 %d , 평균은 %.2f점 입니다.", sum, average);
		System.out.println(message);

		if (average >= 90) {
			System.out.println("참 잘했어요!");
		}

	}

}
