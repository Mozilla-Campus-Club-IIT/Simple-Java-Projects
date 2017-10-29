import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input radius:");
        Double radius = sc.nextDouble();
        Double area= (Math.PI)*(Math.pow(radius,2));
        System.out.println("the total area is: "+ area);
    }
}
