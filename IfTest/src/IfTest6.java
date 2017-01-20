import java.util.Scanner;

/**
 * 학점 계산하는 프로그램<br/>
 * 100점 A+<br/>
 * 90점 이상은 A<br/>
 * 80점 이상은 B<br/>
 * 70점 이상은 C<br/>
 * 60점 이상은 D<br/>
 * 그 이하는 F를 출력한다.<br/>
 * 
 * <pre>
 * 작성하고 싶은 내용을 자유롭게 작성하세요.
 * 그러면, 똑같이 보일꺼에요
 * </pre>
 * 
 * @author Kim Hung Woo ( woo6145@naver.com )
 */

public class IfTest6 {

	public static void main(String[] args){
		
		// 점수를 변수에 할당한다. 만점은 100점,
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int score = input.nextInt();
		
		//점수가 100점이라면, "A+" 를 출력한다.
		if(score == 100) {
			System.out.println("A+");
		}
		else if( score >= 90) {
			System.out.println("A");
		}
		else if ( score >=70 ){
			System.out.println("C");
		}
		else if ( score >=60 ){
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
	}

}









