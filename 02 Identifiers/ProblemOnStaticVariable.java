package test;

public class ProblemOnStaticVariable {

	int a = 0;
	static int b =0;

	void text() {
		System.out.println(a++ +" instance variable");
		System.out.println(b++ +" static variable");

	}
	public static void main(String[] arr) {
		
		ProblemOnStaticVariable p = new ProblemOnStaticVariable();
		ProblemOnStaticVariable p1 = new ProblemOnStaticVariable();
		ProblemOnStaticVariable p2 = new ProblemOnStaticVariable();

		p.text();
		p1.text();
		p2.text();

	}
}
