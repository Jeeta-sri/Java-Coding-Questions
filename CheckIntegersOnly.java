import java.util.*;

public class CheckIntegersOnly {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList(1, 2, 3, 4, 5.6, "Hello", "yaa", 67);  // Try adding "Hi" or 3.5

        boolean allIntegers = list.stream().allMatch(e -> e instanceof Integer);

        if (allIntegers)
            System.out.println("List has only integers.");
        else
            System.out.println("List contains non-integer elements.");
    }
}
