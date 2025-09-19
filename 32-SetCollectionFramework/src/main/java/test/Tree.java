package test;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		Set<Integer> ss=new TreeSet<>();
		ss.add(12);
		ss.add(5);
		ss.add(8);
		ss.add(45);
		ss.add(1);
		ss.clear();
		
		System.out.println(ss);
		System.out.println(ss.isEmpty());

	}

}
