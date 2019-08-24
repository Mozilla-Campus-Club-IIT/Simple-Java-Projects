import java.util.Scanner;
import java.util.Random;





public class NumberGenerator {

	 private	int maximum;
	 private	int minimum;

		public NumberGenerator(int max, int min) {

			this.maximum = max;
			this.minimum = min;


		}


		public static void scanner () {

			Scanner scan = new Scanner(System.in);
			System.out.println("Please give a maximum number");
			int maxi = scan.nextInt();

			System.out.println("Please give a minimum number");
			int mini = scan.nextInt();

			Random m = new Random();

			int rand = m.nextInt(maxi);
			System.out.println(rand);

			if (rand==maxi) {
				 rand = m.nextInt(maxi);
				System.out.println(rand);
			}
			else if(rand==mini){

				rand = m.nextInt(maxi);
				System.out.println(rand);

			}



	}


		public static void main(String[] args) {

			for(int i = 0; i <=100;i++) {

			scanner();
			}





		}
}
