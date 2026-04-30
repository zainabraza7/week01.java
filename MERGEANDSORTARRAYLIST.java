import java.util.ArrayList;
import java.util.Collections;

public class MERGEANDSORTARRAYLIST {
    public static void main(String[] args){
    ArrayList <Integer> l1=new ArrayList<>();
    ArrayList <Integer> l2=new ArrayList<>();
    ArrayList <Integer> l3= new ArrayList<>();

        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(7);

        l2.add(2);
        l2.add(4);
        l2.add(6);
        l2.add(8);



        l3.addAll(l1);
        l3.addAll(l2);


        System.out.println("Before Sorting: " + l3);
        Collections.sort(l3);
        System.out.println("After Sorting: " + l3);


    }


}
