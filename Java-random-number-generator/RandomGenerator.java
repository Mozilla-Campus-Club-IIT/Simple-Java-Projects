package calculators;
import java.util.*;
public class RandomGenerator {
	final int DEFAULT = 0;
	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		int min,max,generatedNumber;
		boolean generateLoop = true;
		
		System.out.println("Enter the minimum value: ");
		min = get.nextInt();
		System.out.println("Enter the maximum value: ");
		max = get.nextInt();
		
		Random random = new Random();
		String regen; 
		while(generateLoop) {
			generatedNumber = random.nextInt(max - min + 1) + min;
			System.out.println(generatedNumber);
			
			System.out.println("Regenerate? (Y/N): ");
			regen = get.next().toUpperCase();
			if(regen.charAt(0) == 'Y') {
				
			}
			else {
				generateLoop = false;
			}
		
		}
		get.close();
	}
}
