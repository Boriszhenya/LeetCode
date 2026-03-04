import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {5, -12, 4, 2, 4, 3, 6, 4, 6, 2, 9, 9, 1};
        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max + " " + min);
        int delta = max - min;
        int[] helpArray = new int[delta + 1];

        System.out.println(Arrays.toString(helpArray));
        for (int i = min; i <= max; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {

                    helpArray[i - min] += 1;
                }
            }
        }
        System.out.println(Arrays.toString(helpArray));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < helpArray.length; i++) {
            int count = helpArray[i];
            for (int j = 0; j < count; j++) {
                list.add(i + min);
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }

}
//сложность O(n2)
//память О(1)

