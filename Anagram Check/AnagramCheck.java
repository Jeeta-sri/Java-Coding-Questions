import java.util.*;

public class AnagramCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Convert to lowercase & char arrays
        char[] a = str1.toLowerCase().toCharArray();
        char[] b = str2.toLowerCase().toCharArray();

        // If lengths differ, not anagram
        if (a.length != b.length) {
            System.out.println("Not Anagram");
            return;
        }

        // Sort both and compare
        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        sc.close();
    }
}
