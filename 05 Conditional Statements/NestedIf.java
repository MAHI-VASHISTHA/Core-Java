package Statements;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();

		if (age > 12) {
			if (age < 20) {
				System.out.println("Teenagers");
			} else {
				if (age < 35) {
					System.out.println("Young");
				} else {
					if (age < 60) {
						System.out.println("Uncle");
					} else {
						if (age < 80) {
							System.out.println("Old");

						} else {
							System.out.println("Bhagwan ka dhyn krro");

						}
					}
				}
			}
		} else {
			if (age > 5) {
				System.out.println("Kid");

			} else {
				if (age > 0) {
					System.out.println("Baby");

				} else {
					System.out.println("not matched");

				}
			}
		}
	}
}
