package Statements;

import java.util.Scanner;

public class ProblemSolves1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int w = sc.nextInt();
		
		
    if(w==1) {
		System.out.println("Monday!");
    }
    
    else if(w==2){
		System.out.println("Tuesday!");

    }
 
     else if(w==3) {
		System.out.println("Wednesday!");

    	
    } else if(w==4) {
		System.out.println("Thrusday!");

    	
    } else if(w==5){
		System.out.println("Friday!");
    }
    
    else if(w==6){
		System.out.println("Saturday!");
    }
		else if(w==7){
			System.out.println("Sunday!");

	    		
    }else {
		System.out.println("Invalid value!");

    }
	}	
	}

