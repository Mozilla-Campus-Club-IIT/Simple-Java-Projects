package gitHub;

import java.util.Scanner;

public class SquareArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Input the length if the square..");
		int sqr=sc.nextInt();
		System.out.println("Square Area = "+(sqr*sqr));
		sc.close();
	}

}
