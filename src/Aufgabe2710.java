public class Aufgabe2710 {
    public static void main(String[] args) {
        String num = "51230100";

        System.out.println(removeTrailingZeros(num));
    }

    public static String removeTrailingZeros(String num) {
        char[] arr = num.toCharArray();
        int count = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) == '0') {
                count++;
            } else {
                break;
            }
        }
        char[] newArr = new char[arr.length - count];

        System.arraycopy(arr, 0, newArr, 0, newArr.length);

        return new String(newArr);
    }
}
