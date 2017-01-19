
public class Calculator {
	
	void additionCalculator (int[][] score) {
		
		int totalNumber1 = score[0][0] + score[0][1] + score[0][2] + score[0][3];
		int totalNumber2 = score[1][0] + score[1][1] + score[1][2] + score[1][3];
		int totalNumber3 = score[2][0] + score[2][1] + score[2][2] + score[2][3];
		int totalNumber4 = score[3][0] + score[3][1] + score[3][2] + score[3][3];
		
		int totalNumber = totalNumber1 + totalNumber2 + totalNumber3 + totalNumber4;
		
		System.out.println(totalNumber);
		
		double average1 = totalNumber1 / (score[0].length * 1.0);
		double average2 = totalNumber2 / (score[1].length * 1.0);
		double average3 = totalNumber3 / (score[2].length * 1.0);
		double average4 = totalNumber4 / (score[3].length * 1.0);
		
		System.out.println(average1);
		System.out.println(average2);
		System.out.println(average3);
		System.out.println(average4);
		
	}

}
