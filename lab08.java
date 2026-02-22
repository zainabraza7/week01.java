public class lab08 {
        public static void main(String[] args) {
            // Given array
            int[] arr = {1, 2, 3, 4, 5, 6};

            // Print array before reversal
            System.out.print("before: ");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            int start = 0;
            int end = arr.length-1;

            while(start < end) {

                int temporary = arr[start];
                arr[start] = arr[end];
                arr[end] = temporary;

                start++;
                end--;
            }

            System.out.print("after:  ");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

}
