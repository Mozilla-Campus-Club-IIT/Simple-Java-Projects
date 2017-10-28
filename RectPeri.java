import java.util.Scanner;

public class RectPeri {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter breadth = ");
		int breadth = sc.nextInt();
		System.out.print("Enter length = ");
		int length = sc.nextInt();
		System.out.println("Area = "+(breadth*2 + length*2));
		sc.close();
	}

}

