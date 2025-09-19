package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

	public static void main(String[] args){

		ArrayList<Employee> aa = new ArrayList();

		aa.add(new Employee("mahi",105,"dehchand"));
		aa.add(new Employee("ansh",101,"meerut"));
		aa.add(new Employee("ankit",102,"agra"));
		aa.add(new Employee("raj",100,"gurugram"));

		System.out.println(aa);
		
		Collections.sort(aa);
		System.out.println(aa);

	}

}
