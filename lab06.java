public class lab06 {
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};

            int evencount = 0;
            int oddcount = 0;

            for (int i = 0; i < nums.length; i++) {


                if (nums[i] % 2 == 0) {
                    evencount++;

                } else {

                    oddcount++;
                }
            }

            System.out.println("Even count: " + evencount);
            System.out.println("Odd count: " + oddcount);
        }

}
