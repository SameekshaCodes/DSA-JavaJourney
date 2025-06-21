public class easy {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 54, b = 24;
        System.out.println("GCD is: " + gcd(a, b)); // Output: 6
    }
}
// This code defines a class `easy` with a method `gcd` that calculates the greatest common divisor of two integers using the Euclidean algorithm.