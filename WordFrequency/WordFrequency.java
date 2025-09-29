package ReverseWords.WordFrequency;
public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "hello world hello java world hello";
        String word = "hello"; 
        int count = 0;

        // Split sentence into words
        String[] words = sentence.split(" ");
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }

        System.out.println("Frequency of '" + word + "': " + count);
    }
}

