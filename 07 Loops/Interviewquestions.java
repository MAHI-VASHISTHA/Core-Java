import java.util.Arrays;
import java.util.Scanner;

public class Interviewquestions {

	public static void main(String[] args) {

//Question-1 palindrome number.

//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number ");
//		int a=sc.nextInt();
//		
//		int rem=0;
//		int rev=0;
//		int org=a;
//		
//		while(a>0) {
//		 rem=a%10;
//		 rev=rev*10+rem;
//		
//		 a=a/10;
//		
//		}
//		 if(org==rev) {
//			 System.out.println("palindrone number");
//			 
//		 }
//		 else {
//			 System.out.println(" not palindrone number");
//
//		 }

//Question-2 Anagram String.

//		String s1="listen";
//		String s2="silent";
//		
//		s1=s1.replace(" ", " ");
//		s2=s2.replace(" ", " ");
//     s1=s1.toLowerCase();
//     s2=s2.toLowerCase();
//
//     char[] a=s1.toCharArray();
//     char[] b=s2.toCharArray();
//
//     Arrays.sort(a);
//     Arrays.sort(b);
//     
//     boolean result=Arrays.equals(a, b);
//     
//     if(result==true) {
//System.out.println("string is anagram");
//     }
//     else {
//    	 System.out.println("string is not anagram");
//
//     }
//Question-3 sorted array.
//		int temp = 0;
//		int arr[] = { 50, 30, 10, 20, 40 };
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		for (int i : arr) {
//			System.out.println(i);
//		}

//Question-4 Reversed an array.

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter element's value ");
//		int arr[] = new int[5];
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = arr[arr.length - 1 - i];
//		}
//		for (int i : arr) {
//			System.out.print(i+" ");
//		}

//Question-5 Factorial.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int a=sc.nextInt();

		int m=1;
		for(int i=1;i<=a;i++) {
			m=m*i;

		}
		System.out.print(m);

	}
}