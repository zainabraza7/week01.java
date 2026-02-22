public class lab05 {
        public static void main(String[] args) {
            int[] values = {46, 22, 72, 84, 75, 12};


            int largest = values[0];

            for (int i = 1; i < values.length; i++) {
                if (values[i] > largest) {
                    largest = values[i];
                }
            }

            System.out.println("Largest: " + largest);
        }

}
