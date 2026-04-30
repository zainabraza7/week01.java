import java.util.ArrayList;

public class removenegnum1 {

    public static void main(String[] args) {
        //remove all neg num from an arraylist
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(-3);
        integers.add(8);
        integers.add(-1);
        integers.add(12);
        integers.add(-7);
        integers.add(4);

        System.out.println("Input: " + integers);
        for(int i =0; i<integers.size(); i++){
            if (integers.get(i) < 0) {
                integers.remove(i);
                i--;
            }
        }


        System.out.println("Output" + integers);

    }
}
