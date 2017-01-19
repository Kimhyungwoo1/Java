
public class Array {
	
	public static void main(String[] args) {
		
		int Array[] = { 10, 20, 50, 80, 20, 100, 90, 80, 20, 50 };
		int nameCounts = Array.length;
		int i = 0;
		int sum = 0;
		
		while ( i<nameCounts ) {
			sum += Array[i];
			i++;
		}
		System.out.println(sum);
		
	}
	

}
