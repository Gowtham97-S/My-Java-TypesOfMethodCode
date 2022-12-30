package TypeOfMethods;

public class MethodWithParameter {

	public void add(int A, int B) {  //method with parameters or arguments

		int C = A+B;
		System.out.println(C);		
	}
	public static void main (String []args) {
		MethodWithParameter plus = new MethodWithParameter();
		plus.add(122,8);
	StaticMethod.add();
	System.out.println(StaticMethod.z);
	}
}
