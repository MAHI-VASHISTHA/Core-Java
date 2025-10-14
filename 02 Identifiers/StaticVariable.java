package test;

public class StaticVariable {

	static int id;
	static String name;
	static String institude;

	static void hello() {
		System.out.println("101");
		System.out.println("mahi vashistha");
		System.out.println("Ducat institude");
		System.out.println("*************Great program***********");

	}

	public static void main(String[] arr) {

		System.out.println(id);

		StaticVariable s = new StaticVariable();
		s.hello();

		new StaticVariable().hello();

		hello();

		StaticVariable.hello();

	}
}