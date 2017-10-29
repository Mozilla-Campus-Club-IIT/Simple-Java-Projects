import java.util.scanner;
public class Circumference
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius of the circle: ");
        int radius = scanner.nextInt();
        int area = 2 * Math.PI * radius
        System.out.println("the circumference of a circle with a radius of " + radius + " is " + " area");
    }
}
