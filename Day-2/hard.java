public class hard {
    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        int count = 10, unique = 9, available = 9;

        for (int i = 2; i <= n && available > 0; i++) {
            unique *= available;
            count += unique;
            available--;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println("Count of unique digits: " + countNumbersWithUniqueDigits(n)); // 91
    }
}

