package pack1;

import java.util.Scanner;

public class throwException {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age < 18) {
			throw new RuntimeException("not elegible for vote");

		} else {
			System.out.print(" elegible for voting");

		}
	}
}
