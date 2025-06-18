public class medium {
    public static int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        int num = 38;
        System.out.println("Single digit sum: " + addDigits(num)); // Output: 2
    }
}
// This code defines a method to compute the single-digit sum of a number using the digital root concept.
