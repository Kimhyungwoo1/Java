import java.util.Scanner;

/**
 * <pre>
 * 2. 1을 입력하면 점수 5개의 총점, 평균을 계산하는 프로그램
 *	  2를 입력하면 섭씨를 화씨로 변경하는 프로그램 (섭씨 X 1.8) + 32= 화씨
 * 	  3을 입력하면 BMI를 계산하는 프로그램 몸무게(kg) / (신장(m) x 신장(m))
 * 	  4를 입력하면 프로그램이 종료되도록 코딩하세요.
 *</pre>
 * @author Administrator
 *
 */
public class HomeWork2 {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1을 누르면 점수 5개 총점, 평균계산하는 프로그램");
		System.out.println("2을 누르면 섭씨를 화씨로 변경하는 프로그램");
		System.out.println("3을 누르면 BMI를 계산하는 프로그램");
		System.out.println("4를 누르면 프로그램 종료");
		
		while ( true ){
			
			System.out.println("번호를 누르시오 (1~4) ");
			int choosenumber = input.nextInt();
			
			if (choosenumber == 1){
				
				System.out.println("총점, 평균계산하는 프로그램");
				System.out.println("점수 5개를 입력하세요.");
				
				int number1 = 0;
				int sum = 0;
				
				for(int i = 0; i < 5; i++){
					number1 = input.nextInt();
					sum += number1;
				}
				double average = sum / 5.0;
				
				String message = String.format("점수 5개의 총점은 %d 이고, 평균은 %,2f 입니다.", sum, average);
				System.out.println(message);
				
			}
			
			if ( choosenumber == 2 ){
				
				System.out.println("섭씨를 화씨로 변경하는 프로그램");
				System.out.println("섭씨를 입력하세요.");
				
				double number1 = input.nextInt();
				double change = (number1 * 1.8) + 32;
				
				System.out.println(change);
			}
			
			if ( choosenumber == 3 ){
				
				//몸무게(kg) / (신장(m) x 신장(m))
				System.out.println("BMI를 구하는 프로그램");
				System.out.println("몸무게를 입력하세요.(kg단위로 입력해주세요.)");
				double weight = input.nextDouble();
				System.out.println("신장을 입력하세요.(m단위로 입력해주세요.)");
				double height = input.nextDouble();
				double bmi = weight / (height * height);
				String bmioutput = String.format("몸무게는 %.2f 이고, 신장은 %.23f 이므로 %.2f 입니다.", weight, height, bmi);
				System.out.println(bmioutput);
				
					
			}
			
			if( choosenumber == 4 ){
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		
		
	}

}
