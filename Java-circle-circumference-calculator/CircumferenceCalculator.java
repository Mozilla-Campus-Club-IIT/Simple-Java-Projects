import java.util.Scanner;
import java.lang.Math;

public class CircumferenceCalculator{
	public static void main(String[] args){  
		Scanner input = new Scanner(System.in);
    System.out.println("Input the radius: ");
    double radius = input.nextDouble();
    System.out.println("The circumference is "+(2*Math.PI*radius));
	}
}
