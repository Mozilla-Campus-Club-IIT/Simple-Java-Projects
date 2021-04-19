import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);

          System.out.print("First sides length: ");
          float sideOne = scan.nextFloat();

          System.out.print("Second sides length: ");
          float sideTwo = scan.nextFloat();

          System.out.println("Perimeter: " + ((sideTwo+sideOne)*2));
   }
}
