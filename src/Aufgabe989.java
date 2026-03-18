import java.util.ArrayList;
import java.util.List;

public class Aufgabe989 {
    public static void main(String[] args) {
        int[] num = {1,2};
        int k = 4567;
        System.out.println(addToArrayForm1(num, k));


    }

    public static List<Integer> addToArrayForm1(int[] num, int k) {
        List<Integer> resultList = new ArrayList<>();
        List<Integer> listNum = new ArrayList<>();
        List<Integer> listNumK = new ArrayList<>();

        while (k > 0) {
            listNumK.addFirst(k % 10);
            k = k / 10;
        }

        for (int number : num) {
            listNum.add(number);
        }

        while (listNumK.size() != listNum.size()) {
            if (listNumK.size() > listNum.size()) {
                listNum.addFirst(0);
            } else {
                listNumK.addFirst(0);
            }
        }

        int over = 0;
        for (int j = listNum.size() - 1; j >= 0; j--) {
            int rez = listNum.get(j) + listNumK.get(j) + over;
            if (rez > 9) {
                resultList.addFirst(rez % 10);
                over = 1;
            } else {
                resultList.addFirst(rez);
                over = 0;
            }
        }
        if (over == 1) {
            resultList.addFirst(over);
        }
        return resultList;
    }
}