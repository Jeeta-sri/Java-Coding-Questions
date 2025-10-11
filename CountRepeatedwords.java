import java.util.*;

public class CountRepeatedwords {
    public static void main(String[] args) {
        String sentence = "Problem solving through innovation is what I love, I love to solve real world problem.";
        String[] words = sentence.toLowerCase().split("\\W+");

        Map<String, Integer> map = new HashMap<>();
        for (String w : words)
            map.put(w, map.getOrDefault(w, 0) + 1);

        System.out.println("Repeated words:");
        for (var e : map.entrySet())
            if (e.getValue() > 1)
                System.out.println(e.getKey() + " → " + e.getValue());
    }
}



