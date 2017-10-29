import java.util.Scanner;

public class RectangleAreaCal {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter width:");
        double width= input.nextDouble();
        System.out.print("Enter height:");
        double height= input.nextDouble();
        double area = height*width;
        System.out.println("Area of the Rectangle is: "+area);


    }
}