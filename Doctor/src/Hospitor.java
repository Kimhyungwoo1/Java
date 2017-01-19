
public class Hospitor {
	public static void main(String[] args ){
		
		//의사 객체(담당자)에게 
		Doctor hyungwoo = new Doctor();
		hyungwoo.inquery();
		hyungwoo.tretment();
		hyungwoo.prescription();
		
		Doctor jungap = new Doctor();
		jungap.inquery();
		jungap.tretment();
		jungap.prescription();
		
	}

	
}
