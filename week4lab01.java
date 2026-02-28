public class week4lab01 {
        public static void main(String args[]) {

            //ques:matrix addition func

            int[][] mat1 = {{1, 2, 3},
                    {4, 5, 6}};
            int[][] mat2 = {{6, 2, 13},
                    {8, 4, 1}};
            int[][] result = {{0, 0, 0},
                    {0, 0, 0}};
            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[i].length; j++) { //agr hum sure hai ke length 3 hee hai col ki tou j<3 likh skte
                    System.out.format("Setting value for i=%d and j=%d\n", i, j); //format jb lgta jb %d use krna hota
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
            }
            for (int i = 0; i < mat1.length; i++) {//row no of times
                for (int j = 0; j < mat1[i].length; j++) { //col no of times
                    System.out.print(result[i][j] + " ");
                    result[i][j] = mat1[i][j] + mat2[i][j];
                }
                System.out.println(" ");
            }


    }

}
