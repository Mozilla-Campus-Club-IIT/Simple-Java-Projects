import java.util.*;
public class SqArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Input length of the square = ");
		int length = sc.nextInt();
		System.out.println("Area of the square = "+(Math.pow(length, 2)));
		sc.close();
	}

}
