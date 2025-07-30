import java.util.Scanner;

public class Problem1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int or=num;
		int sum=0;
		int temp=num;
		int n=0;
		
		while(num>0) {
			temp=temp/10;
			n++;
		}
		temp=num;
		
		while(temp>0) {
			int d=temp%10;
			sum=(int) (sum+Math.pow(d, n));
			temp=temp/10;
		}
		
		if(or==sum) {
			System.out.println("Armstrong number");

		}else {
			System.out.println("not armstrong number");

		}
	}
}
