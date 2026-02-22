import java.util.Scanner;

public class lab3 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int rows, cols;

            System.out.print("Enter number of rows: ");
            rows = input.nextInt();

            System.out.print("Enter number of columns: ");
            cols = input.nextInt();

            int[][] A = new int[rows][cols];
            int[][] B = new int[rows][cols];
            int[][] C = new int[rows][cols];

            System.out.println("Enter elements of Matrix A:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    A[i][j] = input.nextInt();
                }
            }

            System.out.println("Enter elements of Matrix B:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    B[i][j] = input.nextInt();
                }
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                }
            }

            System.out.println("Resultant Matrix C (A + B):");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }

}
