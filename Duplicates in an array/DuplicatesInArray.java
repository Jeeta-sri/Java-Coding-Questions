import java.util.HashSet;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 5, 5, 8, 9, 12, 1};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num))  // if already present
                duplicates.add(num);
        }

        System.out.println("Duplicates: " + duplicates);
    }
}
