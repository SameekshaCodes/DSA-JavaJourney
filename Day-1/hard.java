public class hard {
    public static boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0x55555555) != 0;
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println("Is power of 4? " + isPowerOfFour(num)); // Output: true
    }
}
// This code defines a method to check if a number is a power of four using bit manipulation.
