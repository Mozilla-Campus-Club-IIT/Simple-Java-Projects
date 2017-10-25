import java.util.Scanner;

public class ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int x = sc.nextInt();
		if (x%2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}
	}
}