
public class StringOutputMain {
	
	public static void main(String[] args) {
		
		StringOutput man = new StringOutput();
		
		String strPoint = "김 최 유 빌";
		
		char name1 = strPoint.charAt(0);
		char name2 = strPoint.charAt(1);
		char name3 = strPoint.charAt(2);
		char name4 = strPoint.charAt(3);
		
		char[] strPoint1 = {name1, name2, name3, name4};
		man.stringOutput(strPoint1);
		
	}

}
