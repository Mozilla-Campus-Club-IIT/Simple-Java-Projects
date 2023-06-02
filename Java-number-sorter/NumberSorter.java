package calculators;
import java.util.*;
import java.lang.*;
public class NumberSorter {
	public static void main(String[] args) {
		String numbers;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers with commas separating them: ");
		numbers = sc.next();
		String[] toParse = numbers.split(",");
		int[] num = new int[toParse.length];
		for(int i=0;i<toParse.length;i++) {
			num[i] = Integer.parseInt(toParse[i]);
		}
		Arrays.sort(num);	//uses the java.lang.* package
		System.out.println("The sorted group of numbers is:\n");
		for(int number: num) {
			System.out.print(number + " ");
		}
		sc.close();
	}
}
