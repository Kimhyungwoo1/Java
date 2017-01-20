
public class IfTest1 {

	public static void main(String[] args) {

		/*
		 * 주머니에 돈이 1200원 이상 있다면, 캔커피를 살 수 있습니다. 를 출력하는 프로그램
		 */

		// 주머니에 있는 돈을 설정함.
		int moneyInPocket = 1200;

		// 주머니에 돈이 1200원 이상인지 확인함.
		boolean isOver1200 = moneyInPocket >= 1200;
		if (isOver1200) {

			// 1200원 이상이라면, "캔커피를 살 수 있습니다." 를 출력함.
			System.out.println("캔커피를 살 수 있습니다.");
		}

	}

}
