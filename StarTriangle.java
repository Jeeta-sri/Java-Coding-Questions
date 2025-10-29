public class StarTriangle {
    public static void main(String[] args) {
        int rows = 4; // number of rows in the triangle

        for (int i = 1; i <= rows; i++) {
            // print spaces before stars
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // move to the next line
            System.out.println();
        }
    }
}
