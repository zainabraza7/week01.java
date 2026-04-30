import java.util.ArrayList;
import java.util.Collections;

public class reverseelement {
    public static void main(String args[]) {
        ArrayList<Integer> l1= new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        System.out.println("l1 (before reverse): "+ l1);
        Collections.reverse(l1);
        System.out.println("l1 (after reverse): "+ l1);



    }
}
