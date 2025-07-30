package Statements;

import java.util.Scanner;

public class Ifcondition {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num=sc.nextInt();
	
	
	if(num>0) { 
	System.out.println("Positive");	
	}
	if(num==0) {
		System.out.println("Zero");	
	}
	if(num<0) {
		System.out.println("Negative");	
		}

	
}
	}
