import java.util.Scanner;
public class Square_Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the Square: ");
        Double a=sc.nextDouble();
        Double Total=a*a;
        System.out.println("the Area of sqare of size "+a+" is "+Total);
    }
}
