package demo;

public class LogicalOperator {
public static void main(String [] args) {
	
	int a=45;
	
	if(a++ + ++a == 92 && a-- + a - 3 - a-- +3!=42) {
		System.out.println(a--);
	}
	System.out.println(a);

	}
}

