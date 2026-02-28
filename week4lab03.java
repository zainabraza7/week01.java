import java.util.Scanner;

public class week4lab03 {
    /*ques: Calculator class with overloaded functions for integer, double, max
         function with varying parameter count
          (returns max between two values and returns max among three values
         */

    // Integer addition
    int add(int a, int b) {
        return a + b;
    }

    // Double addition
    double add(double a, double b) {
        return a + b;
    }

    // Max between two integers
    int max(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Max among three integers
    int max(int a, int b, int c) {
        int m = a;
        if (b > m)
            m = b;
        if (c > m)
            m = c;
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        week4lab03 c = new week4lab03();  // Object of the same class

        System.out.println("INTEGER OPERATIONS");
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        System.out.println("Sum = " + c.add(num1, num2));
        System.out.println("Max of two = " + c.max(num1, num2));

        System.out.print("Enter third integer: ");
        int num3 = sc.nextInt();

        System.out.println("Max of three = " + c.max(num1, num2, num3));

        System.out.println(" DOUBLE OPERATIONS");
        System.out.print("Enter first double: ");
        double d1 = sc.nextDouble();

        System.out.print("Enter second double: ");
        double d2 = sc.nextDouble();

        System.out.println("Sum = " + c.add(d1, d2));

        sc.close();
    }
}