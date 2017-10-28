import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle");
        double length = in.nextInt();
        System.out.println("Enter the width of the Rectangle");
        double width = in.nextInt();
        System.out.println("Area of the Rectangle : "+(length*width));
    }
}
