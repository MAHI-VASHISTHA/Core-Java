package test;

public class FinallyBlock {
public static void main(String[] args) {
	try{
		System.out.println("Try block started");
		int a=52;
		int b=2;
		int c=a/b;
		System.out.println(c);
		System.out.println("Try block ended");

	}
	catch(Exception e) {
		System.out.println("catch block started");
	}
	finally {
		System.out.println("finally block started");

	}
}
}
