package test;

import java.util.Scanner;

public class test {

	public static void main(String args[]) {
 		Scanner sc = new Scanner(System.in);
		System.out.println("enter your Number:");
		int input = sc.nextInt();

		if (input % 2 == 0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");

	}

}
