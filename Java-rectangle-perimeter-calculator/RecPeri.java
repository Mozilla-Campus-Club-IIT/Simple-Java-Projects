import java.util.Scanner;
public class RecPeri {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle");
        double width = sc.nextDouble();
        double perimeter = ((length*2)+(width*2));
        System.out.println("The perimeter of rectangle with length " + length + " and width " + width + " is " + perimeter);

    }

}
