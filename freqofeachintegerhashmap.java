import java.util.*;
public class freqofeachintegerhashmap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,5,3,3,6,1};
        HashMap<Integer, Integer> freq=new HashMap<>();
        for(int el:arr){  //el is element
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }else{
                freq.put(el,freq.get(el)+1);
            }
        }
        System.out.println("Frequency Map");

        System.out.println(freq.entrySet());

    }
}
