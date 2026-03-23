public class Aufgabe202 {
    public static void main(String[] args) {
        int  n = 1111111;

        System.out.println(isHappy(n));
        //System.out.println(sumSquares(n));
    }


    public static boolean isHappy(int n) {

        int res = sumSquares(n);
        if (res == 1 || res == 7) {
            return true;
        } else if (res == n) {
         return false;
        } else {
            isHappy(res);
        }
        return false;
    }

    public static int sumSquares(int num) {
        if (num < 10)
            return num * num;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            sum += rem * rem;
        }
        return sum;
    }
}
