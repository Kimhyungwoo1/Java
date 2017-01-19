
public class Calculator {
	
	//맴버변수 두개를 선언하고 초기화한다.
	int number1 = 100;
	int number2 = 300;
	int number3 = 400;
	int number4 = 200;
	
	void calculator() {
				
		int add = number1 + number2;
		int sub = number2 - number1;
		int mul = number3 * number4;
		int div = number4 / number2;
		int divl = number4% number2;
		
		System.out.println("계산기");
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(divl);
		
	}
	
	void grade() {
		
		int programing = 87;
		int operation = 98;
		int math = 75;
		
		System.out.println("학점");
		System.out.println(programing);
		System.out.println(operation);
		System.out.println(math);
		
	}
	
	void usd() {
		
		int usd = 3000;
		double 환율 = 1185.20;
		double krw = usd * 환율;
		
		System.out.println("환률");
		System.out.println(usd * 환율 + "=" + krw);
		
	}
	
	void apple() {
		
		int ipadPro = 999000;
		double 할인 = 0.15;
		//double 결과 = ipadPro * 할인;
		
		System.out.println("아이페드프로할인");
		System.out.println(ipadPro + "*"+ 할인 + "=" +(ipadPro * 할인) );
		
	}
	
	void temperature() {
		
		int 화씨 = 234;
		int 섭씨 = 32;
		double 화씨계산 = (섭씨 * 1.8) + 32;
		double 섭씨계산 = (화씨 -32) / 1.8;
		
		System.out.println("화씨섭시계산");
		System.out.println(화씨계산);
		System.out.println(섭씨계산);
		
	}

}
