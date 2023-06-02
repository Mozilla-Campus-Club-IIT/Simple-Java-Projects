package calculators;
import java.util.*;
public class CircleArea {
	final double PI = 3.14;
	Scanner getRequest = new Scanner(System.in);
	double radius, area;
	public CircleArea() {
			System.out.println("Enter the radius of the circle: ");
			radius = getRequest.nextDouble();
			area = PI * radius * radius;
			System.out.println("The area of the circle is: " + area);
	}
	public static void main(String[] args) {
		CircleArea newRequest = new CircleArea();
	}
}
