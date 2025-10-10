import java.util.Scanner;
public class SubstringCheckD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring to check: ");
        String sub = sc.nextLine();

        if (str.contains(sub)) {
            System.out.println("✅ Substring is present!");
        } else {
            System.out.println("❌ Substring is not present!");
        }

        sc.close();
    }
}


