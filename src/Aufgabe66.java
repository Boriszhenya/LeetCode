import java.util.Arrays;

public class Aufgabe66 {
    public static void main(String[] args) {
        int[] digits = {2, 3, 9};
        System.out.println(Arrays.toString(plusOne(digits)));


    }

    public static int[] plusOne(int[] digits) {
        boolean flag = true;
        int count = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                flag = false;
                break;
            }
            count++;
        }
        if (flag) {
            int[] newArr = new int[digits.length + 1];
            newArr[0] = 1;
            return newArr;
        }

        int pos = digits.length - count;
        for (int i = digits.length-1; i >=pos; i--) {
            digits[i]=0;
        }
        digits[pos-1] = digits[pos-1]+1;

        return digits;
    }
}
