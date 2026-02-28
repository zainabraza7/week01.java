import java.util.Scanner;

public class week4lab05 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            int[][] mat1 = new int[rows][cols];
            int[][] mat2 = new int[rows][cols];

            //  first mat
            System.out.println("Enter elements of first mat:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    mat1[i][j] = sc.nextInt();
                }
            }

            //  second mat
            System.out.println("Enter elements of second mat:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    mat2[i][j] = sc.nextInt();
                }
            }

            // Addition of matrices
            System.out.println("sum of matrices:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print((mat1[i][j] + mat2[i][j]) + " ");
                }
                System.out.println();
            }

            // Subtraction of matrices
            System.out.println("difference of matrices:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print((mat1[i][j] - mat2[i][j]) + " ");
                }
                System.out.println();
            }

            // Transpose of first matrix
            System.out.println("\nTranspose of first matrix:");
            for (int j = 0; j < cols; j++) {
                for (int i = 0; i < rows; i++) {
                    System.out.print(mat1[i][j] + " ");
                }
                System.out.println();
            }

            // Check symmetry (only square matrix)
            if (rows == cols) {
                boolean symmetric = true;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        if (mat1[i][j] != mat1[j][i]) {
                            symmetric = false;
                            break;
                        }
                    }
                }

                // Print using simple if-else
                if (symmetric) {
                    System.out.println("\nFirst matrix is symmetric");
                } else {
                    System.out.println("\nFirst matrix is not symmetric");
                }

                // Sum of diagonal elements
                int diagsum = 0;
                for (int i = 0; i < rows; i++) {
                    diagsum += mat1[i][i];
                }
                System.out.println("Sum of diagonal elements: " + diagsum);
            } else {
                System.out.println("\nMatrix is not square , cannot check symmetry or diagonal sum");
            }

            sc.close();
        }

}
