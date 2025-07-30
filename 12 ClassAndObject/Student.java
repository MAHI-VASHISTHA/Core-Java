package text;

public class Student {

	int id = 101;
	String name = "mahi vashistha";
	String course = "java fullstack";

	void show() {

		System.out.println(id);
		System.out.println(name);
		System.out.println(course);
		System.out.println("**************************");


	}

	public static void main(String[] args) {

		Student s = new Student();
		s.show();
		s.show();
		s.show();
		

	}

}
