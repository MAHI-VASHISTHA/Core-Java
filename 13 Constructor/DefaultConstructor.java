package text;

public class DefaultConstructor {
//here we have not create any constructor but constructor will be called when we  
//	created the object of that class.
	int id;
	String name;

	public static void main(String[] args) {

		DefaultConstructor dc = new DefaultConstructor();
		System.out.println(dc.id);
		System.out.println(dc.name);

	}

}
