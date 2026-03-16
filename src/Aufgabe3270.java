public class Aufgabe3270 {
    public static void main(String[] args) {
        int num1 = 1140;
        int num2 = 1851;
        int num3 = 2057;
        System.out.println(generateKey(num1, num2, num3));
    }

    public static int generateKey(int num1, int num2, int num3) {
        int divisor = 1000;
        int result = 0;
        while (divisor > 0) {
            result = result + (minimum(num1 / divisor, num2 / divisor, num3 / divisor) * divisor);
            num1 = num1 % divisor;
            num2 = num2 % divisor;
            num3 = num3 % divisor;
            divisor = divisor / 10;
        }
        return result;
    }

    public static int minimum(int num1, int num2, int num3) {
        if (num1 == 0 || num2 == 0 || num3 == 0) {
            return 0;
        }
        if (num1 <= num2 && num1 <= num3) {
            return num1;
        }
        if (num2 <= num1 && num2 <= num3) {
            return num2;
        }

            return num3;

    }
}


