import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Input elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter k (from last): ");
        int k = sc.nextInt();

        // Normalize k
        k = k % n;  
        int rotateIndex = n - k;  // starting index for rotation (0-based)

        // Rotation using new array
        int rotated[] = new int[n];
        int j = 0;
        for (int i = rotateIndex; i < n; i++) rotated[j++] = arr[i];
        for (int i = 0; i < rotateIndex; i++) rotated[j++] = arr[i];

        // Print result
        System.out.println("Rotated Array: " + Arrays.toString(rotated));
    }
}
