package test;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHash {

	public static void main(String[] args) {

		Set<Integer> ss=new LinkedHashSet<>();
		ss.add(12);
		ss.add(5);
		ss.add(8);
		ss.add(45);
		ss.add(1);
		
		System.out.println(ss);
		System.out.println(ss.isEmpty());

	}

}
