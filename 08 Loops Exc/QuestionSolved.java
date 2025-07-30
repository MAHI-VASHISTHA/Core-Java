import java.util.Scanner;

public class QuestionSolved {
public static void main(String[] args) {
	
//	1. Write a program in java to display the first 100 natural numbers.  
//	Expected Output :
//	1 2 3 4 5 6 7 8 9 10 . . .
//	 
//	for(int i=1;i<=100;i++) {
//		
//		System.out.println(i);		
//	}
//	**************************************************************
//	2. Write a java program to find the sum of first 10 natural numbers.  
//	Expected Output :
//	The first 10 natural number is :
//	1 2 3 4 5 6 7 8 9 10
//	The Sum is : 55
	
//	int sum=0;
//
//	for(int i=1;i<=10;i++) {
//		
//		System.out.println(i);
//		
//		sum=i+sum;
//
//	}
//System.out.println("The Sum is: "+sum);
	
//	 ***************************************************************
	
//	3. Write a program in java to display n terms of natural number and their sum. 
//	Test Data : 7
//	Expected Output :
//	The first 7 natural number is :
//	1 2 3 4 5 6 7
//	The Sum of Natural Number upto 7 terms : 28
//	 
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter Range: ");
//	int range=sc.nextInt();
//	
//	int sum=0;
//	
//	for(int i=1;i<=range;i++) {
//		System.out.println(i);
//		
//		sum=i+sum;
//	}
//	System.out.println("The Sum is : "+sum);
	
//	****************************************************************
	
//	4. Write a program in java to read 10 numbers from keyboard and find their sum and average.  
//	Test Data :
//	Input the 10 numbers :
//	Number-1 :2
//	...
//	Number-10 :2
//	Expected Output :
//	The sum of 10 no is : 55
//	The Average is : 5.500000
//	 
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter Range: ");
//	float range=sc.nextInt();
//	
//	float sum=0f;
//	float avg=0f;
//	
//	for(int i=1;i<=range;i++) {
//		System.out.println(i);
//		
//		sum=i+sum;
//		avg=sum/range;
//	}
//	System.out.println("The Sum is : "+sum);
//	System.out.println("The Average is : "+avg);

//*********************************************************************
	
//	5. Write a program in java to display the cube of the number upto given an integer.  
//	Test Data :
//	Input number of terms : 5
//	Expected Output :
//	Number is : 1 and cube of the 1 is :1
//	Number is : 2 and cube of the 2 is :8
//	Number is : 3 and cube of the 3 is :27
//	Number is : 4 and cube of the 4 is :64
//	Number is : 5 and cube of the 5 is :125
//	 
	
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter an Integer: ");
//	int num=sc.nextInt();
//	
//	for(int i=1;i<=num;i++) {
//		
//		System.out.println("Number is : "+ i +" and cube of the "+i+" is : "+i*i*i);
//	}
	
//	******************************************************************
	
//	6. Write a program in java to display the multiplication table of a given integer.  
//	Test Data :
//	Input the number (Table to be calculated) : 15
//	Expected Output :
//	15 X 1 = 15
//	...
//	...
//	15 X 10 = 150
//	 
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter an Integer : ");
//	int num=sc.nextInt();
//	
//	for(int i=1;i<=10;i++) {
//		System.out.println(num+" * "+i+" = "+num*i);
//	}
//	****************************************************************
	
//	7. Write a program in java to display the multipliaction table vertically from 1 to 8.  
//	Test Data :
//	Input upto the table number starting from 1 : 8
//	Expected Output :
//	Multiplication table from 1 to 8
//	1x1 = 1, 2x1 = 2, 3x1 = 3, 4x1 = 4, 5x1 = 5, 6x1 = 6, 7x1 = 7, 8x1 = 8
//	...
//	1x10 = 10, 2x10 = 20, 3x10 = 30, 4x10 = 40, 5x10 = 50, 6x10 = 60, 7x10 = 70, 8x10 = 80
//	 
	
//	8. Write a program in java to display the n terms of odd natural number and their sum .  
//	Test Data
//	Input number of terms : 10
//	Expected Output :
//	The odd numbers are :1 3 5 7 9 11 13 15 17 19
//	The Sum of odd Natural Number upto 10 terms : 100

	Scanner sc=new Scanner (System.in);
	System.out.println("Enter a number : ");
	int n=sc.nextInt();
		
	int sum=0;
	for(int i=1;i<n*2;i++) {
		if(i%2!=0) {

	System.out.println(i);
sum=sum+i;
}
		}
		
System.out.println("The Sum is: "+sum);
	}
}

