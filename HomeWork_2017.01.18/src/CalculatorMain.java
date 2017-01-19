
public class CalculatorMain {
	
	public static void main(String[] args) {
		
		int[][] score = {
				{50, 40, 90, 100},
				{40, 30, 80, 70},
				{70, 80, 70, 60},
				{100, 40, 80, 90}
		};
		
		Calculator student = new Calculator();
		student.additionCalculator(score);		
	}

}
