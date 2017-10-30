import java.util.Scanner;

public class Rectangle {
    public static void main (String [] args){
    
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length");
        double length = in.nextDouble();
        System.out.println("enter the width");
        double width= in.nextDouble();
        System.out.println("Rectangle Perimeter :"+(2*(width+length)));

    }

}
