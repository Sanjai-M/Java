import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        Map<Integer, Integer> digitCounts = countDigitOccurrences(n);

        for (Map.Entry<Integer, Integer> entry : digitCounts.entrySet()) {
            System.out.println("Digit " + entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }

    public static Map<Integer, Integer> countDigitOccurrences(int n) {
        Map<Integer, Integer> digitCounts = new HashMap<>();

        while (n > 0) {
            int digit = n % 10;
            digitCounts.put(digit, digitCounts.getOrDefault(digit, 0) + 1);
            n /= 10;
        }

        return digitCounts;
    }
}
    