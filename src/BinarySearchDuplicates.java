
    public class BinarySearchDuplicates {

        // first index i such that a[i] >= x
        static int lowerBound(int[] a, int x) {
            int l = 0, r = a.length; // [l, r)
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (a[mid] < x) l = mid + 1;
                else r = mid;
            }
            return l;
        }

        // first index i such that a[i] > x
        static int upperBound(int[] a, int x) {
            int l = 0, r = a.length; // [l, r)
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (a[mid] <= x) l = mid + 1;
                else r = mid;
            }
            return l;
        }

        // returns [first, last] of x, or [-1, -1] if not found
        static int[] findRange(int[] a, int x) {
            int first = lowerBound(a, x);
            if (first == a.length || a[first] != x) return new int[]{-1, -1};
            int last = upperBound(a, x) - 1;
            return new int[]{first, last};
        }

        public static void main(String[] args) {
            int[] a = {1, 2, 3};
            int x = 3;

            int[] range = findRange(a, x);
            System.out.println("first=" + range[0] + ", last=" + range[1]);

            if (range[0] != -1) {
                int count = range[1] - range[0] + 1;
                System.out.println("count=" + count);
            }
        }
    }
