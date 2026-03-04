import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr1 = {-12, -5, 45, -15, -12, 8, 34};
        int[] arr2 = {6, 4, 6, 2, 9, 9, 1};

        mergeSort(arr1);

        System.out.println(Arrays.toString(mergeSort(arr2)));

    }

    public static int[] merge(int[] leftArr, int[] rightArr) {
        int[] resultArr = new int[leftArr.length + rightArr.length];
        int leftIndex = 0;
        int rightIndex = 0;
        //int i = 0;

//        while (leftIndex < leftArr.length && rightIndex < rightArr.length) {
//            if (leftArr[leftIndex] <= rightArr[rightIndex]) { // <= чтобы сортировка была стабильной
//                resultArr[i++] = leftArr[leftIndex++];
//            } else {
//                resultArr[i++] = rightArr[rightIndex++];
//            }
//        }
//
//        while (leftIndex < leftArr.length) {
//            resultArr[i++] = leftArr[leftIndex++];
//        }
//
//        while (rightIndex < rightArr.length) {
//            resultArr[i++] = rightArr[rightIndex++];
//        }

        for (int i = 0; i < resultArr.length; i++) {
            if (leftIndex < leftArr.length && rightIndex < rightArr.length) {
                if (leftArr[leftIndex] < rightArr[rightIndex]) {
                    resultArr[i] = leftArr[leftIndex];
                    leftIndex++;
                } else {
                    resultArr[i] = rightArr[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArr.length) {
                resultArr[i] = leftArr[leftIndex];
                leftIndex++;
            } else {
                resultArr[i] = rightArr[rightIndex];
                rightIndex++;
            }
        }
        return resultArr;
    }


    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int[] arrLeft = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] arrReight = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        arrLeft = mergeSort(arrLeft);
        arrReight = mergeSort(arrReight);

        return  merge(arrLeft, arrReight);
    }
}