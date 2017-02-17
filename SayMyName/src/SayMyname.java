
public class SayMyname {

	public static void main(String[] args) {
		
		String phoneNumber;
		phoneNumber = "010-4942-8361";
		
		System.out.println(phoneNumber);
		
		System.out.println(26+30);
		
		int myAge = 26;
		int yourAge = 31;
		
		int sumAge = myAge + yourAge;
		
		System.out.println(myAge + yourAge);
		
		System.out.println("10 == 10" + (10 == 10));
		System.out.println("10 != 10" + (10 != 10));
		System.out.println("!(10 == 10) : " + !(10 == 10));
		
		int bigAge = ( myAge > yourAge ) ? myAge : yourAge; // ? 의 의미는 맞니? 라는 의미이다.
		System.out.println(bigAge);
		
		int count = 0;
		System.out.println(++count);
		System.out.println(count++);
		System.out.println(++count);
		System.out.println(count++);
		System.out.println(++count);
		System.out.println(count++);
		System.out.println(++count);
		System.out.println(count++);
		
	}
}
