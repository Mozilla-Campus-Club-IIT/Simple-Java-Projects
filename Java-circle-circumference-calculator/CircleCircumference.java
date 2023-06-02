package calculators;
import java.util.*;
public class CircleCircumference {
	final double PI = 3.14;
	Scanner getRequest = new Scanner(System.in);
	double radius, circ;
	public CircleCircumference() {
			System.out.println("Enter the radius of the circle: ");
			radius = getRequest.nextDouble();
			circ = 2 * PI * radius ;
			System.out.println("The area of the circle is: " + circ);
	}
	public static void main(String[] args) {
		CircleCircumference newRequest = new CircleCircumference();
	}
}
