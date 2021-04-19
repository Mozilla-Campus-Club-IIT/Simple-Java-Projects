import java.util.Scanner;

public class randomNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nums range: ");
        int range = scan.nextInt();

        int randNum = (int) (Math.random() * range+1);

        System.out.println(randNum);
    }
}
