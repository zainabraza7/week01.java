import java.util.Scanner;

public class ques2 {



        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int number = input.nextInt();

            int sum = 0;

            while (number != 0) {
                int digit = number % 10; // last digit
                sum = sum + digit;
                number = number / 10;    // remove last digit
            }

            System.out.println("Sum of digits = " + sum);
        }
    }

