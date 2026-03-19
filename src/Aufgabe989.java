import java.util.LinkedList;
import java.util.List;

public class Aufgabe989 {
    public static void main(String[] args) {
        int[] num = {0};
        int k = 4567;
        System.out.println(addToArrayForm1(num, k));


    }

    public static List<Integer> addToArrayForm1(int[] num, int k) {
        LinkedList<Integer> result = new LinkedList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }

            result.addFirst(k % 10);
            k /= 10;
        }

        return result;
    }
}