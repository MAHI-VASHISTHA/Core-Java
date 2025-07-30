package pack1;

public class StaticMethod {

	public static void details() {
		System.out.println("****showing details****");
	}
	
	public static void info() {
		System.out.println("****static method****");
	}
	
	
	
	public static void main(String[] args) {

		details();
		StaticMethod.info();
	}

}
