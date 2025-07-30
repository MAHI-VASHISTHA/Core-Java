package demo;

public class AssignedOperator {
public static void main(String[] args) {
	
	int a=17;
	int b=a%=(a*=3)/4+27;
	
	System.out.println("Result: "+b);
	
	
}
}
