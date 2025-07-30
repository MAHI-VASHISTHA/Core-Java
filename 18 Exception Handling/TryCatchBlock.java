package pack1;

public class TryCatchBlock {

	public static void main(String[] args) {

		try{
			
			int a=10;
			int b=0;
			int c=a/b;
			
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic exception");

		}
		finally {
			System.out.println("finally block");
		}
	}

}
