import java.util.Scanner;
public class SqArea {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side of the square");
        double side = sc.nextDouble();
        double area = (side*side);
        System.out.println("The area of square with side length " + side + " is " + area);

    }

}