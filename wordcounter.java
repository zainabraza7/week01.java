import java.util.HashMap;

public class wordcounter {

    public static void main(String[] args) {

        String sentence = "the cat and the dog and the bird";
        String[] words = sentence.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        // Frequency count
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }

        System.out.println("Frequency Map");

        // Print result
        for (String word : map.keySet()) {
            System.out.println(word + ": " + map.get(word));
        }//or
        // System.out.println(map);
    }
}
