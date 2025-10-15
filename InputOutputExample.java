import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Take another input
        System.out.print("Enter your age: ");
    
        int age = sc.nextInt();

        // Display the output
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        sc.close(); // Close the scanner
    }
}

    

