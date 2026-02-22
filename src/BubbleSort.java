import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-13, -7, 0, 1, 2, 3, 9, 17};

        System.out.println(Arrays.toString(arr));

        for (int j = arr.length - 1; j >= 1; j--) {
            boolean is_sorted = true;
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i+1]) {
                    is_sorted = false;
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            if (is_sorted) {
                break;

            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
//сложность O(n2)
//память О(1)