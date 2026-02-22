import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {-5, 9, 0, 1, 20, 3, 91, 17};
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++){
            int n = i;
            while(n>0 && arr[n] < arr[n-1] ){
                int temp = arr[n];
                arr[n] = arr[n-1];
                arr[n-1] = temp;
                n--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
//сложность O(n2)
//память О(1)