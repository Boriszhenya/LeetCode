public class Aufgabe1812 {
    public static void main(String[] args) {
        String coordinates = "h3";
        System.out.println(squareIsWhite(coordinates));
    }

    public static boolean squareIsWhite(String coordinates) {
        char[] arrChar = coordinates.toCharArray();
        int first = arrChar[0] - 96;
        int second = arrChar[1] - '0';
        return (((first + second)) % 2) == 1;
    }
}