import java.util.Scanner;

public class week4lab04 {
    /*ques: Write a function that checks if an integer is a prime number,
    returns true if it is, otherwise false*/

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            sc.close();

            if (n <= 1) {
                System.out.println(n + " is not prime.");
            } else {
                boolean isPrime = true;

                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                         isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(n + " is prime.");
                } else {
                    System.out.println(n + " is not prime.");
                }
            }
        }

}
