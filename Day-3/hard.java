import java.util.Arrays;

public class hard {
    public static int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) xor ^= num;

        int diffBit = xor & (-xor);
        int a = 0, b = 0;

        for (int num : nums) {
            if ((num & diffBit) == 0)
                a ^= num;
            else
                b ^= num;
        }

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        System.out.println("Unique numbers: " + Arrays.toString(singleNumber(nums))); // Output: [3,5]
    }
}
// This code defines a class `hard` with a method `singleNumber` that finds two unique numbers in an array where every other number appears twice.
