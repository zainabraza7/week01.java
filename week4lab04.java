import java.util.Scanner;

public class week4lab03 {
    /*ques: Calculator class with overloaded functions for integer, double, max
         function with varying parameter count
          (returns max between two values and returns max among three values
         */


        public static void max1(int a, int b) {
            if (a > b) {
                System.out.println("Max: " + a);
            }
            else if (b > a) {
                System.out.println("Max: " + b);
            }
            else {
                System.out.println("Both numbers are equal: " + a);
            }
        }

        public static void max2(double a, double b, double c) {
            if (a > b && a > c) {
                System.out.println("Max: " + a);
            }
            else if (b > a && b > c) {
                System.out.println("Max: " + b);
            }
            else if (c > a && c > b) {
                System.out.println("Max: " + c);
            }
            else {
                System.out.println("All numbers are equal");
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first integer: ");
            int x = sc.nextInt();

            System.out.print("Enter second integer: ");
            int y = sc.nextInt();

            max1(x, y);

            System.out.print("Enter first double: ");
            double a = sc.nextDouble();

            System.out.print("Enter second double: ");
            double b = sc.nextDouble();

            System.out.print("Enter third double: ");
            double c = sc.nextDouble();

            max2(a, b, c);

            sc.close();
        }


              
