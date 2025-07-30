import java.util.Scanner;

public class RangePrime {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int range = sc.nextInt();
//		int count=0;

		for (int r = 1; r <= range; r++) {
			int count = 0;
			
			for (int i = 1; i <= r; i++)
				if (r % i == 0) 
					count++;

					if(count==2) {
						System.out.println(r);
					}
					
				}

	}}

	
