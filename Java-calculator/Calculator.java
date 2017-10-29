import java.util.Scanner;

public class Question5{
	public static void main(String []args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input first number:");
		int n1 = reader.nextInt();

		System.out.println("Input second number:");
		int n2 = reader.nextInt();
		
		System.out.println("Enter the symbol of the arithmetic operator you want(+,-,*,/,%): "): ")
		int symbol = reader.nextLine();
		
		switch(symbol){
			case "+":
				System.out.println(Integer.toString(n1)+"+"+Integer.toString(n2)+"="+(n1+n2));
				break;
			case "-":
				System.out.println(Integer.toString(n1)+"+"+Integer.toString(n2)+"="+(n1+n2));
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