import java.util.Scanner;
public class Multiplication {
    public static void main(String[]args)
	{
        	Scanner sc=new Scanner(System.in);
        	System.out.println("enter first number: ");
        	int num1=sc.nextInt();
		System.out.println("enter second number: ");
        	int num2=sc.nextInt();
		int Total=num1*num2;
		System.out.println("the Multiplication of "+num1+" and "+num2+" is "+Total);
	}
}
