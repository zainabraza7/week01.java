import java.util.Scanner;

public class lab02 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = input.nextLine();

            String reversed = "";

            for (int i = inputString.length() - 1; i >= 0; i--) {
                reversed = reversed + inputString.charAt(i);
            }

            if (inputString.equals(reversed)) {
                System.out.println("It is a Palindrome.");
            } else {
                System.out.println("It is not a Palindrome.");
            }
        }

}
