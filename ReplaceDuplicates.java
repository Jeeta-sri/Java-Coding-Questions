import java.util.*;

public class ReplaceDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '_') continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = '_';
                }
            }
        }

        System.out.println("After replacing duplicates: " + new String(arr));
        sc.close();
    }
}
