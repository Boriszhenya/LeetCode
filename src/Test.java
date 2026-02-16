public class Test {

    int maxI; // индекс начала пары максимума
    int minI; // индекс начала пары минимума
    Test(int maxI, int minI) { this.maxI = maxI; this.minI = minI; }
}

class Pairs {
    public static Test findMaxMinAdjacentPairs(int[] a) {
        if (a == null || a.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        long maxSum = (long)a[0] + a[1];
        long minSum = maxSum;
        int maxI = 0, minI = 0;

        for (int i = 1; i < a.length; i++) {
            long sum = (long)a[i - 1] + a[i];

            if (sum > maxSum) {
                maxSum = sum;
                maxI = i - 1;
            }
            if (sum < minSum) {
                minSum = sum;
                minI = i - 1;
            }
        }

        return new Test(maxI, minI);
    }

    // пример использования
    public static void main(String[] args) {
        int[] a = {5, -2, 10, 1, -7, -8, 3};

        Test r = findMaxMinAdjacentPairs(a);

        System.out.println("Max adjacent pair: [" + a[r.maxI] + ", " + a[r.maxI + 1] + "]");
        System.out.println("Min adjacent pair: [" + a[r.minI] + ", " + a[r.minI + 1] + "]");
    }
}