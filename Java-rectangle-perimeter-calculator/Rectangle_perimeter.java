import java.util.Scanner;

import java.util.Scanner;
public class Rectangle_perimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length of the rectangle: ");
        Double l=sc.nextDouble();
        System.out.println("enter breadth of the rectangle: ");
        Double b=sc.nextDouble();
        Double Total=2*(l+b);
        System.out.println("the perimeter of the Rectangle of length "+l+" and breath "+b+" is "+Total);
    }
    
}
