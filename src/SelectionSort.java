import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {3, -7, 1, 9, 2, -13, 17, 0};

        System.out.println(Arrays.toString(arr));
        int max;
        int position;
        for (int j = arr.length-1; j >=1; j--) {
            max = arr[0];
            position = 0;
            for (int i = 0; i <= j; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    position = i;
                }
            }
            int temp = arr[j];
            arr[j] = max;
            arr[position] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
