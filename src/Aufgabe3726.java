public class Aufgabe3726 {
    public static void main(String[] args) {
        long n = 1000300600;

        System.out.println(removeZeros(n));
    }

    public static long removeZeros(long number) {
        if (number < 10) {
            return number;
        }
        long newNumber = 0;
        int i = 0;
        while (number > 0) {
            if (number % 10 == 0) {
                number /= 10;
                continue;
            }
            newNumber = (long) (newNumber + number % 10 * Math.pow(10, i));
            i++;
            number /= 10;
        }
        return newNumber;
    }
}