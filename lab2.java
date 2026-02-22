import java.util.Scanner;

public class lab2 {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int[][] matrix = new int[3][3];
            int[][] transpose = new int[3][3];

            System.out.println("Enter elements of 3x3 matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    transpose[i][j] = matrix[j][i];
                }
            }
            System.out.println("\nOriginal Matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("\nTranspose Matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
            }
        }

}
