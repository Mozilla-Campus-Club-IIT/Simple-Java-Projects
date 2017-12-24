import java.util.Scanner;

public class Calculator{
	public static void main(String []args){
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Input first number:");
		int n1 = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Input second number:");
		int n2 = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the symbol of the arithmetic operator you want(+,-,*,/,%) : ");
		String symbol = sc3.nextLine();
		
		switch(symbol){
			case "+":
				System.out.println(Integer.toString(n1)+"+"+Integer.toString(n2)+"="+(n1+n2));
				break;
			case "-":
				System.out.println(Integer.toString(n1)+"-"+Integer.toString(n2)+"="+(n1-n2));
				break;
			case "*":
				System.out.println(Integer.toString(n1)+"*"+Integer.toString(n2)+"="+(n1*n2));
				break;
			case "/":
				System.out.println(Integer.toString(n1)+"/"+Integer.toString(n2)+"="+(n1/n2));
				break;
			case "%":
				System.out.println(Integer.toString(n1)+" mod "+Integer.toString(n2)+"="+(n1%n2));
				break;
			default:
				System.out.println("You entered an invalid arithmetic operator");
		}
	}
}