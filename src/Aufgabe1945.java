public class Aufgabe1945 {
    public static void main(String[] args) {

        String s1 = "iiii";
        int k1 = 1;
        String s2 = "leetcode";
        int k2 = 2;
        String s3 = "zbax";
        int k3 = 2;

        System.out.println(getLucky(s1, k1));
        System.out.println(getLucky(s2, k2));
        System.out.println(getLucky(s3, k3));

    }


    public static int getLucky(String s, int k) {

        char[] arr = s.toCharArray();
        int sum = 0;
        for (char c : arr) {
            int num = c - 'a' + 1;
            if (num > 9) {
                sum += sumNumber(num);
            } else {
                sum += num;
            }
        }
        if (k != 1) {
            for (int i = 1; i <= k - 1; i++) {
                sum = sumNumber(sum);
            }
        }
        return sum;
    }

    public static int sumNumber(int num) {
        if (num < 10)
            return num;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
