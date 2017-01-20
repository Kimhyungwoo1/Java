
public class IfTest3 {
	
	public static void main(String[] args){
		
		/*
		 * 현금이 없고 신용카드가 있을 경우 "신용카드로 결제합니다."를 출력하는 프로그램
		 */
		
		boolean hasCreditCrad = true;
		
		boolean hasCash = false;
		
		//boolean inCard = hasCash == false && hasCreditCrad == true;
		boolean inCard = !hasCash  && hasCreditCrad;
		
		if( inCard ) {
			
			System.out.println("신용카드로 결제합니다.");
			
		}
		
		else {
			
			System.out.println("현금으로 결제합니다.");
			
		}
		
		
	}

}
