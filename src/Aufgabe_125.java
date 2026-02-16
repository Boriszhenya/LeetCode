public class Aufgabe_125 {


    public static boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        String cleaned = s.replaceAll("[^\\p{L}\\p{N}]+", "").toLowerCase();

        System.out.println(cleaned);
        char[] chars = cleaned.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }


        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String t = "race a car";
        String u = " ";

        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(t));
        System.out.println(isPalindrome(u));
    }

}
