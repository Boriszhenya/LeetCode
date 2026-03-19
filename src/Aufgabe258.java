public class Aufgabe258 {
    public static void main(String[] args) {
        int num = 3423438;
        System.out.println(addDigits(num));
        System.out.println(sumNumbers(num));

    }


    public static int addDigits(int num) {
        int sum = 0;
        if (num <= 9) {
            return num;
        } else {

            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
            if (sum > 9) {
                sum = addDigits(sum);
            } else
                return sum;
        }
        return sum;
    }


    public static int sumNumbers(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + (num - 1) % 9;
    }
}
