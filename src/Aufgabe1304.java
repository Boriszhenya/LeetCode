import java.util.Arrays;

public class Aufgabe1304 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(sumZero(n)));

    }

    public static int[] sumZero(int n) {
        int[] resultArr = new int[n];
        int x = n / 2;
        for (int i = 0; i < x; i++) {
            resultArr[i] = i +1;
            resultArr[n-i-1] = resultArr[i] *(-1);
        }
        return resultArr;
    }

}
