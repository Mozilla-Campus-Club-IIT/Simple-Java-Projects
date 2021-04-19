import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Radius: ");
        float radius = scan.nextFloat();

        float area = (float) (Math.PI * Math.pow(radius, 2));

        System.out.println("Area: " + area);
    }
}
