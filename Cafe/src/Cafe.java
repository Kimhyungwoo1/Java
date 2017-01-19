
public class Cafe {
	public static void main(String[] args ) {
		
		Clerk jin = new Clerk();
		Clerk guest = new Clerk();
		Clerk guest2 = new Clerk();
		jin.hello();
		jin.question();
		guest.answer();
		jin.money();
		guest.no();
		jin.thankyou();
		
		jin.hello();
		jin.question();
		guest.answer1();
		jin.money1();
		guest.yes();
		jin.thankyou();
		
		
	}

}
