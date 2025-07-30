import java.util.Scanner;

public class Text {
	public static void main(String[] args) {

//	1.
//	********
//	********
//	********
//	********
//	********

//	for(int i=1;i<=5;i++) {
//		for(int j=1;j<=8;j++) {
//			System.out.print("*");
//		}
//	System.out.println();
//	}

//	2.
//	*
//	**
//	***
//	****
//	*****
// Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n=sc.nextInt();
//			for(int i=1;i<=n;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}

//	3.
//	*****
//	****
//	***
//	**
//	* 
//
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a number: ");
//	int n=sc.nextInt();
//	
//	for(int i=1;i<=n;i++) {
//		for(int j=n;j>=i;j--) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}

//	4.
//	1
//	22
//	333
//	4444
//	55555
//

//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter a number: ");
//	int n=sc.nextInt();
//	
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(i);
//		}
//		System.out.println();
//	}

//	5.
//	1
//	12
//	123
//	1234
//	12345
//
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j);
		}
		System.out.println();
	}

//	6.
//	54321
//	4321
//	321
//	21
//	1
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number:");
//		int n = sc.nextInt();
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = n; j >= i; j--) {
//				System.out.print(j);
//
//			}
//			System.out.println();
//		}

//	7.
//	12345
//	1234
//	123
//	12
//	1
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter a number"); int
		 * n=sc.nextInt();
		 * 
		 * for(int i=5;i>=1;i--) { for(int j=1;j<=i;j++) { System.out.print(j); }
		 * System.out.println();
		 * 
		 * }
		 */
		/*
		 * 8 A AB ABC ABCD ABCDE
		 * 
		 * char i,j; for( i='A';i<='E';i++) { for( j='A';j<=i;j++) {
		 * System.out.print(j); } System.out.println(); }
		 */

//		9.    *
//		     **
//		    ***
//		   ****  
//        *****
//	    Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n=sc.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			for(int s=i;s<=n-1;s++) {
//				System.out.print(" ");
//								}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//
//			}
//			System.out.println();
//		}

//	10.
//	*****
//	 ****
//	  ***
//	   **
//	    *
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//        int n=sc.nextInt();
//        
//        for(int i =1;i<=n;i++) {
//        	for(int s=1;s<=n-1;s++) {
//        		System.out.print(" ");
//        	}
//        	for(int j=1;j<=n;j++) {
//        		System.out.print("*");
//        	}
//    		System.out.println();
//
//        }
//		
//		12.
//	     *
//	    * *
//	   * * *
//	  * * * *
//	 * * * * * 
//
//	12. 
//	    *
//	   ***
//	  *****
//	 *******
//	*********
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int n = sc.nextInt();
//
//		for (int i = 1; i <= n; i++) {
//			for (int s = 1; s <= n - 1; s++) 
//				System.out.print(" ");
//			
//			for (int j = 1; j <= i; j++) 
//				System.out.print("*");
//			
//			for (int k = 1; k <= i-1; k++) 
//				System.out.print("*");
//			
//			System.out.println();
//		}
//		}
//	13.
//	 * * * * *
//	  * * * *
//	   * * *
//	    * *
//	     *
//
//	14.
//	    1
//	   121
//	  12321
//	 1234321
//	123454321
//
//	15.
//	       *
//	      * * 
//	     * * *
//	    * * * *
//	     * * * 
//	    * * * *
//	   * * * * *
//	  * * * * * *
//	   * * * * * 
//	  * * * * * *
//	 * * * * * * *
//	* * * * * * * *
//	    * * * *
//	    * * * *
//	    * * * *
//	    * * * *
//
//	16. 
//	**********
//	*        *
//	* *    * *
//	*  *  *  *
//	*   *    *
//	*  *  *  *
//	* *    * *
//	*        *
//	**********
//
//	17.
//
//	*********************
//	*********************
//	***     ******     **
//	***     ******     **
//	*********************
//	*********************
//	*****          ******
//	*****          ******
//	*********************
//	*********************
//	
//	
	}
}
