package demo;

import java.util.Scanner;

public class TernaryOperatorProblem1 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	int num=sc.nextInt();
	
	String  st2=(num%2==0)? "Even":"Odd";	
	
	System.out.println(st2);
	
}
}
