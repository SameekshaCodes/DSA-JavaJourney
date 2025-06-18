public class easy {
    public static int countDigits(int num) {
        int count = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            if (digit != 0 && num % digit == 0) {
                count++;
            }
            temp /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int num = 122;
        System.out.println("Dividing digits count: " + countDigits(num)); // Output: 2
    }
}
