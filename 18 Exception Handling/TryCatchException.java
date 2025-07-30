package test;

public class TryCatchException {
public static void main(String[] args) {
	try {
	String s=null;
	System.out.println(s.length());
	}
	catch(NullPointerException r) {
		System.out.println("String is null");
	}
}
}
