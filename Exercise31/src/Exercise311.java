
public class Exercise311 {
	public static void main(String[] args) {
		
		//Input your hex number:
		final String a = "5ED4", b = "07A4";
		
		//convert to decimal
		int intA = Integer.parseInt(a,16);
		int intB = Integer.parseInt(b,16);
		
		//print results
		System.out.println("A = " + Integer.toBinaryString(intA) + 
				"\tB = " + Integer.toBinaryString(intB));
	}
}
