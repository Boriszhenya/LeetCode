import java.util.Arrays;

public class Aufgabe1399 {
    public static void main(String[] args) {
        int num1 = 24;

        System.out.println(countLargestGroup(num1));
    }

    public static int countLargestGroup(int n) {
        int[] resultSum = new int[37];

        for (int i = 1; i <= n; i++) {
            int sum = sumAllDigitsInNumber(i);
            resultSum[sum]++;
        }
        int maximum = 0;
        for (int i = 0; i < resultSum.length; i++) {
            if (resultSum[i] > maximum) {
                maximum = resultSum[i];
            }
        }

        int count = 0;
        for (int i = 0; i < resultSum.length; i++) {
            if (resultSum[i] == maximum) {
                count++;
            }
        }
        return count;
    }

    public static int sumAllDigitsInNumber(int nunber) {
        int sum = 0;

        while (nunber > 0) {
            sum += nunber % 10;
            nunber /= 10;
        }
        return sum;
    }
}