import java.util.Scanner;

public class RectanglePerimeter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int perimeter = 0;
        int width, length;

        System.out.print("Enter the length : ");
        length = input.nextInt();

        System.out.print("Enter the width : ");
        width = input.nextInt();

        perimeter = 2 * (length + width);

        System.out.println("Perimeter of rectangle is : " + perimeter);

    }

}
