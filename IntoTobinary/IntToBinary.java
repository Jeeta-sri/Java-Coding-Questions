import java.util.Scanner;

public class IntToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking integer string input
        System.out.print("Enter an integer: ");
        String numStr = sc.nextLine();

        // Convert string to integer
        int num = Integer.parseInt(numStr);

        // Convert integer to binary string
        String binaryStr = Integer.toBinaryString(num);

        // Output
        System.out.println("Binary representation: " + binaryStr);

        sc.close();
    }
}
