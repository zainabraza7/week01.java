import java.util.Scanner;

public class lab03 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int sum = 0;
            int number;

            while (true) {
                System.out.print("Enter a number (0 to stop): ");
                number = input.nextInt();

                if (number == 0) {
                    break;
                }

                sum = sum + number;
            }

            System.out.println("Total sum = " + sum);
        }

}
