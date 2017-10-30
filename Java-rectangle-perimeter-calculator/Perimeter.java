import java.util.Scanner;
public class Perimeter {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.print("input length:");
        Double length = sc.nextDouble();
        System.out.print("input wdith:");
        Double width = sc.nextDouble();

        Double perimeter= (length+width)*2;
        System.out.println("Perimeter "+ perimeter);
    }
}
