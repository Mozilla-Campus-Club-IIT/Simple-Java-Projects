package gitHub;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input a Number...");
		int num=sc.nextInt();
		if (num%2==0)
		{
			System.out.println("Your Number is an even Number....");
		}
		else
		{
			System.out.println("Your Number is an Odd Number....");
		}

	}

}
