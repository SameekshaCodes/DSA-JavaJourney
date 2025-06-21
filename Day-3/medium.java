
public class medium {
    public static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) isPrime[i] = true;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i)
                    isPrime[j] = false;
            }
        }

        int count = 0;
        for (boolean prime : isPrime)
            if (prime) count++;

        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Prime count less than " + n + " = " + countPrimes(n)); // Output: 4
    }
}

