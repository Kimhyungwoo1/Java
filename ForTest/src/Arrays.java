
public class Arrays {

	public static void main(String[] args) {

		String[] names = { "유정", "김형우", "최석" };
		// 출력
		// 정수형 변수 i 는 0 부터 시작해 names의 개수보다 작을 때 까지 1씩 증가하며 반복한다.
		for (int i = 0; i < names.length; i++) {

			System.out.println(i);
			System.out.println(names[i]);
		}

		int[] scores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// 합계 계산후 출력

		int sum = 0;
		// 정수형 변수 i는 0부터 시작해 scores의 개수보다 작을동안 1씩 증가하며 반복한다.
		for (int i = 0; i < scores.length; i++) {

			System.out.println("현재 i의 값 : " + i);
			System.out.println("i 번째 원소의 값 : " + scores[i]);
			sum += scores[i];
			System.out.println("현제까지 점수의 총함 " + sum);

		}

		System.out.println("최종 점수 총 합 :" + sum);
		
		
		//foreach *엄청나게 많이 쓰인다*
		//for를 간편하게 사용하기 위한 방법
		//배열요소를 순차로 꺼내어 준다.
		//매우매우 빠르다
		//for보다 빠르다
		
		for( String name : names ){
			
			System.out.println(name);
			
		}

	}

}
