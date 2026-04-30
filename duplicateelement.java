public class duplicateelement {
    public static void main(String args[]) {
        Integer arr[] =  {1, 2, 3, 2, 4, 5, 3, 6, 1};
        System.out.println("Input:{1, 2, 3, 2, 4, 5, 3, 6, 1} ");
        System.out.print("Output:{ ");
        boolean first = true;   // tracks if it's the first duplicate

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
//j=i+1 isliye q ke isse increase krna like agr i=0 se start horha tou hamesha j isse ek zyada se start hoga
                if (arr[i] == arr[j]) {
                    if (!first) {
                        System.out.print(", ");
                    }
                    System.out.print(arr[i]);
 //arr[i] pehle 1 hai then arr[i] 2 then 3 j poora run hoga 1 se lekr 8 elements tk
                    first = false;
                    break;
                }
            }
        }

        System.out.print("}");
    }
}


