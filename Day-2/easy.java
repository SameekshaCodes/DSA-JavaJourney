public class easy {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int rev = 0, temp = x;

        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        return rev == x;
    }

    public static void main(String[] args) {
        int num = 121;
        System.out.println("Is Palindrome? " + isPalindrome(num)); // true
    }
}
// This code defines a method to check if a number is a palindrome by reversing the number and comparing it with the original.
