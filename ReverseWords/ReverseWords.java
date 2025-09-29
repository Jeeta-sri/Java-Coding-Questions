package ReverseWords;
public class ReverseWords {
    public static void main(String[] args) {
        String str = "Hello I'm Srijeeta";
        
        // Split words
        String[] words = str.split(" ");
        String result = "";

        // Reverse order of words
        for(int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }

        System.out.println("Reversed: " + result.trim());
    }
}

