import java.util.Scanner;

public class lab07 {

        public static void main(String[] args) {
            int arr[]= {14,27,35,48,56};
            int target=35;

            boolean found=false;

            for(int i=0;i<arr.length;i++) {
                if(arr[i]==target) {
                    System.out.println("Found at index: "+i);
                    found=true;
                    break;
                }
            }
            if(!found) {
                System.out.println("Not Found");
            }

        }


}
