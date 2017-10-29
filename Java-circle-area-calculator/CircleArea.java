import java.util.Scanner;
import java.lang.Math;

public class CircleAreaCalculator{ 
	public static void main(String[] args){  
     Scanner input = new Scanner(System.in);
     System.out.println("Input the radius: ");
     double radius = input.nextDouble();
     System.out.println("The circle area is "+(Math.PI*(radius*radius)));
	}
}
