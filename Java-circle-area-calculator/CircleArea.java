import java.util.Scanner;
public class CircleArea {
    public static void main(String[]args)
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("enter the radius of the circle: ");
			int r=sc.nextInt();
			Double Area=3.14*r*r;
			System.out.println("the Area of circle with radius "+r+" is "+Area);
	}
}
