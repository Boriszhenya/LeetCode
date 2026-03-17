import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aufgabe989 {
    public static void main(String[] args) {
        int[] num = {2,1,5};
        int k = 806;
        System.out.println(addToArrayForm(num, k));

    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int[] newArr = new int[num.length];
        int i = newArr.length - 1;
        while (k > 0) {
            newArr[i] = k % 10;
            k = k / 10;
            i--;
        }
        int over = 0;
        for (int j = num.length - 1; j >= 0; j--) {
            int rez = num[j] + newArr[j] + over;
            if (rez > 9) {
                list.addFirst(rez % 10);
                over = 1;
            } else  {
                list.addFirst(rez);
                over = 0;
            }
        }
        if (over == 1) {
            list.addFirst(over);
        }
        return list;
    }

}
