public class week4lab02 {
        public static void main(String[] args) {

            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            for (int i = 0; i < 2; i++) {      // rows
                for (int j = 0; j < 3; j++) {  // columns
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

}
