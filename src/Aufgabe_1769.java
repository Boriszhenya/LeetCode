import java.util.Arrays;

public class Aufgabe_1769 {
    public int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];
        int[] numberOfOnes = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++) {
            numberOfOnes[i] = boxes.charAt(i) - '0';
        }
        for (int i = 0; i < numberOfOnes.length; i++) {
            int sum = 0;
            for (int j = 0; j < numberOfOnes.length; j++) {
                if (numberOfOnes[j] == 1) {
                    sum += Math.abs(i - j);
                }
            }
            result[i] = sum;
        }

        return result;
    }


    public static void main(String[] args) {

       String boxes = "110";
       String boxes2 = "001011";
        System.out.println(Arrays.toString(new Aufgabe_1769().minOperations(boxes)));
        System.out.println(Arrays.toString(new Aufgabe_1769().minOperations(boxes2)));
    }
}
