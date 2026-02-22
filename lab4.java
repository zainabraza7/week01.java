public class lab4 {
        public static void main(String[] args) {

            int[] scores = {92, 88, 76, 83, 97};

            int sum = 0;

            for (int i = 0; i < scores.length; i++) {
                sum = sum + scores[i];
            }

            double average = (double) sum / scores.length;

            System.out.println("Average score: " + average);
        }

}
