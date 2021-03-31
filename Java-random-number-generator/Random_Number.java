import java.util.*;
public class Random_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter starting  range: ");
        int min=sc.nextInt();
        System.out.println("enter end range: ");
        int max=sc.nextInt();
        double a=Math.random()*(max-min+1)+min;
        System.out.println("thre randome number between "+min+" and "+max+" is "+a);
    }

}
