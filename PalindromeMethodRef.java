
import java.util.function.Predicate;

public class PalindromeMethodRef {

    public static boolean checkPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public static void main(String[] args) {
        String str = "racecar";

    
        Predicate<String> isPalindrome = PalindromeMethodRef::checkPalindrome;

        if (isPalindrome.test(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}