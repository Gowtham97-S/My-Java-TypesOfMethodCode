package TypeOfMethods;

public class StaticMethod {

	static int z = 20;
	public static void add() {
		
		int A = 52;
		int B = 52;
	    int c = A+B;
	System.out.println(c+z);
	}
	static {
		System.out.println("Static Method");
	}
	public static void main (String[]args) {  
		add();
		
		System.out.println(z);
		
	}
}
