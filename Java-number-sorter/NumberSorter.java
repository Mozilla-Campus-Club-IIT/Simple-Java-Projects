import java.util.Scanner;


/**
 * NumberSorter.java
 * <P> This is a simple command line application which gets three comma (,)
 * separated numbers and sorts them in ascending order and prints them. </p>
 * Date: 2019-08-21
 * Time: 1:05 AM
 * Package: com.example.numbersorter
 *
 * @author Mohamad Jayyusi - https://github.com/jayyusi
 * @version 1.0
 */
public class NumberSorter {

      public static void main(String[] args) throws Exception{

        String input;
        //we will store the numbers here
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        // two variable to store the index of each comma occurrence.
        int firstOccOfComma, secondOccOfComma;
        //receive input from user
        Scanner scanner = new Scanner(System.in);

        //give the user instructions
        System.out.println("Please enter three numbers separated by commas, like so:\n" +
                "1, 2 , 3");

        //read the user input
        input = scanner.nextLine();
        //index of first comma ?
        firstOccOfComma = input.indexOf(",");
        //index of second comma ?
        secondOccOfComma = input.indexOf(",", firstOccOfComma + 1);
        //parse the numbers
        try {
            //strip() removes any spaces the user enters
            number1 = Integer.parseInt(input.substring(0, firstOccOfComma).strip());
            number2 = Integer.parseInt(input.substring(firstOccOfComma + 1, secondOccOfComma).strip());
            number3 = Integer.parseInt(input.substring(secondOccOfComma + 1).strip());
        }catch (Exception e){
            System.out.println("Something is wrong with the input");
            System.out.println(input.substring(0, firstOccOfComma));
            System.out.println(input.substring(firstOccOfComma + 1, secondOccOfComma));
            System.out.println(input.substring(secondOccOfComma + 1));
            System.out.println("number1 = " + number1);
            System.out.println("number2 = " + number2);
            System.out.println("number3 = " + number3);
            e.printStackTrace();
        }

        if(number1 >  number2 && number1 > number3){
            if(number2 > number3){
                System.out.println("ascending order " + number3 +"," + number2 +","+ number1);
            }else {
                System.out.println("ascending order " + number2 +"," + number3 +","+ number1);
            }
        }else if(number2 > number1 && number2 > number3){
            if(number1 > number3){
                System.out.println("ascending order " + number3 +"," + number1 +","+ number2);
            }else {
                System.out.println("ascending order " + number1 +"," + number3 +","+ number2);
            }
        }else if(number3> number1 && number3 > number2){
            if(number1>number2){
                System.out.println("ascending order " + number2 +"," + number1 +","+ number3);
            }else {
                System.out.println("ascending order " + number1 +"," + number2 +","+ number3);
            }
        }else if(number1==number2 && number2==number3) {
            System.out.println("All numbers are equal ");
        }else{
            System.out.println("Something went wrong ...");
        }
    }
}
