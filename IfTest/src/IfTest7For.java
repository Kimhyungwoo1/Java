import java.util.Scanner;

/**
 * <pre>
 * 3번 반복
 * "지금 날씨는 어떤가요?"를 출력한다.
 * "1: 비가 옵니다. 2: 맑습니다."를 출력한다.
 * 1을 입력하면 "우산을 챙겨가세요."
 * 2를 입력하면 "우산은 필요없어요."를 출력한다
 * </pre>
 * 
 * @author Administrator
 *
 */
public class IfTest7For {

	public static void main(String[] args) {

		for (int i = 0; i > 3; i++) {
			Scanner input = new Scanner(System.in);

			System.out.println("지금 날씨는 어떤가요?");
			System.out.println("1: 비가 옵니다. 2: 맑습니다.");
			int number = input.nextInt();

			if (number == 1) {
				System.out.println("우산을 챙겨가세요.");
			} 
			else if (number == 2) {

				System.out.println("우산은 필요없어요.");
			}
		}
	}

}
