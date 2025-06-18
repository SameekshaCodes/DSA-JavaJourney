public class medium {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result *= 26;
            result += (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        String col = "AB";
        System.out.println("Column number: " + titleToNumber(col)); // 28
    }
}
// This code defines a method to convert a column title (like in Excel) to its corresponding number using base-26 conversion.
