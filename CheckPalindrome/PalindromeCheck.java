public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        int num = 121;

        // String palindrome
        String revStr = new StringBuilder(str).reverse().toString();
        if(str.equals(revStr))
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is NOT a Palindrome");

        // Numeric palindrome
        int original = num, rev = 0, temp = num;
        while(temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if(original == rev)
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is NOT a Palindrome");
    }
}
