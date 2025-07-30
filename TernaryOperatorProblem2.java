package demo;

import java.util.Scanner;

public class TernaryOperatorProblem2 {
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num=sc.nextInt();
	
	String a=(num>0)? "Positive":(num==0)?"Zero":"Negative";
	
	System.out.println("Result: "+a);
	}
}
