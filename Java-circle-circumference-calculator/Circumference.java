import java.util.Scanner;
public class Circumference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of the circle: ");
        int r=sc.nextInt();
        Double result=2*3.14*r;
        System.out.println("the Circumference of circle with radius "+r+" is "+result);
    }
}
