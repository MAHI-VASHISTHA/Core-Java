package ArrayList;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(5);
		al.add("mahi");
		al.add(45.2);
		al.add(true);
		al.add('h');

		System.out.println(al.size());

		al.add("vashistha");
		al.add(8654);

		System.out.println(al.size());
		for (int i = 1; i <= 3; i++) {
           al.remove(i);
		}
		System.out.println(al.size());

	}

}
