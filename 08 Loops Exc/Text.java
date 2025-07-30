import java.util.Scanner;

public class Text {
	public static void main(String[] args) {

//		1. take a number from user and find factorial of that
//	   let num=5  -> 5*4*3*2*1 = 120

//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a Number: ");
//	int n=sc.nextInt();
//	
//	int m=1;
//	
//	for(int i=n;i>0;i--) {
//		System.out.println(i);
//		m=i*m;
//	}
//	System.out.println("Result : "+m);

//	*********************************************************************************

//	2. print fibonnaci series let n=10
//	    0 1 1 2 3 5 8 13 21 34 

//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a number: ");
//	int n=sc.nextInt();
//	int sum=0;
//
//	for(int i=0;i<=n;i++) {
//		
//		
//	}
//  System.out.println(sum);
//
//**********************************************************************************************

//	3.check whether a no. is 3 digit armstrong or not i.e
//	    153 = 1*1*1 + 5*5*5 + 3*3*3 => 153

//	4. take a number from user and count how many digits are in that number eg.4589 -> 4
//  Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a number: ");
//	int n=sc.nextInt();
//	int num=0;
//	
//	while(n>0) {
//		n=n/10;
//		num++;
//
//	}
//	System.out.println(num);

//	*********************************************************************************

//	5. take a number from user and count how many odd digits are in that number eg.45897 -> 3
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a Number : ");
//	int num=sc.nextInt();
//	int odd=0;
//	
//	while(num>0)
//	{
//		int count=num%10;
//		if(count%2!=0) {
//			odd++;
//		}
//		num=num/10;
//	}
//	System.out.println(odd);

//	************************************************************************************

//	6. take a number from user and count how many even digits are in that number eg.4589 -> 2

//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a Number: ");
//	int num=sc.nextInt();
//	
//	int even=0;
//	while(num>0) {
//		int count=num%10;
//		if(count%2==0) {
//			even++;
//		}
//		num=num/10;
//	}
//	System.out.println(even);
//	
//	***********************************************************************************

//	7. take a number from user and sum of the even digits in that number eg.4589 -> 12

//	Scanner sc=new Scanner (System.in);
//	System.out.println("Enter a Number :");
//	int num=sc.nextInt();
//	
//	int sum=0;
//	while(num>0) {
//		int count=num%10;
//		if(count%2==0) {
//			sum=count+sum;
//		}
//		num=num/10;
//	}
//	System.out.println("Sum of even numbers: "+sum);

//	***********************************************************************************

// 8. take a number from user and sum of the odd digits in that number eg.4589
		// -> 14

//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a Number: ");
//	int num=sc.nextInt();
//	
//	int sum=0;
//	while(num>0) {
//		int count=num%10;
//		if(count%2!=0) {
//			sum=sum+count;
//		}
//		num=num/10;
//	}
//	System.out.println("Sum of odd numbers : "+sum);

//	************************************************************************************

//9. take a ,n,d from user and print the A.P (arithematic progression)    
//	    let a=10  n=6 d=3
//	    a  a+d  a+2d a+3d a+4d  a+5d . .
//	    10  13  16 19 22 25 Ans.

//	int a=10;
//	int n=6;
//	int d=3;
//	
//	for(int i=1;i<=5;i++) {
//		for(int j=2;j<=
//		System.out.println(a);
//	}
//	***********************************************************************************

//10. take a number from user and check whether it is a prime number or not.

//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a number: ");
//	int num=sc.nextInt();
//	int count=0;
//	
//	for(int i=1;i<=num;i++) {
//		if(num%i==0) {
//			count++;
//		}
//	}
//		if(count==2) {
//			System.out.println(num+" is a prime number");
//		}
//		else {
//			System.out.println(num+" is not prime number");
//
//		}
//	*******************************************************************************************

//	11.Take a number from user and count it's length and the sum of odd and even numbers 
//	present in that number then let these 2 results as first and second term
//	and make fibonnaci series from them till n(the length of that number) term.
//	    let num=321578        OddSum=16 evenSum=10  digitLen=6
//	    16 10 26 36 62 98 Ans.

//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a number:");
//	int num=sc.nextInt();
//	int even=0;
//	int odd=0;
//	while(num>0) {
//		int rem=num%10;
////		
//		if(rem%2==0) {
//			even=even+rem;
//		}
//		if (rem%2!=0) {
//			odd=odd+rem;
//		}
//		num=num/10;
//	}
//	System.out.println("Sum of even digits: "+even);
//	System.out.println("Sum of odd digits: "+odd);

//	**************************************************************************************
//	12. reverse a number 1234 -> 4321

//	Scanner sc =new Scanner(System.in);
//	System.out.println("Enter a number: ");
//	int num=sc.nextInt();
//	
//	int count=0;
//	while(num>0) {
//		int rem=num%10;
//		count=count*10+rem;
//		num=num/10;
//	}
//	System.out.println(count);

//	**************************************************************************************

//	13. check whether a no. is palindrome or not 
//	    i.e 12321 -> after reverse -> 12321

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number :");
//		int num = sc.nextInt();
//         int org_num=num;
//		int count=0;
//		while(num>0) {
//			int rem=num%10;
//			count=count*10+rem;
//			num=num/10;
//		}
//		if(count==org_num) {
//			System.out.println(count+" is palindron number!");
//		}
//		else {
//			System.out.println(count+" is not palindron number!");
//		}
//	*******************************************************************************
//	
//	14.Write a java program to print all the perfect numbers from 1 to 1000 eg. 28 => 1+2+4+7+14 =28

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int num =sc.nextInt();
//		
//		for(int i=1;i<=num;i++) {
//			if(num%i==0) {
//				System.out.println(i);
//	
//			}
//		}
//*****************************************************************************************		
//	15.Write a java program to find the greatest common divisor of two numbers.

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter first number ");
//		int num1=sc.nextInt();
//		System.out.println("Enter second number ");
//		int num2=sc.nextInt();
//
//		int greatest=0;
//		for(int i=1;i<=num1;i++) {
//				if(num1%i==0&&num2%i==0) {
//					greatest=i;
//			}
//		}
//		System.out.println(greatest);
//
//		*******************************************************************************************

//	16.Write a java program to find the least common multiple of two numbers.
//	17.Find and print all the factors of a given number using a for loop.

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num=sc.nextInt();
//		
//		for(int i=1;i<=num;i++) {
//			if(num%i==0) {
//			System.out.println(i);
//			}
//		}

//********************************************************************************************		

//	18.Calculate the sum of the factors of a given number using a for loop.

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num = sc.nextInt();
//
//		int sum=0;
//		for(int i=1;i<=num;i++) {
//			if(num%i==0) {
//				System.out.println(i);
//				sum=sum+i;
//			}
//		}
//		System.out.println("Sum of all factors: "+sum); 
//		
//*********************************************************************************************	
		
//	19.Implement prime factorization of a number using a for loop Print prime factors with exponents.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
//	20.how to check whether a number is a strong number or not eg.
//	    Input number is 145.
//	    Let’s check it by using the logic of the Strong number.
//	    The factorial of 1, 4 and 5 is 1, 24 and 120.
//	    The sum of these factorials = 1 + 24 + 120 = 145

	}
}
