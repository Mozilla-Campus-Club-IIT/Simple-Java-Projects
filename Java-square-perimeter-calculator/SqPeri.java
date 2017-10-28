import java.util.Scanner;
public class SqPeri {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side of the square");
        double side = sc.nextDouble();
        double perimeter = (side*4);
        System.out.println("The perimeter of square with side length " + side + " is " + perimeter);

    }

}
