import java.util.Scanner;

public class JavaNumberSorter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count, temp;

        System.out.print("Enter number of elements you want in the array : ");
        count = input.nextInt();

        int[] number = new int[count];

        System.out.print("Enter array elements : ");
        for (int i = 0; i < count; i++) {
            number[i] = input.nextInt();
        }

        input.close();

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (number[i] > number[j]) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }

        System.out.print("Array Elements in Ascending Order : ");
        for (int i = 0; i < count - 1; i++) {
            System.out.print(number[i] + ", ");
        }

        System.out.print(number[count - 1]);

    }

}
