public class Aufgabe2578 {
    public static void main(String[] args) {
        int num1 = 4325;
        System.out.println(splitNum(num1));

    }

    public static int splitNum(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        for (int j = digits.length - 1; j >= 1; j--) {

            for (int i = 0; i < j; i++) {
                if (digits[i] > digits[i + 1]) {
                    int temp = digits[i];
                    digits[i] = digits[i + 1];
                    digits[i + 1] = temp;
                }
            }
        }
        int number1 = 0;
        int number2 = 0;
        for (int i = 0; i < digits.length; i++) {
            if (i % 2 == 0) {
                number1 = number1 * 10 + digits[i];
            } else {
                number2 = number2 * 10 + digits[i];
            }
        }
        return number1 + number2;
    }
}
// порахувати всі парні числа і всі непарні і мінімум з цих двох сум буде нашим результатом

