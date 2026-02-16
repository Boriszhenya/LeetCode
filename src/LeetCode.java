import java.util.*;

public class LeetCode {
    public static void main(String[] args) {
        int[] weights1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days1 = 5;

        int[] weights2 = {3, 2, 2, 4, 1, 4};
        int days2 = 3;

        int[] weights3 = {1, 2, 3, 1, 1};
        int days3 = 4;

        System.out.println(shipWithinDays(weights1, days1));
        System.out.println(shipWithinDays(weights2, days2));
        System.out.println(shipWithinDays(weights3, days3));

    }

    static int shipWithinDays(int[] weights, int days) {
        //int res = 0;
        int sum = 0;
        int max = 0;
        int ser = 0;

        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }
        System.out.println("sum=" + sum);
        ser = sum / days;
        System.out.println("ser=" + ser);
        for (int i = 0; i < weights.length; i++) {
            int res = weights[i];
            for (int j = i + 1; j < weights.length; j++) {
                res += weights[j];
                System.out.println("res=" + res);
                if (res > sum / days) {
                    i=j-1;
                    break;
                }
            }
            if (res > max) {
                max = res;
            }
            System.out.println("max=" + max);

        }
        return max;
    }
}
