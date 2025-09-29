public class SwapNum{
    public static void main(String[] args) {
        int a = 16, b = 21;

        a = a + b;  
        b = a - b;  
        a = a - b;  

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
