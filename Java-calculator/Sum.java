import java.util.Scanner;
public class Sum
{
static void add()	
   {
	Scanner sc=new Scanner(System.in);
        	System.out.println("enter first number: ");
        	int num1=sc.nextInt();
		System.out.println("enter second number: ");
        	int num2=sc.nextInt();
		int Total=num1+num2;
		System.out.println("the sum of "+num1+" and "+num2+" is "+Total);
	
    }
	public static void main(String[]args)
	{
             Sum.add();
        	
	}
}
